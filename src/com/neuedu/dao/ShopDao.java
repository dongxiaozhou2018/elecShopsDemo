package com.neuedu.dao;

import com.neuedu.entity.Shops;

import java.util.List;

public interface ShopDao {

    public List<Shops> getAllShop();

    public  void deleteOneShop(int shop_id);

    public boolean addOneProduct(Shops shops);

    public Shops getOneShop(int shop_id);

    public void updateShop(Shops shop);

    //查询所有记录数
    public int getAllRecods();
    //查询某一页的数据
    public List<Shops> getShopByLimit(int startIndex, int pageSize);
}