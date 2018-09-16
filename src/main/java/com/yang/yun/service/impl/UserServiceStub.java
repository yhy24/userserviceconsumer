package com.yang.yun.service.impl;

import com.yang.yun.bean.UserAddress;
import com.yang.yun.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/30 16:08
 * @Version 1.0
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

//    传入的是userService的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String s) {
        System.out.println("--UserServiceStub----..........."+s);
        if (!StringUtils.isEmpty(s)) {
            System.out.println("--s--"+s);
            return userService.getUserAddressList(s);
        }
        return null;
    }
}
