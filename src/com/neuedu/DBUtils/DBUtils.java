package com.neuedu.DBUtils;

import java.sql.*;

/**
 * 工具类
 * */
public class DBUtils {
    static
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        Connection connection =null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newshops", "root", "666666");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeResource(Connection connection, Statement statement, ResultSet rs)
    {
        if (null != rs)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != statement)
        {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (null != connection)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
