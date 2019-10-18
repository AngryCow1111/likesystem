package com.angrycow1111.likesystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.angrycow1111.likesystem.mapper.UserRelationshipMapper;
import com.angrycow1111.likesystem.entity.UserRelationship;

/**
 * ${CLASSNAME}
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-10
 */
@Service
public class UserRelationshipService {

    @Resource
    private UserRelationshipMapper userRelationshipMapper;


    public int deleteByPrimaryKey(Long id) {
        return userRelationshipMapper.deleteByPrimaryKey(id);
    }


    public int insert(UserRelationship record) {
        return userRelationshipMapper.insert(record);
    }


    public int insertSelective(UserRelationship record) {
        return userRelationshipMapper.insertSelective(record);
    }


    public UserRelationship selectByPrimaryKey(Long id) {
        return userRelationshipMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(UserRelationship record) {
        return userRelationshipMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(UserRelationship record) {
        return userRelationshipMapper.updateByPrimaryKey(record);
    }

}

