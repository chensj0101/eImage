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
import com.jeesite.modules.e.entity.EPatentsInfo;
import com.jeesite.modules.e.service.EPatentsInfoService;

/**
 * 普通公司--专利信息表Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/ePatentsInfo")
public class EPatentsInfoController extends BaseController {

	@Autowired
	private EPatentsInfoService ePatentsInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EPatentsInfo get(String id, boolean isNewRecord) {
		return ePatentsInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:ePatentsInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(EPatentsInfo ePatentsInfo, Model model) {
		model.addAttribute("ePatentsInfo", ePatentsInfo);
		return "modules/e/ePatentsInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:ePatentsInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EPatentsInfo> listData(EPatentsInfo ePatentsInfo, HttpServletRequest request, HttpServletResponse response) {
		Page<EPatentsInfo> page = ePatentsInfoService.findPage(new Page<EPatentsInfo>(request, response), ePatentsInfo); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:ePatentsInfo:view")
	@RequestMapping(value = "form")
	public String form(EPatentsInfo ePatentsInfo, Model model) {
		model.addAttribute("ePatentsInfo", ePatentsInfo);
		return "modules/e/ePatentsInfoForm";
	}

	/**
	 * 保存普通公司--专利信息表
	 */
	@RequiresPermissions("e:ePatentsInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EPatentsInfo ePatentsInfo) {
		ePatentsInfoService.save(ePatentsInfo);
		return renderResult(Global.TRUE, "保存普通公司--专利信息表成功！");
	}
	
	/**
	 * 删除普通公司--专利信息表
	 */
	@RequiresPermissions("e:ePatentsInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EPatentsInfo ePatentsInfo) {
		ePatentsInfoService.delete(ePatentsInfo);
		return renderResult(Global.TRUE, "删除普通公司--专利信息表成功！");
	}
	
}