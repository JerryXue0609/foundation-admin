/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.common.utils.PageUtils;
import com.jerry.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author  JerryXue
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
