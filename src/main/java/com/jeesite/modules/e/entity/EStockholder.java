/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 主要股东Entity
 * @author chensj
 * @version 2018-05-07
 */
@Table(name="e_stockholder", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="estockholdername", attrName="estockholdername", label="主要股东名称"),
		@Column(name="estockholdernumberofshares", attrName="estockholdernumberofshares", label="持股数"),
		@Column(name="estockholdertype", attrName="estockholdertype", label="股份类型"),
		@Column(name="estockholderratio", attrName="estockholderratio", label="持股比例"),
		@Column(name="estockholderincanddec", attrName="estockholderincanddec", label="增减持股数"),
		@Column(name="estockholderratioofchange", attrName="estockholderratioofchange", label="变化比例"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EStockholder extends DataEntity<EStockholder> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String estockholdername;		// 主要股东名称
	private String estockholdernumberofshares;		// 持股数
	private String estockholdertype;		// 股份类型
	private String estockholderratio;		// 持股比例
	private String estockholderincanddec;		// 增减持股数
	private String estockholderratioofchange;		// 变化比例
	private String delFlag;		// del_flag
	
	public EStockholder() {
		this(null);
	}

	public EStockholder(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="主要股东名称长度不能超过 255 个字符")
	public String getEstockholdername() {
		return estockholdername;
	}

	public void setEstockholdername(String estockholdername) {
		this.estockholdername = estockholdername;
	}
	
	@Length(min=0, max=255, message="持股数长度不能超过 255 个字符")
	public String getEstockholdernumberofshares() {
		return estockholdernumberofshares;
	}

	public void setEstockholdernumberofshares(String estockholdernumberofshares) {
		this.estockholdernumberofshares = estockholdernumberofshares;
	}
	
	@Length(min=0, max=255, message="股份类型长度不能超过 255 个字符")
	public String getEstockholdertype() {
		return estockholdertype;
	}

	public void setEstockholdertype(String estockholdertype) {
		this.estockholdertype = estockholdertype;
	}
	
	@Length(min=0, max=255, message="持股比例长度不能超过 255 个字符")
	public String getEstockholderratio() {
		return estockholderratio;
	}

	public void setEstockholderratio(String estockholderratio) {
		this.estockholderratio = estockholderratio;
	}
	
	@Length(min=0, max=255, message="增减持股数长度不能超过 255 个字符")
	public String getEstockholderincanddec() {
		return estockholderincanddec;
	}

	public void setEstockholderincanddec(String estockholderincanddec) {
		this.estockholderincanddec = estockholderincanddec;
	}
	
	@Length(min=0, max=255, message="变化比例长度不能超过 255 个字符")
	public String getEstockholderratioofchange() {
		return estockholderratioofchange;
	}

	public void setEstockholderratioofchange(String estockholderratioofchange) {
		this.estockholderratioofchange = estockholderratioofchange;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}