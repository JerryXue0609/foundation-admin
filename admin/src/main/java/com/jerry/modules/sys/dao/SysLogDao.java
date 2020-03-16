/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author  JerryXue
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
