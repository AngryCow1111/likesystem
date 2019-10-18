package com.angrycow1111.likesystem.test;

import com.angrycow1111.likesystem.entity.UserLike;
import com.angrycow1111.likesystem.service.UserLikeServiceImpl;
import org.junit.Test;

import java.util.Date;

public class UserLikeServiceImplTest extends UserLikeServiceImpl {

    @Test
    public void save() {
        UserLike userLike = new UserLike(1, "001", "002", 0, new Date(), new Date());
        boolean save = save(userLike);
        System.out.println(save);
    }
}