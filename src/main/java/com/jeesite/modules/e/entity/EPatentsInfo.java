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
 * 普通公司--专利信息表Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_patents_info", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="epatenttype", attrName="epatenttype", label="专利类型"),
		@Column(name="epatentpublishedapplicationnumber", attrName="epatentpublishedapplicationnumber", label="申请公布号"),
		@Column(name="epatentpublisheddate", attrName="epatentpublisheddate", label="公布日期"),
		@Column(name="epatentdetail", attrName="epatentdetail", label="专利详情网址"),
		@Column(name="epatentabstract", attrName="epatentabstract", label="摘要"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EPatentsInfo extends DataEntity<EPatentsInfo> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String epatenttype;		// 专利类型
	private String epatentpublishedapplicationnumber;		// 申请公布号
	private Date epatentpublisheddate;		// 公布日期
	private String epatentdetail;		// 专利详情网址
	private String epatentabstract;		// 摘要
	private String delFlag;		// del_flag
	
	public EPatentsInfo() {
		this(null);
	}

	public EPatentsInfo(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="专利类型长度不能超过 255 个字符")
	public String getEpatenttype() {
		return epatenttype;
	}

	public void setEpatenttype(String epatenttype) {
		this.epatenttype = epatenttype;
	}
	
	@Length(min=0, max=255, message="申请公布号长度不能超过 255 个字符")
	public String getEpatentpublishedapplicationnumber() {
		return epatentpublishedapplicationnumber;
	}

	public void setEpatentpublishedapplicationnumber(String epatentpublishedapplicationnumber) {
		this.epatentpublishedapplicationnumber = epatentpublishedapplicationnumber;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEpatentpublisheddate() {
		return epatentpublisheddate;
	}

	public void setEpatentpublisheddate(Date epatentpublisheddate) {
		this.epatentpublisheddate = epatentpublisheddate;
	}
	
	@Length(min=0, max=255, message="专利详情网址长度不能超过 255 个字符")
	public String getEpatentdetail() {
		return epatentdetail;
	}

	public void setEpatentdetail(String epatentdetail) {
		this.epatentdetail = epatentdetail;
	}
	
	@Length(min=0, max=255, message="摘要长度不能超过 255 个字符")
	public String getEpatentabstract() {
		return epatentabstract;
	}

	public void setEpatentabstract(String epatentabstract) {
		this.epatentabstract = epatentabstract;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}