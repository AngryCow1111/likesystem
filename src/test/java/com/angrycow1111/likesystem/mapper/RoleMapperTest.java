package com.angrycow1111.likesystem.mapper;

import com.angrycow1111.likesystem.entity.Role;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * RoleMapperTest
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-10
 */
public class RoleMapperTest {
    private static RoleMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RoleMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RoleMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(RoleMapper.class, builder.openSession(true));
    }

    @Test
    public void testinsertSelective() throws FileNotFoundException {
        Role role = new Role();
        role.setName("haha");
        mapper.insertSelective(role);
    }
}
