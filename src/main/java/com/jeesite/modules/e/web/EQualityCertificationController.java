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
import com.jeesite.modules.e.entity.EQualityCertification;
import com.jeesite.modules.e.service.EQualityCertificationService;

/**
 * 资质认证Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eQualityCertification")
public class EQualityCertificationController extends BaseController {

	@Autowired
	private EQualityCertificationService eQualityCertificationService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EQualityCertification get(String id, boolean isNewRecord) {
		return eQualityCertificationService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eQualityCertification:view")
	@RequestMapping(value = {"list", ""})
	public String list(EQualityCertification eQualityCertification, Model model) {
		model.addAttribute("eQualityCertification", eQualityCertification);
		return "modules/e/eQualityCertificationList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eQualityCertification:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EQualityCertification> listData(EQualityCertification eQualityCertification, HttpServletRequest request, HttpServletResponse response) {
		Page<EQualityCertification> page = eQualityCertificationService.findPage(new Page<EQualityCertification>(request, response), eQualityCertification); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eQualityCertification:view")
	@RequestMapping(value = "form")
	public String form(EQualityCertification eQualityCertification, Model model) {
		model.addAttribute("eQualityCertification", eQualityCertification);
		return "modules/e/eQualityCertificationForm";
	}

	/**
	 * 保存资质认证
	 */
	@RequiresPermissions("e:eQualityCertification:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EQualityCertification eQualityCertification) {
		eQualityCertificationService.save(eQualityCertification);
		return renderResult(Global.TRUE, "保存资质认证成功！");
	}
	
	/**
	 * 删除资质认证
	 */
	@RequiresPermissions("e:eQualityCertification:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EQualityCertification eQualityCertification) {
		eQualityCertificationService.delete(eQualityCertification);
		return renderResult(Global.TRUE, "删除资质认证成功！");
	}
	
}