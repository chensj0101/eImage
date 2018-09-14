/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.e.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.e.entity.ELogoInfo;

/**
 * 商标信息DAO接口
 * @author chensj
 * @version 2018-05-09
 */
@MyBatisDao
public interface ELogoInfoDao extends CrudDao<ELogoInfo> {
	
}