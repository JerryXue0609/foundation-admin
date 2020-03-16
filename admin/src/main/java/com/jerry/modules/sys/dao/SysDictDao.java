/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典
 *
 * @author  JerryXue
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {
	
}
