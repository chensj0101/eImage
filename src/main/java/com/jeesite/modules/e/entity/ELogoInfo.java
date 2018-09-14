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
 * 商标信息Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_logo_info", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="elogoname", attrName="elogoname", label="商标名称"),
		@Column(name="elogopicture", attrName="elogopicture", label="商标图片"),
		@Column(name="elogostatus", attrName="elogostatus", label="商标状态"),
		@Column(name="elogoapplicationdate", attrName="elogoapplicationdate", label="申请时间"),
		@Column(name="elogoregistrationid", attrName="elogoregistrationid", label="注册号"),
		@Column(name="elogotype", attrName="elogotype", label="商标类型"),
		@Column(name="elogodetailweb", attrName="elogodetailweb", label="详情网址"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class ELogoInfo extends DataEntity<ELogoInfo> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String elogoname;		// 商标名称
	private String elogopicture;		// 商标图片
	private String elogostatus;		// 商标状态
	private Date elogoapplicationdate;		// 申请时间
	private String elogoregistrationid;		// 注册号
	private String elogotype;		// 商标类型
	private String elogodetailweb;		// 详情网址
	private String delFlag;		// del_flag
	
	public ELogoInfo() {
		this(null);
	}

	public ELogoInfo(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="商标名称长度不能超过 255 个字符")
	public String getElogoname() {
		return elogoname;
	}

	public void setElogoname(String elogoname) {
		this.elogoname = elogoname;
	}
	
	@Length(min=0, max=255, message="商标图片长度不能超过 255 个字符")
	public String getElogopicture() {
		return elogopicture;
	}

	public void setElogopicture(String elogopicture) {
		this.elogopicture = elogopicture;
	}
	
	@Length(min=0, max=255, message="商标状态长度不能超过 255 个字符")
	public String getElogostatus() {
		return elogostatus;
	}

	public void setElogostatus(String elogostatus) {
		this.elogostatus = elogostatus;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getElogoapplicationdate() {
		return elogoapplicationdate;
	}

	public void setElogoapplicationdate(Date elogoapplicationdate) {
		this.elogoapplicationdate = elogoapplicationdate;
	}
	
	@Length(min=0, max=255, message="注册号长度不能超过 255 个字符")
	public String getElogoregistrationid() {
		return elogoregistrationid;
	}

	public void setElogoregistrationid(String elogoregistrationid) {
		this.elogoregistrationid = elogoregistrationid;
	}
	
	@Length(min=0, max=255, message="商标类型长度不能超过 255 个字符")
	public String getElogotype() {
		return elogotype;
	}

	public void setElogotype(String elogotype) {
		this.elogotype = elogotype;
	}
	
	@Length(min=0, max=255, message="详情网址长度不能超过 255 个字符")
	public String getElogodetailweb() {
		return elogodetailweb;
	}

	public void setElogodetailweb(String elogodetailweb) {
		this.elogodetailweb = elogodetailweb;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}