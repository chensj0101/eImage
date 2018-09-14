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
 * 普通公司--主要人员表Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_key_person", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="ename", attrName="ename", label="企业名称"),
		@Column(name="epersonname", attrName="epersonname", label="人员名称"),
		@Column(name="epersonposition", attrName="epersonposition", label="职位"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EKeyPerson extends DataEntity<EKeyPerson> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String epersonname;		// 人员名称
	private String epersonposition;		// 职位
	private String delFlag;		// del_flag
	
	public EKeyPerson() {
		this(null);
	}

	public EKeyPerson(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="企业名称长度不能超过 255 个字符")
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="人员名称长度不能超过 255 个字符")
	public String getEpersonname() {
		return epersonname;
	}

	public void setEpersonname(String epersonname) {
		this.epersonname = epersonname;
	}
	
	@Length(min=0, max=255, message="职位长度不能超过 255 个字符")
	public String getEpersonposition() {
		return epersonposition;
	}

	public void setEpersonposition(String epersonposition) {
		this.epersonposition = epersonposition;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}