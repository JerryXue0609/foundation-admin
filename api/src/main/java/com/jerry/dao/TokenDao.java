/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author  JerryXue
 */
@Mapper
public interface TokenDao extends BaseMapper<TokenEntity> {
	
}
