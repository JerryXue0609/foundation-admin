/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.entity.UserEntity;
import com.jerry.form.LoginForm;

import java.util.Map;

/**
 * 用户
 *
 * @author  JerryXue
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回登录信息
	 */
	Map<String, Object> login(LoginForm form);
}
