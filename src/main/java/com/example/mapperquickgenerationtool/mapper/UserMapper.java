package com.example.mapperquickgenerationtool.mapper;

import com.example.mapperquickgenerationtool.model.User;

public interface UserMapper {
    int insert(User row);

    int insertSelective(User row);
}