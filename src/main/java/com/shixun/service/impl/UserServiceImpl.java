package com.shixun.service.impl;

import com.shixun.entity.UserEntity;
import com.shixun.mapper.UserMapper;
import com.shixun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 名    称：
 * 功    能：
 * 创 建 人：sailor
 * 创建时间：2017/11/13下午9:27
 * 修 改 人：
 * 修改时间：
 * 说    明：
 * 版 本 号：
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> getAll(){
        return userMapper.getAll();
    }
}
