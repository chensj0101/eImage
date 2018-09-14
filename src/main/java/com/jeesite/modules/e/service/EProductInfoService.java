/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EProductInfo;
import com.jeesite.modules.e.dao.EProductInfoDao;

/**
 * 普通公司--产品信息表Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EProductInfoService extends CrudService<EProductInfoDao, EProductInfo> {
	
	/**
	 * 获取单条数据
	 * @param eProductInfo
	 * @return
	 */
	@Override
	public EProductInfo get(EProductInfo eProductInfo) {
		return super.get(eProductInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eProductInfo
	 * @return
	 */
	@Override
	public Page<EProductInfo> findPage(Page<EProductInfo> page, EProductInfo eProductInfo) {
		return super.findPage(page, eProductInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eProductInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EProductInfo eProductInfo) {
		super.save(eProductInfo);
	}
	
	/**
	 * 更新状态
	 * @param eProductInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EProductInfo eProductInfo) {
		super.updateStatus(eProductInfo);
	}
	
	/**
	 * 删除数据
	 * @param eProductInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EProductInfo eProductInfo) {
		super.delete(eProductInfo);
	}
	
}