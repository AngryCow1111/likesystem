package com.angrycow1111.likesystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author 万里独行侠
 * @Description // 用户点赞类
 * @Date 11:31 2018/11/11 0011
 * @Classname UserLike
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLike {
    // 点赞记录ID
    private Integer id;
    // 点赞用户ID
    private String likedUserId;
    // 被点赞用户ID
    private String likedPostId;
    // 点赞状态 默认为未点赞
    private Integer status = LikedStatusEnum.UNLIKE.getCode();
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;


}
