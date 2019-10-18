package com.angrycow1111.likesystem.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.angrycow1111.likesystem.entity.Role;
import com.angrycow1111.likesystem.mapper.RoleMapper;
/**
 * ${NAME}
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-09
 */
@Service
public class RoleService{

    @Resource
    private RoleMapper roleMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    
    public Role selectByPrimaryKey(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}
