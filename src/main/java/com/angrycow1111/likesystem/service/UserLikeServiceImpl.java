package com.angrycow1111.likesystem.service;

import com.angrycow1111.likesystem.entity.UserLike;
import com.angrycow1111.likesystem.mapper.UserLikeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserLikeServiceImpl implements UserLikeService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserLikeMapper userLikeMapper;

    @Override
    public boolean save(UserLike userLike) {
        userLike.setCreateTime(new Date());
        userLike.setUpdateTime(new Date());
        boolean flag = userLikeMapper.save(userLike);
        // 成功后，加入缓存
        if (flag) {
            redisTemplate.opsForValue().set("userLikeId::" + userLike.getId(), userLike);
        }
        return flag;
    }

    @Override
    public UserLike findById(Integer id) {
        return userLikeMapper.findById(id);
    }
}
