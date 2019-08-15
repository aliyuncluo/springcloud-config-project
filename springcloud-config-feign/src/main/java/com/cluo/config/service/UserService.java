package com.cluo.config.service;

import com.cluo.config.domain.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/14 13:45
 */
@FeignClient(value = "CONFIG-API")
public interface UserService {

    @GetMapping("/test/user")
    public List<Map<String,Object>> searchUserInfo();
}
