/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.e.entity.ELogoInfo;
import com.jeesite.modules.e.service.ELogoInfoService;

/**
 * 商标信息Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eLogoInfo")
public class ELogoInfoController extends BaseController {

	@Autowired
	private ELogoInfoService eLogoInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ELogoInfo get(String id, boolean isNewRecord) {
		return eLogoInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eLogoInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(ELogoInfo eLogoInfo, Model model) {
		model.addAttribute("eLogoInfo", eLogoInfo);
		return "modules/e/eLogoInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eLogoInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ELogoInfo> listData(ELogoInfo eLogoInfo, HttpServletRequest request, HttpServletResponse response) {
		Page<ELogoInfo> page = eLogoInfoService.findPage(new Page<ELogoInfo>(request, response), eLogoInfo); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eLogoInfo:view")
	@RequestMapping(value = "form")
	public String form(ELogoInfo eLogoInfo, Model model) {
		model.addAttribute("eLogoInfo", eLogoInfo);
		return "modules/e/eLogoInfoForm";
	}

	/**
	 * 保存商标信息
	 */
	@RequiresPermissions("e:eLogoInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ELogoInfo eLogoInfo) {
		eLogoInfoService.save(eLogoInfo);
		return renderResult(Global.TRUE, "保存商标信息成功！");
	}
	
	/**
	 * 删除商标信息
	 */
	@RequiresPermissions("e:eLogoInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ELogoInfo eLogoInfo) {
		eLogoInfoService.delete(eLogoInfo);
		return renderResult(Global.TRUE, "删除商标信息成功！");
	}
	
}