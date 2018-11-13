package com.angrycow1111.likesystem.service;

import com.angrycow1111.likesystem.entity.UserLike;
import com.angrycow1111.likesystem.mapper.UserLikeMapper;
import com.angrycow1111.likesystem.mq.RabbitmqConfig;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserLikeServiceImpl implements UserLikeService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserLikeMapper userLikeMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

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

    @Override
    public void SendMsg(String msg) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(RabbitmqConfig.EXCHANGE_A, RabbitmqConfig.ROUTINGKEY_A, msg, correlationId);

    }
}
