/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jerry.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色管理
 *
 * @author  JerryXue
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	

}
