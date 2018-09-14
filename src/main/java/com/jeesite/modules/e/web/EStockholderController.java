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
import com.jeesite.modules.e.entity.EStockholder;
import com.jeesite.modules.e.service.EStockholderService;

/**
 * 主要股东Controller
 * @author chensj
 * @version 2018-05-07
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eStockholder")
public class EStockholderController extends BaseController {

	@Autowired
	private EStockholderService eStockholderService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EStockholder get(String id, boolean isNewRecord) {
		return eStockholderService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eStockholder:view")
	@RequestMapping(value = {"list", ""})
	public String list(EStockholder eStockholder, Model model) {
		model.addAttribute("eStockholder", eStockholder);
		return "modules/e/eStockholderList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eStockholder:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EStockholder> listData(EStockholder eStockholder, HttpServletRequest request, HttpServletResponse response) {
		Page<EStockholder> page = eStockholderService.findPage(new Page<EStockholder>(request, response), eStockholder); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eStockholder:view")
	@RequestMapping(value = "form")
	public String form(EStockholder eStockholder, Model model) {
		model.addAttribute("eStockholder", eStockholder);
		return "modules/e/eStockholderForm";
	}

	/**
	 * 保存主要股东
	 */
	@RequiresPermissions("e:eStockholder:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EStockholder eStockholder) {
		eStockholderService.save(eStockholder);
		return renderResult(Global.TRUE, "保存主要股东成功！");
	}
	
	/**
	 * 删除主要股东
	 */
	@RequiresPermissions("e:eStockholder:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EStockholder eStockholder) {
		eStockholderService.delete(eStockholder);
		return renderResult(Global.TRUE, "删除主要股东成功！");
	}
	
}