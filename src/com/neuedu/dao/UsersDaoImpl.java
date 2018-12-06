package com.neuedu.dao;

import com.neuedu.DBUtils.DBUtils;
import com.neuedu.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDaoImpl implements UsersDao {
    @Override
    public boolean addOneUser(User user) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        try {
            preparedStatement = connection.prepareStatement("insert into user(userName,userPsw,userEmail,userTelPhone,userRegDate)values (?,?,?,?,?)");
            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getUserPsw());
            preparedStatement.setString(3,user.getUserEmail());
            preparedStatement.setString(4,user.getUserTelPhone());
            preparedStatement.setString(5,user.getUserRegDate());
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
            if(i != 0)
            {
                 return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            DBUtils.closeResource(connection,preparedStatement,null);
        }
        return false;
    }

    @Override
    public boolean isExists(User user) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from user where userName=?and userPsw=?");
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getUserPsw());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           DBUtils.closeResource(connection, preparedStatement, resultSet);
        }
        return false;
    }
}
