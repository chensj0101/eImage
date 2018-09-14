/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EQualityCertification;
import com.jeesite.modules.e.dao.EQualityCertificationDao;

/**
 * 资质认证Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EQualityCertificationService extends CrudService<EQualityCertificationDao, EQualityCertification> {
	
	/**
	 * 获取单条数据
	 * @param eQualityCertification
	 * @return
	 */
	@Override
	public EQualityCertification get(EQualityCertification eQualityCertification) {
		return super.get(eQualityCertification);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eQualityCertification
	 * @return
	 */
	@Override
	public Page<EQualityCertification> findPage(Page<EQualityCertification> page, EQualityCertification eQualityCertification) {
		return super.findPage(page, eQualityCertification);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eQualityCertification
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EQualityCertification eQualityCertification) {
		super.save(eQualityCertification);
	}
	
	/**
	 * 更新状态
	 * @param eQualityCertification
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EQualityCertification eQualityCertification) {
		super.updateStatus(eQualityCertification);
	}
	
	/**
	 * 删除数据
	 * @param eQualityCertification
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EQualityCertification eQualityCertification) {
		super.delete(eQualityCertification);
	}
	
}