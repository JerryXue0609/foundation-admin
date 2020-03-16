/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author  JerryXue
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
