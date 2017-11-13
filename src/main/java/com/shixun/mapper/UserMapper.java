package com.shixun.mapper;

import com.shixun.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 名    称：
 * 功    能：
 * 创 建 人：sailor
 * 创建时间：2017/11/13下午1:33
 * 修 改 人：
 * 修改时间：
 * 说    明：
 * 版 本 号：
 */
@Mapper
public interface UserMapper {
    List<UserEntity> getAll();
}
