package com.jerry.modules.foundation.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jerry.common.utils.PageUtils;
import com.jerry.common.utils.Query;

import com.jerry.modules.foundation.dao.FoundationDao;
import com.jerry.modules.foundation.entity.FoundationEntity;
import com.jerry.modules.foundation.service.FoundationService;


@Service("foundationService")
public class FoundationServiceImpl extends ServiceImpl<FoundationDao, FoundationEntity> implements FoundationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FoundationEntity> page = this.page(
                new Query<FoundationEntity>().getPage(params),
                new QueryWrapper<FoundationEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public boolean saveEntity(FoundationEntity foundationEntity) {
        foundationEntity.setCreatetime(new Date());
        return this.save(foundationEntity);
    }

    @Override
    public boolean updateEntity(FoundationEntity foundationEntity) {
        foundationEntity.setUpdatetime(new Date());
        return this.updateById(foundationEntity);
    }

}
