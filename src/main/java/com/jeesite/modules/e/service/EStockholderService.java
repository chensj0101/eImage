/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EStockholder;
import com.jeesite.modules.e.dao.EStockholderDao;

/**
 * 主要股东Service
 * @author chensj
 * @version 2018-05-07
 */
@Service
@Transactional(readOnly=true)
public class EStockholderService extends CrudService<EStockholderDao, EStockholder> {
	
	/**
	 * 获取单条数据
	 * @param eStockholder
	 * @return
	 */
	@Override
	public EStockholder get(EStockholder eStockholder) {
		return super.get(eStockholder);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eStockholder
	 * @return
	 */
	@Override
	public Page<EStockholder> findPage(Page<EStockholder> page, EStockholder eStockholder) {
		return super.findPage(page, eStockholder);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eStockholder
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EStockholder eStockholder) {
		super.save(eStockholder);
	}
	
	/**
	 * 更新状态
	 * @param eStockholder
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EStockholder eStockholder) {
		super.updateStatus(eStockholder);
	}
	
	/**
	 * 删除数据
	 * @param eStockholder
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EStockholder eStockholder) {
		super.delete(eStockholder);
	}
	
}