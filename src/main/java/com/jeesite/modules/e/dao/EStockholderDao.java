/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.e.entity.EStockholder;

/**
 * 主要股东DAO接口
 * @author chensj
 * @version 2018-05-07
 */
@MyBatisDao
public interface EStockholderDao extends CrudDao<EStockholder> {
	
}