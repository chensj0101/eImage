/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 企业工商信息Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_business_info", alias="a", columns={
		@Column(name="id", attrName="id", label="id"),
		@Column(name="ename", attrName="ename", label="企业名称", isPK=true),
		@Column(name="eunifiedsocialcreditcode", attrName="eunifiedsocialcreditcode", label="统一社会信用代码"),
		@Column(name="eorganizationcode", attrName="eorganizationcode", label="组织机构代码"),
		@Column(name="eregistrationid", attrName="eregistrationid", label="注册号"),
		@Column(name="emanagestatus", attrName="emanagestatus", label="经营状态"),
		@Column(name="eclass", attrName="eclass", label="所属行业"),
		@Column(name="eregisterdate", attrName="eregisterdate", label="成立日期"),
		@Column(name="etype", attrName="etype", label="公司类型"),
		@Column(name="ebusnissallotedtime", attrName="ebusnissallotedtime", label="经营期限"),
		@Column(name="elegalrepresentative", attrName="elegalrepresentative", label="法定代表人"),
		@Column(name="eissueofdate", attrName="eissueofdate", label="发照日期"),
		@Column(name="eregisteredcapital", attrName="eregisteredcapital", label="注册资本"),
		@Column(name="eregistrationauthority", attrName="eregistrationauthority", label="登记机关"),
		@Column(name="eaddress", attrName="eaddress", label="企业地址", queryType=QueryType.LIKE),
		@Column(name="escopeofbusiness", attrName="escopeofbusiness", label="经营范围"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EBusinessInfo extends DataEntity<EBusinessInfo> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String eunifiedsocialcreditcode;		// 统一社会信用代码
	private String eorganizationcode;		// 组织机构代码
	private String eregistrationid;		// 注册号
	private String emanagestatus;		// 经营状态
	private String eclass;		// 所属行业
	private Date eregisterdate;		// 成立日期
	private String etype;		// 公司类型
	private Date ebusnissallotedtime;		// 经营期限
	private String elegalrepresentative;		// 法定代表人
	private Date eissueofdate;		// 发照日期
	private String eregisteredcapital;		// 注册资本
	private String eregistrationauthority;		// 登记机关
	private String eaddress;		// 企业地址
	private String escopeofbusiness;		// 经营范围
	private String delFlag;		// del_flag
	
	public EBusinessInfo() {
		this(null);
	}

	public EBusinessInfo(String id){
		super(id);
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="统一社会信用代码长度不能超过 255 个字符")
	public String getEunifiedsocialcreditcode() {
		return eunifiedsocialcreditcode;
	}

	public void setEunifiedsocialcreditcode(String eunifiedsocialcreditcode) {
		this.eunifiedsocialcreditcode = eunifiedsocialcreditcode;
	}
	
	@Length(min=0, max=255, message="组织机构代码长度不能超过 255 个字符")
	public String getEorganizationcode() {
		return eorganizationcode;
	}

	public void setEorganizationcode(String eorganizationcode) {
		this.eorganizationcode = eorganizationcode;
	}
	
	@Length(min=0, max=255, message="注册号长度不能超过 255 个字符")
	public String getEregistrationid() {
		return eregistrationid;
	}

	public void setEregistrationid(String eregistrationid) {
		this.eregistrationid = eregistrationid;
	}
	
	@Length(min=0, max=255, message="经营状态长度不能超过 255 个字符")
	public String getEmanagestatus() {
		return emanagestatus;
	}

	public void setEmanagestatus(String emanagestatus) {
		this.emanagestatus = emanagestatus;
	}
	
	@Length(min=0, max=255, message="所属行业长度不能超过 255 个字符")
	public String getEclass() {
		return eclass;
	}

	public void setEclass(String eclass) {
		this.eclass = eclass;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEregisterdate() {
		return eregisterdate;
	}

	public void setEregisterdate(Date eregisterdate) {
		this.eregisterdate = eregisterdate;
	}
	
	@Length(min=0, max=255, message="公司类型长度不能超过 255 个字符")
	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEbusnissallotedtime() {
		return ebusnissallotedtime;
	}

	public void setEbusnissallotedtime(Date ebusnissallotedtime) {
		this.ebusnissallotedtime = ebusnissallotedtime;
	}
	
	@Length(min=0, max=255, message="法定代表人长度不能超过 255 个字符")
	public String getElegalrepresentative() {
		return elegalrepresentative;
	}

	public void setElegalrepresentative(String elegalrepresentative) {
		this.elegalrepresentative = elegalrepresentative;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEissueofdate() {
		return eissueofdate;
	}

	public void setEissueofdate(Date eissueofdate) {
		this.eissueofdate = eissueofdate;
	}
	
	@Length(min=0, max=255, message="注册资本长度不能超过 255 个字符")
	public String getEregisteredcapital() {
		return eregisteredcapital;
	}

	public void setEregisteredcapital(String eregisteredcapital) {
		this.eregisteredcapital = eregisteredcapital;
	}
	
	@Length(min=0, max=255, message="登记机关长度不能超过 255 个字符")
	public String getEregistrationauthority() {
		return eregistrationauthority;
	}

	public void setEregistrationauthority(String eregistrationauthority) {
		this.eregistrationauthority = eregistrationauthority;
	}
	
	@Length(min=0, max=255, message="企业地址长度不能超过 255 个字符")
	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
	@Length(min=0, max=500, message="经营范围长度不能超过 500 个字符")
	public String getEscopeofbusiness() {
		return escopeofbusiness;
	}

	public void setEscopeofbusiness(String escopeofbusiness) {
		this.escopeofbusiness = escopeofbusiness;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}