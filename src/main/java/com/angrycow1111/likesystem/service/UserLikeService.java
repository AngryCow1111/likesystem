package com.angrycow1111.likesystem.service;

import com.angrycow1111.likesystem.entity.UserLike;

public interface UserLikeService {
    /**
     * 功能描述: 保存点赞记录
     *
     * @methodname:save
     * @param: [userLike]
     * @return: com.angrycow1111.likesystem.entity.UserLike
     * @author:
     * @date: 2018/11/11 0011 14:36
     */
    boolean save(UserLike userLike);
    UserLike findById(Integer id);
    void SendMsg(String msg);
}
