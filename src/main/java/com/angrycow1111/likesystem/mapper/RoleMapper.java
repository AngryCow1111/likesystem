package com.angrycow1111.likesystem.mapper;

import com.angrycow1111.likesystem.entity.Role;

/**
 * RoleMapper
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-09
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}


