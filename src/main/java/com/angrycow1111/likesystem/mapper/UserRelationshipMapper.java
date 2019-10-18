package com.angrycow1111.likesystem.mapper;

import com.angrycow1111.likesystem.entity.UserRelationship;

/**
 * ${NAME}
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-10
 */
public interface UserRelationshipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRelationship record);

    int insertSelective(UserRelationship record);

    UserRelationship selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRelationship record);

    int updateByPrimaryKey(UserRelationship record);
}