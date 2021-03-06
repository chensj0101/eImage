/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EOverviewInfo;
import com.jeesite.modules.e.dao.EOverviewInfoDao;

/**
 * 企业概况Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EOverviewInfoService extends CrudService<EOverviewInfoDao, EOverviewInfo> {
	
	/**
	 * 获取单条数据
	 * @param eOverviewInfo
	 * @return
	 */
	@Override
	public EOverviewInfo get(EOverviewInfo eOverviewInfo) {
		return super.get(eOverviewInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eOverviewInfo
	 * @return
	 */
	@Override
	public Page<EOverviewInfo> findPage(Page<EOverviewInfo> page, EOverviewInfo eOverviewInfo) {
		return super.findPage(page, eOverviewInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eOverviewInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EOverviewInfo eOverviewInfo) {
		super.save(eOverviewInfo);
	}
	
	/**
	 * 更新状态
	 * @param eOverviewInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EOverviewInfo eOverviewInfo) {
		super.updateStatus(eOverviewInfo);
	}
	
	/**
	 * 删除数据
	 * @param eOverviewInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EOverviewInfo eOverviewInfo) {
		super.delete(eOverviewInfo);
	}
	
}