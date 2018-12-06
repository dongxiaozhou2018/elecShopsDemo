package com.neuedu.dao;

import com.neuedu.DBUtils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {



    //判断用户名是否存在
    public  boolean isExists(String username,String password)
    {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM user where username=?and userPsw=?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return false;
    }
    public static void main(String[] args) {
            UserDao userDao = new UserDao();
            boolean result = userDao.isExists("zhouhongyu11", "123123");
            System.out.println(result);
    }
}
