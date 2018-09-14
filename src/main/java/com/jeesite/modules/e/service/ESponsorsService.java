/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.ESponsors;
import com.jeesite.modules.e.dao.ESponsorsDao;

/**
 * 发起人/股东信息Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class ESponsorsService extends CrudService<ESponsorsDao, ESponsors> {
	
	/**
	 * 获取单条数据
	 * @param eSponsors
	 * @return
	 */
	@Override
	public ESponsors get(ESponsors eSponsors) {
		return super.get(eSponsors);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eSponsors
	 * @return
	 */
	@Override
	public Page<ESponsors> findPage(Page<ESponsors> page, ESponsors eSponsors) {
		return super.findPage(page, eSponsors);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eSponsors
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(ESponsors eSponsors) {
		super.save(eSponsors);
	}
	
	/**
	 * 更新状态
	 * @param eSponsors
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(ESponsors eSponsors) {
		super.updateStatus(eSponsors);
	}
	
	/**
	 * 删除数据
	 * @param eSponsors
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(ESponsors eSponsors) {
		super.delete(eSponsors);
	}
	
}