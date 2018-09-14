/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.e.entity.EStockRealtimePrice;

/**
 * 实时股价DAO接口
 * @author chensj
 * @version 2018-05-09
 */
@MyBatisDao
public interface EStockRealtimePriceDao extends CrudDao<EStockRealtimePrice> {
	
}