package com.jerry.modules.foundation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jerry.common.utils.PageUtils;
import com.jerry.modules.foundation.entity.FoundationEntity;

import java.util.Map;

/**
 * 基金实体类
 *
 * @author Jerry
 * @email jerryxue0609@foxmail.com
 * @date 2020-03-15 22:51:33
 */
public interface FoundationService extends IService<FoundationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    boolean saveEntity(FoundationEntity foundationEntity);

    boolean updateEntity(FoundationEntity foundationEntity);
}

