package com.yang.yun.service.impl;

import com.yang.yun.bean.UserAddress;
import com.yang.yun.service.OrderService;
import com.yang.yun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/30 9:15
 * @Version 1.0
 * 1.将服务的提供者注册到注册中心zookeeper(curator)
 *  1)导入dubbo的第依赖（2.6.2） 操作zookeepr的客户端
 *  2)配置服务
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    UserService userService;

    @Override
    public void init(String userId) {
        System.out.println("------userId-----:"+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList("5");
        System.out.println(userAddressList);
        userAddressList.stream().forEach(e-> System.out.println(e.getUserAddress()));
    }
}
