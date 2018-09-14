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
 * 发起人/股东信息Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_sponsors", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="esponsorstype", attrName="esponsorstype", label="发起人/股东类型"),
		@Column(name="esponsorsname", attrName="esponsorsname", label="发起人名称"),
		@Column(name="esubscribedcapital", attrName="esubscribedcapital", label="认缴出资"),
		@Column(name="eactualcapital", attrName="eactualcapital", label="实际出资"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class ESponsors extends DataEntity<ESponsors> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String esponsorstype;		// 发起人/股东类型
	private String esponsorsname;		// 发起人名称
	private String esubscribedcapital;		// 认缴出资
	private String eactualcapital;		// 实际出资
	private String delFlag;		// del_flag
	
	public ESponsors() {
		this(null);
	}

	public ESponsors(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="发起人/股东类型长度不能超过 255 个字符")
	public String getEsponsorstype() {
		return esponsorstype;
	}

	public void setEsponsorstype(String esponsorstype) {
		this.esponsorstype = esponsorstype;
	}
	
	@Length(min=0, max=255, message="发起人名称长度不能超过 255 个字符")
	public String getEsponsorsname() {
		return esponsorsname;
	}

	public void setEsponsorsname(String esponsorsname) {
		this.esponsorsname = esponsorsname;
	}
	
	@Length(min=0, max=255, message="认缴出资长度不能超过 255 个字符")
	public String getEsubscribedcapital() {
		return esubscribedcapital;
	}

	public void setEsubscribedcapital(String esubscribedcapital) {
		this.esubscribedcapital = esubscribedcapital;
	}
	
	@Length(min=0, max=255, message="实际出资长度不能超过 255 个字符")
	public String getEactualcapital() {
		return eactualcapital;
	}

	public void setEactualcapital(String eactualcapital) {
		this.eactualcapital = eactualcapital;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}