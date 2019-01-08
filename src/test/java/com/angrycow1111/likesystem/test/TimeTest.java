package com.angrycow1111.likesystem.test;

import java.util.Date;

public class TimeTest {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(9999999999999L));

        String srcStr = "123456789";
        String substring = srcStr.substring(srcStr.length() - 3);

    }
}
