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
 * 企业概况Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_overview_info", alias="a", columns={
		@Column(name="id", attrName="id", label="id"),
		@Column(name="ename", attrName="ename", label="企业名称", isPK=true),
		@Column(name="eenglishname", attrName="eenglishname", label="企业英文名称"),
		@Column(name="echairman", attrName="echairman", label="企业董事长"),
		@Column(name="elealperson", attrName="elealperson", label="企业法人代表"),
		@Column(name="egeneralmanager", attrName="egeneralmanager", label="企业总经理"),
		@Column(name="efounddate", attrName="efounddate", label="成立日期"),
		@Column(name="elistingdate", attrName="elistingdate", label="上市日期"),
		@Column(name="eonlinereleasetime", attrName="eonlinereleasetime", label="网上发行日期"),
		@Column(name="eregisteredcapital", attrName="eregisteredcapital", label="注册资本"),
		@Column(name="enumberofmanager", attrName="enumberofmanager", label="管理人员人数"),
		@Column(name="enumberofstaff", attrName="enumberofstaff", label="员工人数"),
		@Column(name="earea", attrName="earea", label="区域"),
		@Column(name="eregisteredaddress", attrName="eregisteredaddress", label="注册地址", queryType=QueryType.LIKE),
		@Column(name="eofficeaddress", attrName="eofficeaddress", label="办公地址", queryType=QueryType.LIKE),
		@Column(name="eofficephone", attrName="eofficephone", label="联系电话"),
		@Column(name="eemailaddress", attrName="eemailaddress", label="电子邮箱"),
		@Column(name="eweburl", attrName="eweburl", label="网址"),
		@Column(name="efaxno", attrName="efaxno", label="传真"),
		@Column(name="eintroduction", attrName="eintroduction", label="企业简介"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EOverviewInfo extends DataEntity<EOverviewInfo> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String eenglishname;		// 企业英文名称
	private String echairman;		// 企业董事长
	private String elealperson;		// 企业法人代表
	private String egeneralmanager;		// 企业总经理
	private Date efounddate;		// 成立日期
	private Date elistingdate;		// 上市日期
	private Date eonlinereleasetime;		// 网上发行日期
	private String eregisteredcapital;		// 注册资本
	private Long enumberofmanager;		// 管理人员人数
	private Long enumberofstaff;		// 员工人数
	private String earea;		// 区域
	private String eregisteredaddress;		// 注册地址
	private String eofficeaddress;		// 办公地址
	private String eofficephone;		// 联系电话
	private String eemailaddress;		// 电子邮箱
	private String eweburl;		// 网址
	private String efaxno;		// 传真
	private String eintroduction;		// 企业简介
	private String delFlag;		// del_flag
	
	public EOverviewInfo() {
		this(null);
	}

	public EOverviewInfo(String id){
		super(id);
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="企业英文名称长度不能超过 255 个字符")
	public String getEenglishname() {
		return eenglishname;
	}

	public void setEenglishname(String eenglishname) {
		this.eenglishname = eenglishname;
	}
	
	@Length(min=0, max=255, message="企业董事长长度不能超过 255 个字符")
	public String getEchairman() {
		return echairman;
	}

	public void setEchairman(String echairman) {
		this.echairman = echairman;
	}
	
	@Length(min=0, max=255, message="企业法人代表长度不能超过 255 个字符")
	public String getElealperson() {
		return elealperson;
	}

	public void setElealperson(String elealperson) {
		this.elealperson = elealperson;
	}
	
	@Length(min=0, max=255, message="企业总经理长度不能超过 255 个字符")
	public String getEgeneralmanager() {
		return egeneralmanager;
	}

	public void setEgeneralmanager(String egeneralmanager) {
		this.egeneralmanager = egeneralmanager;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEfounddate() {
		return efounddate;
	}

	public void setEfounddate(Date efounddate) {
		this.efounddate = efounddate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getElistingdate() {
		return elistingdate;
	}

	public void setElistingdate(Date elistingdate) {
		this.elistingdate = elistingdate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEonlinereleasetime() {
		return eonlinereleasetime;
	}

	public void setEonlinereleasetime(Date eonlinereleasetime) {
		this.eonlinereleasetime = eonlinereleasetime;
	}
	
	@Length(min=0, max=255, message="注册资本长度不能超过 255 个字符")
	public String getEregisteredcapital() {
		return eregisteredcapital;
	}

	public void setEregisteredcapital(String eregisteredcapital) {
		this.eregisteredcapital = eregisteredcapital;
	}
	
	public Long getEnumberofmanager() {
		return enumberofmanager;
	}

	public void setEnumberofmanager(Long enumberofmanager) {
		this.enumberofmanager = enumberofmanager;
	}
	
	public Long getEnumberofstaff() {
		return enumberofstaff;
	}

	public void setEnumberofstaff(Long enumberofstaff) {
		this.enumberofstaff = enumberofstaff;
	}
	
	@Length(min=0, max=255, message="区域长度不能超过 255 个字符")
	public String getEarea() {
		return earea;
	}

	public void setEarea(String earea) {
		this.earea = earea;
	}
	
	@Length(min=0, max=255, message="注册地址长度不能超过 255 个字符")
	public String getEregisteredaddress() {
		return eregisteredaddress;
	}

	public void setEregisteredaddress(String eregisteredaddress) {
		this.eregisteredaddress = eregisteredaddress;
	}
	
	@Length(min=0, max=255, message="办公地址长度不能超过 255 个字符")
	public String getEofficeaddress() {
		return eofficeaddress;
	}

	public void setEofficeaddress(String eofficeaddress) {
		this.eofficeaddress = eofficeaddress;
	}
	
	@Length(min=0, max=255, message="联系电话长度不能超过 255 个字符")
	public String getEofficephone() {
		return eofficephone;
	}

	public void setEofficephone(String eofficephone) {
		this.eofficephone = eofficephone;
	}
	
	@Length(min=0, max=255, message="电子邮箱长度不能超过 255 个字符")
	public String getEemailaddress() {
		return eemailaddress;
	}

	public void setEemailaddress(String eemailaddress) {
		this.eemailaddress = eemailaddress;
	}
	
	@Length(min=0, max=255, message="网址长度不能超过 255 个字符")
	public String getEweburl() {
		return eweburl;
	}

	public void setEweburl(String eweburl) {
		this.eweburl = eweburl;
	}
	
	public String getEfaxno() {
		return efaxno;
	}

	public void setEfaxno(String efaxno) {
		this.efaxno = efaxno;
	}
	
	@Length(min=0, max=255, message="企业简介长度不能超过 255 个字符")
	public String getEintroduction() {
		return eintroduction;
	}

	public void setEintroduction(String eintroduction) {
		this.eintroduction = eintroduction;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}