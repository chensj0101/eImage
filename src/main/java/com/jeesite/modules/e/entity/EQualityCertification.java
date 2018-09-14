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
 * 资质认证Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_quality_certification", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="ecertificationdateofissue", attrName="ecertificationdateofissue", label="发证日期"),
		@Column(name="ecertificationtype", attrName="ecertificationtype", label="证书类别"),
		@Column(name="ecertificationcode", attrName="ecertificationcode", label="证书编号"),
		@Column(name="ecertificationdeadline", attrName="ecertificationdeadline", label="截止日期"),
		@Column(name="ecertificationstatus", attrName="ecertificationstatus", label="证书状态"),
		@Column(name="ecertificationremarks", attrName="ecertificationremarks", label="备注"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EQualityCertification extends DataEntity<EQualityCertification> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private Date ecertificationdateofissue;		// 发证日期
	private String ecertificationtype;		// 证书类别
	private String ecertificationcode;		// 证书编号
	private Date ecertificationdeadline;		// 截止日期
	private String ecertificationstatus;		// 证书状态
	private String ecertificationremarks;		// 备注
	private String delFlag;		// del_flag
	
	public EQualityCertification() {
		this(null);
	}

	public EQualityCertification(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEcertificationdateofissue() {
		return ecertificationdateofissue;
	}

	public void setEcertificationdateofissue(Date ecertificationdateofissue) {
		this.ecertificationdateofissue = ecertificationdateofissue;
	}
	
	@Length(min=0, max=255, message="证书类别长度不能超过 255 个字符")
	public String getEcertificationtype() {
		return ecertificationtype;
	}

	public void setEcertificationtype(String ecertificationtype) {
		this.ecertificationtype = ecertificationtype;
	}
	
	@Length(min=0, max=255, message="证书编号长度不能超过 255 个字符")
	public String getEcertificationcode() {
		return ecertificationcode;
	}

	public void setEcertificationcode(String ecertificationcode) {
		this.ecertificationcode = ecertificationcode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEcertificationdeadline() {
		return ecertificationdeadline;
	}

	public void setEcertificationdeadline(Date ecertificationdeadline) {
		this.ecertificationdeadline = ecertificationdeadline;
	}
	
	@Length(min=0, max=255, message="证书状态长度不能超过 255 个字符")
	public String getEcertificationstatus() {
		return ecertificationstatus;
	}

	public void setEcertificationstatus(String ecertificationstatus) {
		this.ecertificationstatus = ecertificationstatus;
	}
	
	@Length(min=0, max=255, message="备注长度不能超过 255 个字符")
	public String getEcertificationremarks() {
		return ecertificationremarks;
	}

	public void setEcertificationremarks(String ecertificationremarks) {
		this.ecertificationremarks = ecertificationremarks;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}