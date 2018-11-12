package com.angrycow1111.likesystem;

import com.angrycow1111.likesystem.entity.UserLike;
import com.angrycow1111.likesystem.service.UserLikeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith( SpringRunner.class )
@SpringBootTest
public class LikesystemApplicationTests {

    @Autowired
    private UserLikeService userLikeService;

    @Test
    public void contextLoads() {
        UserLike userLike = new UserLike(null, "001", "002", 0, new Date(), new Date());
        userLikeService.save(userLike);
        Integer id = userLike.getId();
    }

}
