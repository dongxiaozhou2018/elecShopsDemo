package com.neuedu.test;


import com.neuedu.dao.UsersDao;
import com.neuedu.dao.UsersDaoImpl;
import com.neuedu.entity.PageBean;
import com.neuedu.entity.User;
import com.neuedu.service.ShopBusinese;
import com.neuedu.service.ShopBusineseImpl;

public class Test {
    public static void main(String[] args) {

//        UsersDao usersDao = new UsersDaoImpl();
//        User user = new User(null,"zhouhongyu123","112323456","123123@qq.com","12345678912","123456");
//        boolean b = usersDao.addOneUser(user);
//        System.out.println(b);

//        ShopDao shopDao = new ShopDaoImpl();
//        List<Shops> allShop = shopDao.getAllShop();
//        System.out.println(allShop);

//        ShopDao shopDao = new ShopDaoImpl();
//        shopDao.deleteOneShop(1);

//        ShopDao shopDao = new ShopDaoImpl();
//        Shops shops = new Shops(null,"小米","jianpan.jpg","好敲的机械键盘",null);
//        boolean b = shopDao.addOneProduct(shops);
//        System.out.println(b);

//        ShopDaoImpl shopDao1 = new ShopDaoImpl();
//        Shops oneShop = shopDao1.getOneShop(15);
//        System.out.println(oneShop);

        ShopBusinese shopBusinese = new ShopBusineseImpl();
        PageBean shopByPaging = shopBusinese.getShopByPaging(1,5);
        System.out.println(shopByPaging.getShops());
    }
}