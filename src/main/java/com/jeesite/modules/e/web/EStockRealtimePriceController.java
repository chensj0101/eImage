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
import com.jeesite.modules.e.entity.EStockRealtimePrice;
import com.jeesite.modules.e.service.EStockRealtimePriceService;

/**
 * 实时股价Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eStockRealtimePrice")
public class EStockRealtimePriceController extends BaseController {

	@Autowired
	private EStockRealtimePriceService eStockRealtimePriceService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EStockRealtimePrice get(String ename, boolean isNewRecord) {
		return eStockRealtimePriceService.get(ename, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eStockRealtimePrice:view")
	@RequestMapping(value = {"list", ""})
	public String list(EStockRealtimePrice eStockRealtimePrice, Model model) {
		model.addAttribute("eStockRealtimePrice", eStockRealtimePrice);
		return "modules/e/eStockRealtimePriceList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eStockRealtimePrice:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EStockRealtimePrice> listData(EStockRealtimePrice eStockRealtimePrice, HttpServletRequest request, HttpServletResponse response) {
		Page<EStockRealtimePrice> page = eStockRealtimePriceService.findPage(new Page<EStockRealtimePrice>(request, response), eStockRealtimePrice); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eStockRealtimePrice:view")
	@RequestMapping(value = "form")
	public String form(EStockRealtimePrice eStockRealtimePrice, Model model) {
		model.addAttribute("eStockRealtimePrice", eStockRealtimePrice);
		return "modules/e/eStockRealtimePriceForm";
	}

	/**
	 * 保存实时股价
	 */
	@RequiresPermissions("e:eStockRealtimePrice:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EStockRealtimePrice eStockRealtimePrice) {
		eStockRealtimePriceService.save(eStockRealtimePrice);
		return renderResult(Global.TRUE, "保存实时股价成功！");
	}
	
	/**
	 * 删除实时股价
	 */
	@RequiresPermissions("e:eStockRealtimePrice:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EStockRealtimePrice eStockRealtimePrice) {
		eStockRealtimePriceService.delete(eStockRealtimePrice);
		return renderResult(Global.TRUE, "删除实时股价成功！");
	}
	
}