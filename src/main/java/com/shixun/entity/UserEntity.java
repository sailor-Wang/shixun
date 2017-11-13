package com.shixun.entity;

import java.io.Serializable;

/**
 * 名    称：
 * 功    能：
 * 创 建 人：sailor
 * 创建时间：2017/11/13下午1:34
 * 修 改 人：
 * 修改时间：
 * 说    明：
 * 版 本 号：
 */
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 6984887467342548891L;

    private Long id;
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
