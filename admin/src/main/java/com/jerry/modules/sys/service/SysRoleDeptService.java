/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;


/**
 * 角色与部门对应关系
 *
 * @author  JerryXue
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {
	
	void saveOrUpdate(Long roleId, List<Long> deptIdList);
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long[] roleIds) ;

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
