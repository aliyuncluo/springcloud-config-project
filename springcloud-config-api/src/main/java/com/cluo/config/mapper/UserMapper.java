package com.cluo.config.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author luolei
 * @Date 2019/8/15 8:57
 */
@Mapper
public interface UserMapper {
    List<Map<String,Object>> selectUserInfo();
}
