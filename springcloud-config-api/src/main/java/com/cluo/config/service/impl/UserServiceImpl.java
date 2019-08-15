package com.cluo.config.service.impl;

import com.cluo.config.mapper.UserMapper;
import com.cluo.config.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/14 13:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map<String,Object>> searchUserInfo() {
        return userMapper.selectUserInfo();
    }
}
