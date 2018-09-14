/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.e.entity.EKeyPerson;
import com.jeesite.modules.e.dao.EKeyPersonDao;

/**
 * 普通公司--主要人员表Service
 * @author chensj
 * @version 2018-05-09
 */
@Service
@Transactional(readOnly=true)
public class EKeyPersonService extends CrudService<EKeyPersonDao, EKeyPerson> {
	
	/**
	 * 获取单条数据
	 * @param eKeyPerson
	 * @return
	 */
	@Override
	public EKeyPerson get(EKeyPerson eKeyPerson) {
		return super.get(eKeyPerson);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param eKeyPerson
	 * @return
	 */
	@Override
	public Page<EKeyPerson> findPage(Page<EKeyPerson> page, EKeyPerson eKeyPerson) {
		return super.findPage(page, eKeyPerson);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param eKeyPerson
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(EKeyPerson eKeyPerson) {
		super.save(eKeyPerson);
	}
	
	/**
	 * 更新状态
	 * @param eKeyPerson
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(EKeyPerson eKeyPerson) {
		super.updateStatus(eKeyPerson);
	}
	
	/**
	 * 删除数据
	 * @param eKeyPerson
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(EKeyPerson eKeyPerson) {
		super.delete(eKeyPerson);
	}
	
}