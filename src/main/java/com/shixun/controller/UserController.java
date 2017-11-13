package com.shixun.controller;

import com.shixun.entity.UserEntity;
import com.shixun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 名    称：
 * 功    能：
 * 创 建 人：sailor
 * 创建时间：2017/11/13下午1:32
 * 修 改 人：
 * 修改时间：
 * 说    明：
 * 版 本 号：
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/v1/getUsers", method = RequestMethod.GET)
    public List<UserEntity> getUsers(){
        return userService.getAll();
    }
}
