package com.jerry.modules.foundation.controller;

import java.util.Arrays;
import java.util.Map;


import com.jerry.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jerry.modules.foundation.entity.FoundationEntity;
import com.jerry.modules.foundation.service.FoundationService;
import com.jerry.common.utils.PageUtils;
import com.jerry.common.utils.Result;



/**
 * 基金实体类
 *
 * @author Jerry
 * @email jerryxue0609@foxmail.com
 * @date 2020-03-15 22:51:33
 */
@RestController
@RequestMapping("foundation/foundation")
public class FoundationController {
    @Autowired
    private FoundationService foundationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("foundation:foundation:list")
    public Result list(@RequestParam Map<String, Object> params){
        PageUtils page = foundationService.queryPage(params);

        return Result.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("foundation:foundation:info")
    public Result info(@PathVariable("id") Integer id){
        FoundationEntity foundation = foundationService.getById(id);

        return Result.ok().put("foundation", foundation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("foundation:foundation:save")
    public Result save(@RequestBody FoundationEntity foundation){
        foundationService.save(foundation);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("foundation:foundation:update")
    public Result update(@RequestBody FoundationEntity foundation){
        ValidatorUtils.validateEntity(foundation);
        foundationService.updateById(foundation);
        
        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("foundation:foundation:delete")
    public Result delete(@RequestBody Integer[] ids){
        foundationService.removeByIds(Arrays.asList(ids));

        return Result.ok();
    }

}
