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
import com.jeesite.modules.e.entity.EKeyPerson;
import com.jeesite.modules.e.service.EKeyPersonService;

/**
 * 普通公司--主要人员表Controller
 * @author chensj
 * @version 2018-05-09
 */
@Controller
@RequestMapping(value = "${adminPath}/e/eKeyPerson")
public class EKeyPersonController extends BaseController {

	@Autowired
	private EKeyPersonService eKeyPersonService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public EKeyPerson get(String id, boolean isNewRecord) {
		return eKeyPersonService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("e:eKeyPerson:view")
	@RequestMapping(value = {"list", ""})
	public String list(EKeyPerson eKeyPerson, Model model) {
		model.addAttribute("eKeyPerson", eKeyPerson);
		return "modules/e/eKeyPersonList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("e:eKeyPerson:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<EKeyPerson> listData(EKeyPerson eKeyPerson, HttpServletRequest request, HttpServletResponse response) {
		Page<EKeyPerson> page = eKeyPersonService.findPage(new Page<EKeyPerson>(request, response), eKeyPerson); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("e:eKeyPerson:view")
	@RequestMapping(value = "form")
	public String form(EKeyPerson eKeyPerson, Model model) {
		model.addAttribute("eKeyPerson", eKeyPerson);
		return "modules/e/eKeyPersonForm";
	}

	/**
	 * 保存普通公司--主要人员表
	 */
	@RequiresPermissions("e:eKeyPerson:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated EKeyPerson eKeyPerson) {
		eKeyPersonService.save(eKeyPerson);
		return renderResult(Global.TRUE, "保存普通公司--主要人员表成功！");
	}
	
	/**
	 * 删除普通公司--主要人员表
	 */
	@RequiresPermissions("e:eKeyPerson:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(EKeyPerson eKeyPerson) {
		eKeyPersonService.delete(eKeyPerson);
		return renderResult(Global.TRUE, "删除普通公司--主要人员表成功！");
	}
	
}