/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EPatentsInfo;
import com.jeesite.modules.e.dao.EPatentsInfoDao;

/**
 * 普通公司--专利信息表Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EPatentsInfoService extends CrudService<EPatentsInfoDao, EPatentsInfo> {
	
	/**
	 * 获取单条数据
	 * @param ePatentsInfo
	 * @return
	 */
	@Override
	public EPatentsInfo get(EPatentsInfo ePatentsInfo) {
		return super.get(ePatentsInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param ePatentsInfo
	 * @return
	 */
	@Override
	public Page<EPatentsInfo> findPage(Page<EPatentsInfo> page, EPatentsInfo ePatentsInfo) {
		return super.findPage(page, ePatentsInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param ePatentsInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EPatentsInfo ePatentsInfo) {
		super.save(ePatentsInfo);
	}
	
	/**
	 * 更新状态
	 * @param ePatentsInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EPatentsInfo ePatentsInfo) {
		super.updateStatus(ePatentsInfo);
	}
	
	/**
	 * 删除数据
	 * @param ePatentsInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EPatentsInfo ePatentsInfo) {
		super.delete(ePatentsInfo);
	}
	
}