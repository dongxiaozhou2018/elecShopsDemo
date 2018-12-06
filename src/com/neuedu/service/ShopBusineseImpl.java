package com.neuedu.service;

import com.neuedu.dao.ShopDao;
import com.neuedu.dao.ShopDaoImpl;
import com.neuedu.entity.PageBean;
import com.neuedu.entity.Shops;

import java.util.List;

public class ShopBusineseImpl implements ShopBusinese {

    private ShopDao shopDao = new ShopDaoImpl();
    @Override
    public Shops getOneShop(int shop_id) {
        return shopDao.getOneShop(shop_id);
    }

    @Override
    public void updateShop(Shops shop) {
        shopDao.updateShop(shop);
    }

    @Override
    public PageBean getShopByPaging(int pageNum, int pageSize) {
        //查询所有记录
        int allRecods = shopDao.getAllRecods();
        //构建PageBean对象
        PageBean pageBean = new PageBean(pageNum,pageSize,allRecods);
        //拿到PageBean中的索引
        Integer startIndex = pageBean.getStartIndex();
        //根据索引和页面数量查询商品
        List<Shops> shopByLimit = shopDao.getShopByLimit(startIndex, pageSize);
        pageBean.setShops(shopByLimit);
        return pageBean;
    }
}
