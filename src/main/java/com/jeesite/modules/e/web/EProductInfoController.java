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
import com.jeesite.modules.e.entity.EProductInfo;
import com.jeesite.modules.e.service.EProductInfoService;

/**
 * 普通公司--产品信息表Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eProductInfo")
public class EProductInfoController extends BaseController {

	@Autowired
	private EProductInfoService eProductInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EProductInfo get(String id, boolean isNewRecord) {
		return eProductInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eProductInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(EProductInfo eProductInfo, Model model) {
		model.addAttribute("eProductInfo", eProductInfo);
		return "modules/e/eProductInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eProductInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EProductInfo> listData(EProductInfo eProductInfo, HttpServletRequest request, HttpServletResponse response) {
		Page<EProductInfo> page = eProductInfoService.findPage(new Page<EProductInfo>(request, response), eProductInfo); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eProductInfo:view")
	@RequestMapping(value = "form")
	public String form(EProductInfo eProductInfo, Model model) {
		model.addAttribute("eProductInfo", eProductInfo);
		return "modules/e/eProductInfoForm";
	}

	/**
	 * 保存普通公司--产品信息表
	 */
	@RequiresPermissions("e:eProductInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EProductInfo eProductInfo) {
		eProductInfoService.save(eProductInfo);
		return renderResult(Global.TRUE, "保存普通公司--产品信息表成功！");
	}
	
	/**
	 * 删除普通公司--产品信息表
	 */
	@RequiresPermissions("e:eProductInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EProductInfo eProductInfo) {
		eProductInfoService.delete(eProductInfo);
		return renderResult(Global.TRUE, "删除普通公司--产品信息表成功！");
	}
	
}