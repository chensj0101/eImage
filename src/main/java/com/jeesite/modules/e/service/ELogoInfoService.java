/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.ELogoInfo;
import com.jeesite.modules.e.dao.ELogoInfoDao;

/**
 * 商标信息Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class ELogoInfoService extends CrudService<ELogoInfoDao, ELogoInfo> {
	
	/**
	 * 获取单条数据
	 * @param eLogoInfo
	 * @return
	 */
	@Override
	public ELogoInfo get(ELogoInfo eLogoInfo) {
		return super.get(eLogoInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eLogoInfo
	 * @return
	 */
	@Override
	public Page<ELogoInfo> findPage(Page<ELogoInfo> page, ELogoInfo eLogoInfo) {
		return super.findPage(page, eLogoInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eLogoInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(ELogoInfo eLogoInfo) {
		super.save(eLogoInfo);
	}
	
	/**
	 * 更新状态
	 * @param eLogoInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(ELogoInfo eLogoInfo) {
		super.updateStatus(eLogoInfo);
	}
	
	/**
	 * 删除数据
	 * @param eLogoInfo
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(ELogoInfo eLogoInfo) {
		super.delete(eLogoInfo);
	}
	
}