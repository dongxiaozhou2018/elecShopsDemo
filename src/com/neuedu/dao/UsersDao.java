package com.neuedu.dao;

import com.neuedu.entity.User;

/**
 * 用户数据层
 * */
public interface UsersDao {

    //添加数据
    public boolean addOneUser(User user);

    public  boolean isExists(User user);

}
