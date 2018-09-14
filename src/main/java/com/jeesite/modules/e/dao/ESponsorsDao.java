/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.e.entity.ESponsors;

/**
 * 发起人/股东信息DAO接口
 * @author chensj
 * @version 2018-05-09
 */
@MyBatisDao
public interface ESponsorsDao extends CrudDao<ESponsors> {
	
}