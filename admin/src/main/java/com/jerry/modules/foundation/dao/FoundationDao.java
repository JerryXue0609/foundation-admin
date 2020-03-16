package com.jerry.modules.foundation.dao;

import com.jerry.modules.foundation.entity.FoundationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 基金实体类
 * 
 * @author Jerry
 * @email jerryxue0609@foxmail.com
 * @date 2020-03-15 22:51:33
 */
@Mapper
public interface FoundationDao extends BaseMapper<FoundationEntity> {
	
}
