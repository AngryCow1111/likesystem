package com.angrycow1111.likesystem.mapper;

import com.angrycow1111.likesystem.entity.UserLike;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserLikeMapper {
    @Insert( "INSERT INTO user_like VALUES (#{id}, #{likedUserId}, #{likedPostId}, #{status}, #{createTime}, #{updateTime})" )
    @Options( useGeneratedKeys = true, keyProperty = "id", keyColumn = "id" )
    boolean save(UserLike userLike);

    @Results( value = {
            @Result( column = "liked_user_id", property = "likedUserId" ),
            @Result( column = "liked_post_id", property = "likedPostId" ),
            @Result( column = "status", property = "status" ),
            @Result( column = "create_time", property = "createTime" ),
            @Result( column = "update_time", property = "updateTime" )
    } )
    @ResultType(value = UserLike.class)
    @Select( "select * from user_like where id=#{id}" )
    UserLike findById(Integer id);
}
