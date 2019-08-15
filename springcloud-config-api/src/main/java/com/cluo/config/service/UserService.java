package com.cluo.config.service;

import com.cluo.config.domain.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/14 13:36
 */
public interface UserService {

    public List<Map<String,Object>> searchUserInfo();
}
