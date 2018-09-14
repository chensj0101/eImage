/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.e.entity.EQualityCertification;

/**
 * 资质认证DAO接口
 * @author chensj
 * @version 2018-05-09
 */
@MyBatisDao
public interface EQualityCertificationDao extends CrudDao<EQualityCertification> {
	
}