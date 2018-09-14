/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EBusinessInfo;
import com.jeesite.modules.e.dao.EBusinessInfoDao;

/**
 * 企业工商信息Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EBusinessInfoService extends CrudService<EBusinessInfoDao, EBusinessInfo> {
	
	/**
	 * 获取单条数据
	 * @param eBusinessInfo
	 * @return
	 */
	@Override
	public EBusinessInfo get(EBusinessInfo eBusinessInfo) {
		return super.get(eBusinessInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eBusinessInfo
	 * @return
	 */
	@Override
	public Page<EBusinessInfo> findPage(Page<EBusinessInfo> page, EBusinessInfo eBusinessInfo) {
		return super.findPage(page, eBusinessInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eBusinessInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EBusinessInfo eBusinessInfo) {
		super.save(eBusinessInfo);
	}
	
	/**
	 * 更新状态
	 * @param eBusinessInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EBusinessInfo eBusinessInfo) {
		super.updateStatus(eBusinessInfo);
	}
	
	/**
	 * 删除数据
	 * @param eBusinessInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EBusinessInfo eBusinessInfo) {
		super.delete(eBusinessInfo);
	}
	
}