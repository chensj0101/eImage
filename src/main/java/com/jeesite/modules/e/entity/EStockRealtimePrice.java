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
 * 实时股价Entity
 * @author chensj
 * @version 2018-05-09
 */
@Table(name="e_stock_realtime_price", alias="a", columns={
		@Column(name="id", attrName="id", label="id"),
		@Column(name="ename", attrName="ename", label="企业名称", isPK=true),
		@Column(name="stockmarketvalue", attrName="stockmarketvalue", label="总市值"),
		@Column(name="stockpb", attrName="stockpb", label="市净率"),
		@Column(name="stockequity", attrName="stockequity", label="总股本"),
		@Column(name="stocknetmargin", attrName="stocknetmargin", label="净利润"),
		@Column(name="stocktradedmarketvalue", attrName="stocktradedmarketvalue", label="流通市值"),
		@Column(name="stockearningspershare", attrName="stockearningspershare", label="每股收益"),
		@Column(name="stockflowofequity", attrName="stockflowofequity", label="流通股本"),
		@Column(name="stockoperatingincom", attrName="stockoperatingincom", label="营业收入"),
		@Column(name="stockpriceearningsratio", attrName="stockpriceearningsratio", label="市盈率"),
		@Column(name="stockvocation", attrName="stockvocation", label="行业"),
		@Column(includeEntity=DataEntity.class),
		@Column(name="del_flag", attrName="delFlag", label="del_flag"),
	}, orderBy="a.update_date DESC"
)
public class EStockRealtimePrice extends DataEntity<EStockRealtimePrice> {
	
	private static final long serialVersionUID = 1L;
	private String ename;		// 企业名称
	private String stockmarketvalue;		// 总市值
	private String stockpb;		// 市净率
	private String stockequity;		// 总股本
	private String stocknetmargin;		// 净利润
	private String stocktradedmarketvalue;		// 流通市值
	private String stockearningspershare;		// 每股收益
	private String stockflowofequity;		// 流通股本
	private String stockoperatingincom;		// 营业收入
	private String stockpriceearningsratio;		// 市盈率
	private String stockvocation;		// 行业
	private String delFlag;		// del_flag
	
	public EStockRealtimePrice() {
		this(null);
	}

	public EStockRealtimePrice(String id){
		super(id);
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Length(min=0, max=255, message="总市值长度不能超过 255 个字符")
	public String getStockmarketvalue() {
		return stockmarketvalue;
	}

	public void setStockmarketvalue(String stockmarketvalue) {
		this.stockmarketvalue = stockmarketvalue;
	}
	
	@Length(min=0, max=255, message="市净率长度不能超过 255 个字符")
	public String getStockpb() {
		return stockpb;
	}

	public void setStockpb(String stockpb) {
		this.stockpb = stockpb;
	}
	
	@Length(min=0, max=255, message="总股本长度不能超过 255 个字符")
	public String getStockequity() {
		return stockequity;
	}

	public void setStockequity(String stockequity) {
		this.stockequity = stockequity;
	}
	
	@Length(min=0, max=255, message="净利润长度不能超过 255 个字符")
	public String getStocknetmargin() {
		return stocknetmargin;
	}

	public void setStocknetmargin(String stocknetmargin) {
		this.stocknetmargin = stocknetmargin;
	}
	
	@Length(min=0, max=255, message="流通市值长度不能超过 255 个字符")
	public String getStocktradedmarketvalue() {
		return stocktradedmarketvalue;
	}

	public void setStocktradedmarketvalue(String stocktradedmarketvalue) {
		this.stocktradedmarketvalue = stocktradedmarketvalue;
	}
	
	@Length(min=0, max=255, message="每股收益长度不能超过 255 个字符")
	public String getStockearningspershare() {
		return stockearningspershare;
	}

	public void setStockearningspershare(String stockearningspershare) {
		this.stockearningspershare = stockearningspershare;
	}
	
	@Length(min=0, max=255, message="流通股本长度不能超过 255 个字符")
	public String getStockflowofequity() {
		return stockflowofequity;
	}

	public void setStockflowofequity(String stockflowofequity) {
		this.stockflowofequity = stockflowofequity;
	}
	
	@Length(min=0, max=255, message="营业收入长度不能超过 255 个字符")
	public String getStockoperatingincom() {
		return stockoperatingincom;
	}

	public void setStockoperatingincom(String stockoperatingincom) {
		this.stockoperatingincom = stockoperatingincom;
	}
	
	@Length(min=0, max=255, message="市盈率长度不能超过 255 个字符")
	public String getStockpriceearningsratio() {
		return stockpriceearningsratio;
	}

	public void setStockpriceearningsratio(String stockpriceearningsratio) {
		this.stockpriceearningsratio = stockpriceearningsratio;
	}
	
	@Length(min=0, max=255, message="行业长度不能超过 255 个字符")
	public String getStockvocation() {
		return stockvocation;
	}

	public void setStockvocation(String stockvocation) {
		this.stockvocation = stockvocation;
	}
	
	@Length(min=0, max=255, message="del_flag长度不能超过 255 个字符")
	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}