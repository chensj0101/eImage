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
 * 普通公司--产品信息表Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_product_info", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="eproductname", attrName="eproductname", label="产品名称"),
		@Column(name="eproductpicture", attrName="eproductpicture", label="产品图片"),
		@Column(name="eproductintroduction", attrName="eproductintroduction", label="产品介绍"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EProductInfo extends DataEntity<EProductInfo> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String eproductname;		// 产品名称
	private String eproductpicture;		// 产品图片
	private String eproductintroduction;		// 产品介绍
	private String delFlag;		// del_flag
	
	public EProductInfo() {
		this(null);
	}

	public EProductInfo(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="产品名称长度不能超过 255 个字符")
	public String getEproductname() {
		return eproductname;
	}

	public void setEproductname(String eproductname) {
		this.eproductname = eproductname;
	}
	
	@Length(min=0, max=255, message="产品图片长度不能超过 255 个字符")
	public String getEproductpicture() {
		return eproductpicture;
	}

	public void setEproductpicture(String eproductpicture) {
		this.eproductpicture = eproductpicture;
	}
	
	@Length(min=0, max=500, message="产品介绍长度不能超过 500 个字符")
	public String getEproductintroduction() {
		return eproductintroduction;
	}

	public void setEproductintroduction(String eproductintroduction) {
		this.eproductintroduction = eproductintroduction;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}