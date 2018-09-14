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
import com.jeesite.modules.e.entity.ESponsors;
import com.jeesite.modules.e.service.ESponsorsService;

/**
 * 发起人/股东信息Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eSponsors")
public class ESponsorsController extends BaseController {

	@Autowired
	private ESponsorsService eSponsorsService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ESponsors get(String id, boolean isNewRecord) {
		return eSponsorsService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eSponsors:view")
	@RequestMapping(value = {"list", ""})
	public String list(ESponsors eSponsors, Model model) {
		model.addAttribute("eSponsors", eSponsors);
		return "modules/e/eSponsorsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eSponsors:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ESponsors> listData(ESponsors eSponsors, HttpServletRequest request, HttpServletResponse response) {
		Page<ESponsors> page = eSponsorsService.findPage(new Page<ESponsors>(request, response), eSponsors); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eSponsors:view")
	@RequestMapping(value = "form")
	public String form(ESponsors eSponsors, Model model) {
		model.addAttribute("eSponsors", eSponsors);
		return "modules/e/eSponsorsForm";
	}

	/**
	 * 保存发起人/股东信息
	 */
	@RequiresPermissions("e:eSponsors:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ESponsors eSponsors) {
		eSponsorsService.save(eSponsors);
		return renderResult(Global.TRUE, "保存发起人/股东信息成功！");
	}
	
	/**
	 * 删除发起人/股东信息
	 */
	@RequiresPermissions("e:eSponsors:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ESponsors eSponsors) {
		eSponsorsService.delete(eSponsors);
		return renderResult(Global.TRUE, "删除发起人/股东信息成功！");
	}
	
}