package com.cluo.config.controller;

import com.cluo.config.domain.UserInfo;
import com.cluo.config.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/14 13:39
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test/user")
    public List<Map<String,Object>> searchUserInfo(){
      return userService.searchUserInfo();
    }
}
