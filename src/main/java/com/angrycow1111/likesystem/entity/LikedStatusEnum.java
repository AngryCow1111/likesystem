package com.angrycow1111.likesystem.entity;

import lombok.Getter;

/**
 * @Author 万里独行侠
 * @Description // 点赞状态
 * @Date 11:29 2018/11/11 0011
 * @Classname LikedStatusEnum
 **/
@Getter
public enum LikedStatusEnum {
    Like(1, "点赞"),
    UNLIKE(0, "未点赞/取消点赞");

    private int code;
    private String msg;

    LikedStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
