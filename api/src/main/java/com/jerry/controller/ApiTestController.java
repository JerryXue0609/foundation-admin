/**
 * Copyright (c) 2020 Jerry All rights reserved.
 *
 * jerry
 *
 *
 */

package com.jerry.controller;

import com.jerry.common.utils.Result;
import com.jerry.entity.UserEntity;
import com.jerry.annotation.Login;
import com.jerry.annotation.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 测试接口
 *
 * @author  JerryXue
 */
@RestController
@RequestMapping("/api")
@Api(tags="测试接口")
public class ApiTestController {

    @Login
    @GetMapping("userInfo")
    @ApiOperation(value="获取用户信息", response= UserEntity.class)
    public Result userInfo(@ApiIgnore @LoginUser UserEntity user){
        return Result.ok().put("user", user);
    }

    @Login
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public Result userInfo(@ApiIgnore @RequestAttribute("userId") Integer userId){
        return Result.ok().put("userId", userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public Result notToken(){
        return Result.ok().put("msg", "无需token也能访问。。。");
    }

}
