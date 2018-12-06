package com.neuedu.controller;


import com.neuedu.entity.Shops;
import com.neuedu.service.ShopBusinese;
import com.neuedu.service.ShopBusineseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "UpdateServlet",urlPatterns = "/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String id = req.getParameter("shop_id");
        int i = Integer.parseInt(id);
        String name = req.getParameter("shop_name");
        String des = req.getParameter("shop_des");
        String img = req.getParameter("shop_img");
        String price = req.getParameter("shop_price");
        BigDecimal bigDecimal = new BigDecimal(price);
        String j = req.getParameter("shop_cateId");
        int shop_cateId = Integer.parseInt(j);
        String k = req.getParameter("shop_stock");
        int shop_stock = Integer.parseInt(k);
        String l = req.getParameter("shop_isGc");
        int shop_isGc = Integer.parseInt(l);

        if (id!=null && !"".equals(id)&& name != null && !"".equals(name)&& des != null && !"".equals(des)&& img != null && !"".equals(img)&&!"".equals(price)&&!"".equals(j)&& !"".equals(k)&& !"".equals(l))
        {
            ShopBusinese shopBusinese = new ShopBusineseImpl();
            Shops shops = new Shops(i,name,des,img,bigDecimal,shop_cateId,shop_stock,shop_isGc);
            shopBusinese.updateShop(shops);
            req.getRequestDispatcher("/pageServlet").forward(req,resp);
        }else
        {
            req.getRequestDispatcher("/pageServlet").forward(req,resp);
        }

    }
}