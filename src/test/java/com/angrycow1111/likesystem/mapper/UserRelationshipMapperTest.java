package com.angrycow1111.likesystem.mapper;

import com.angrycow1111.likesystem.entity.UserRelationship;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * UserRelationshipMapperTest
 *
 * @author <a href="mailto:yanghui@pingtiao.com">yanghui</a>
 * @since 2019-06-10
 */
public class UserRelationshipMapperTest {
    private static UserRelationshipMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(UserRelationshipMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/UserRelationshipMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(UserRelationshipMapper.class, builder.openSession(true));
    }

    @Test
    public void testinsert() throws FileNotFoundException {
        mapper.insert(new UserRelationship());
    }
}
