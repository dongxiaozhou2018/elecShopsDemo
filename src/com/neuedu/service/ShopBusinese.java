package com.neuedu.service;

import com.neuedu.entity.PageBean;
import com.neuedu.entity.Shops;

public interface ShopBusinese {

    //根据id查询具体商品
    public Shops getOneShop(int shop_id);

    //根据商品id修改商品
    public void updateShop(Shops shop);

    //根据当前页数和每页
    public PageBean  getShopByPaging(int pageNum, int pageSize);


}
