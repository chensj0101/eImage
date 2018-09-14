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
import com.jeesite.modules.e.entity.EBusinessInfo;
import com.jeesite.modules.e.entity.EKeyPerson;
import com.jeesite.modules.e.entity.ELogoInfo;
import com.jeesite.modules.e.entity.EPatentsInfo;
import com.jeesite.modules.e.entity.EProductInfo;
import com.jeesite.modules.e.entity.EQualityCertification;
import com.jeesite.modules.e.entity.ESponsors;
import com.jeesite.modules.e.service.EBusinessInfoService;
import com.jeesite.modules.e.service.EKeyPersonService;
import com.jeesite.modules.e.service.ELogoInfoService;
import com.jeesite.modules.e.service.EPatentsInfoService;
import com.jeesite.modules.e.service.EProductInfoService;
import com.jeesite.modules.e.service.EQualityCertificationService;
import com.jeesite.modules.e.service.ESponsorsService;

/**
 * 企业工商信息Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eBusinessInfo")
public class EBusinessInfoController extends BaseController {

	@Autowired
	private EBusinessInfoService eBusinessInfoService;
	@Autowired
	private EKeyPersonService eKeyPersonService;
	@Autowired
	private ESponsorsService eSponsorsService;
	@Autowired
	private EProductInfoService eProductInfoService;
	@Autowired
	private ELogoInfoService eLogoInfoService;
	@Autowired
	private EPatentsInfoService ePatentsInfoService;
	@Autowired
	private EQualityCertificationService eQualityCertificationService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EQualityCertification getEQualityCertification(String id, boolean isNewRecord) {
		return eQualityCertificationService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EPatentsInfo getEPatentsInfo(String id, boolean isNewRecord) {
		return ePatentsInfoService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ELogoInfo getELogoInfo(String id, boolean isNewRecord) {
		return eLogoInfoService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EProductInfo getEProductInfo(String id, boolean isNewRecord) {
		return eProductInfoService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ESponsors getESponsors(String id, boolean isNewRecord) {
		return eSponsorsService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EKeyPerson getEKeyPerson(String id, boolean isNewRecord) {
		return eKeyPersonService.get(id, isNewRecord);
	}
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EBusinessInfo get(String ename, boolean isNewRecord) {
		return eBusinessInfoService.get(ename, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eBusinessInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(EBusinessInfo eBusinessInfo, Model model) {
		model.addAttribute("eBusinessInfo", eBusinessInfo);
		return "modules/e/eBusinessInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eBusinessInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EBusinessInfo> listData(EBusinessInfo eBusinessInfo, HttpServletRequest request, HttpServletResponse response) {
		Page<EBusinessInfo> page = eBusinessInfoService.findPage(new Page<EBusinessInfo>(request, response), eBusinessInfo); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eBusinessInfo:view")
	@RequestMapping(value = "form")
	public String form(EBusinessInfo eBusinessInfo, EKeyPerson eKeyPerson,ELogoInfo eLogoInfo, 
			ESponsors eSponsors, EProductInfo eProductInfo, EPatentsInfo ePatentsInfo, EQualityCertification eQualityCertification, Model model) {
		model.addAttribute("eBusinessInfo", eBusinessInfo);
		model.addAttribute("eKeyPerson", eKeyPerson);
		model.addAttribute("eSponsors", eSponsors);
		model.addAttribute("eProductInfo", eProductInfo);
		model.addAttribute("eLogoInfo", eLogoInfo);
		model.addAttribute("ePatentsInfo", ePatentsInfo);
		model.addAttribute("eQualityCertification", eQualityCertification);
		return "modules/e/eBusinessInfoForm";
	}

	/**
	 * 保存企业工商信息
	 */
	@RequiresPermissions("e:eBusinessInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EBusinessInfo eBusinessInfo) {
		eBusinessInfoService.save(eBusinessInfo);
		return renderResult(Global.TRUE, "保存企业工商信息成功！");
	}
	
	/**
	 * 删除企业工商信息
	 */
	@RequiresPermissions("e:eBusinessInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EBusinessInfo eBusinessInfo) {
		eBusinessInfoService.delete(eBusinessInfo);
		return renderResult(Global.TRUE, "删除企业工商信息成功！");
	}
	
}