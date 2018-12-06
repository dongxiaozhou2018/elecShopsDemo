package com.neuedu.dao;

import com.neuedu.DBUtils.DBUtils;
import com.neuedu.entity.Shops;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShopDaoImpl implements ShopDao {
    //查询所有商品
    @Override
    public List<Shops> getAllShop() {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        List<Shops> lists = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement("select * from shop");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int shop_id = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_des = resultSet.getString("shop_des");
                String shop_img = resultSet.getString("shop_img");
                BigDecimal shop_price = resultSet.getBigDecimal("shop_price");
                int shop_cateId = resultSet.getInt("shop_cateId");
                int shop_stock = resultSet.getInt("shop_stock");
                int shop_isGc = resultSet.getInt("shop_isGc");
                Shops shops = new Shops(shop_id,shop_name,shop_des,shop_img,shop_price,shop_cateId,shop_stock,shop_isGc);
                lists.add(shops);
            }
            return lists;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return lists;
    }

    //删除一个商品
    @Override
    public void deleteOneShop(int shop_id)
    {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("delete from shop where shop_id=?");
            preparedStatement.setInt(1,shop_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtils.closeResource(connection,preparedStatement,null);
        }
    }

    //添加一个商品
    @Override
    public boolean addOneProduct(Shops shop) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        try {
            preparedStatement = connection.prepareStatement("INSERT into shop(shop_name,shop_des,shop_img,shop_price,shop_cateId,shop_stock,shop_isGc) values (?,?,?,?,?,?,?)");
            preparedStatement.setString(1,shop.getShop_name());
            preparedStatement.setString(2,shop.getShop_des());
            preparedStatement.setString(3,shop.getShop_img());
            preparedStatement.setBigDecimal(4,shop.getShop_price());
            preparedStatement.setInt(5,shop.getShop_cateId());
            preparedStatement.setInt(6,shop.getShop_stock());
            preparedStatement.setInt(7,shop.getShop_isGc());
            int i = preparedStatement.executeUpdate();
            if(i != 0)
            {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,null);
        }
        return false;
    }

    //按照商品id查出该商品
    public Shops getOneShop(int shop_id)
    {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            preparedStatement = connection.prepareStatement("select * from shop where shop_id=?");
            preparedStatement.setInt(1,shop_id);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int shop_id1 = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_des = resultSet.getString("shop_des");
                String shop_img = resultSet.getString("shop_img");
                BigDecimal shop_price = resultSet.getBigDecimal("shop_price");
                int shop_cateId = resultSet.getInt("shop_cateId");
                int shop_stock = resultSet.getInt("shop_stock");
                int shop_isGc = resultSet.getInt("shop_isGc");
                Shops shops = new Shops(shop_id,shop_name,shop_des,shop_img,shop_price,shop_cateId,shop_stock,shop_isGc);
                return shops;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return null;
    }

    //修改商品
    @Override
    public void updateShop(Shops shop) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        try {
            preparedStatement = connection.prepareStatement("UPDATE shop set shop_name=?,shop_des=?,shop_img=?,shop_price=?,shop_cateId=?,shop_stock=?,shop_isGc=? where shop_id=?");
            preparedStatement.setString(1,shop.getShop_name());
            preparedStatement.setString(2,shop.getShop_des());
            preparedStatement.setString(3,shop.getShop_img());
            preparedStatement.setBigDecimal(4,shop.getShop_price());
            preparedStatement.setInt(5,shop.getShop_cateId());
            preparedStatement.setInt(6,shop.getShop_stock());
            preparedStatement.setInt(7,shop.getShop_isGc());
            preparedStatement.setInt(8,shop.getShop_id());
            int i = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,null);
        }
    }

    //查询所有商品数
    @Override
    public int getAllRecods() {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            preparedStatement = connection.prepareStatement("select count(*) as cout from shop");
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
            {
                return resultSet.getInt("cout");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return 0;
    }

    @Override
    public List<Shops> getShopByLimit(int startIndex, int pageSize) {
        Connection connection = DBUtils.getConnection();
        PreparedStatement preparedStatement =null;
        List<Shops> shops = new ArrayList<>();
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement("select * from shop LIMIT ?,?");
            preparedStatement.setInt(1,startIndex);
            preparedStatement.setInt(2,pageSize);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int shop_id = resultSet.getInt("shop_id");
                String shop_name = resultSet.getString("shop_name");
                String shop_des = resultSet.getString("shop_des");
                String shop_img = resultSet.getString("shop_img");
                BigDecimal shop_price = resultSet.getBigDecimal("shop_price");
                int shop_cateId = resultSet.getInt("shop_cateId");
                int shop_stock = resultSet.getInt("shop_stock");
                int shop_isGc = resultSet.getInt("shop_isGc");
                Shops shops1 = new Shops(shop_id,shop_name,shop_des,shop_img,shop_price,shop_cateId,shop_stock,shop_isGc);
                shops.add(shops1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return shops;
    }
}