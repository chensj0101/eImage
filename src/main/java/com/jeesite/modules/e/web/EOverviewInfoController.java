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
import com.jeesite.modules.e.entity.EOverviewInfo;
import com.jeesite.modules.e.entity.EStockRealtimePrice;
import com.jeesite.modules.e.entity.EStockholder;
import com.jeesite.modules.e.service.EOverviewInfoService;
import com.jeesite.modules.e.service.EStockRealtimePriceService;
import com.jeesite.modules.e.service.EStockholderService;

/**
 * 企业概况Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eOverviewInfo")
public class EOverviewInfoController extends BaseController {

	@Autowired
	private EOverviewInfoService eOverviewInfoService;
	@Autowired
	private EStockRealtimePriceService eStockRealtimePriceService;
	@Autowired
	private EStockholderService eStockholderService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EStockholder getEStockholder(String id, boolean isNewRecord) {
		return eStockholderService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EStockRealtimePrice getEStockRealtimePrice(String ename, boolean isNewRecord) {
		return eStockRealtimePriceService.get(ename, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EOverviewInfo get(String ename, boolean isNewRecord) {
		return eOverviewInfoService.get(ename, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eOverviewInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(EOverviewInfo eOverviewInfo, Model model) {
		model.addAttribute("eOverviewInfo", eOverviewInfo);
		return "modules/e/eOverviewInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eOverviewInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EOverviewInfo> listData(EOverviewInfo eOverviewInfo, HttpServletRequest request, HttpServletResponse response) {
		Page<EOverviewInfo> page = eOverviewInfoService.findPage(new Page<EOverviewInfo>(request, response), eOverviewInfo); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eOverviewInfo:view")
	@RequestMapping(value = "form")
	public String form(EOverviewInfo eOverviewInfo, EStockRealtimePrice eStockRealtimePrice, EStockholder eStockholder, Model model) {
		model.addAttribute("eOverviewInfo", eOverviewInfo);
		model.addAttribute("eStockRealtimePrice", eStockRealtimePrice);
		model.addAttribute("eStockholder", eStockholder);
		return "modules/e/eOverviewInfoForm";
	}

	/**
	 * 保存企业概况
	 */
	@RequiresPermissions("e:eOverviewInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EOverviewInfo eOverviewInfo) {
		eOverviewInfoService.save(eOverviewInfo);
		return renderResult(Global.TRUE, "保存企业概况成功！");
	}
	
	/**
	 * 删除企业概况
	 */
	@RequiresPermissions("e:eOverviewInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EOverviewInfo eOverviewInfo) {
		eOverviewInfoService.delete(eOverviewInfo);
		return renderResult(Global.TRUE, "删除企业概况成功！");
	}
	
}