/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author  JerryXue
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
