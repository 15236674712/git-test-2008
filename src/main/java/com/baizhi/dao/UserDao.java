package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {

    User queryById(String id);

    List<User> queryAll();

}
