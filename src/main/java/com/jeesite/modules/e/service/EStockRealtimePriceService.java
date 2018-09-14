/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EStockRealtimePrice;
import com.jeesite.modules.e.dao.EStockRealtimePriceDao;

/**
 * 实时股价Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EStockRealtimePriceService extends CrudService<EStockRealtimePriceDao, EStockRealtimePrice> {
	
	/**
	 * 获取单条数据
	 * @param eStockRealtimePrice
	 * @return
	 */
	@Override
	public EStockRealtimePrice get(EStockRealtimePrice eStockRealtimePrice) {
		return super.get(eStockRealtimePrice);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eStockRealtimePrice
	 * @return
	 */
	@Override
	public Page<EStockRealtimePrice> findPage(Page<EStockRealtimePrice> page, EStockRealtimePrice eStockRealtimePrice) {
		return super.findPage(page, eStockRealtimePrice);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eStockRealtimePrice
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EStockRealtimePrice eStockRealtimePrice) {
		super.save(eStockRealtimePrice);
	}
	
	/**
	 * 更新状态
	 * @param eStockRealtimePrice
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EStockRealtimePrice eStockRealtimePrice) {
		super.updateStatus(eStockRealtimePrice);
	}
	
	/**
	 * 删除数据
	 * @param eStockRealtimePrice
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EStockRealtimePrice eStockRealtimePrice) {
		super.delete(eStockRealtimePrice);
	}
	
}