package com.angrycow1111.likesystem.controller;

import com.angrycow1111.likesystem.entity.UserLike;
import com.angrycow1111.likesystem.service.UserLikeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author 万里独行侠
 * @Description // 用户点赞类
 * @Date 23:11 2018/11/11 0011
 * @Classname UserLikeController
 **/
@Api
@RestController
@RequestMapping( "/userLike" )
public class UserLikeController {

    @Autowired
    private UserLikeService userLikeService;

    @ApiOperation( value = "添加点赞信息", notes = "添加点赞信息" )
    @ApiImplicitParam( name = "userLike", value = "UserLike实体类对象", required = true, dataType = "UserLike" )
    @PostMapping( "/markLiked" )
    public void markLiked(@RequestBody UserLike userLike) {

        System.out.println(userLikeService.save(userLike));

    }

    @ApiOperation( value = "查询点赞信息", notes = "根据ID查询点赞信息" )
    @GetMapping( "/findOne/{id}" )
    public UserLike findOne(@PathVariable( name = "id" ) Integer id) {

        return userLikeService.findById(id);
    }

}
