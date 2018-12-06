package com.neuedu.controller;

import com.neuedu.dao.ShopDao;
import com.neuedu.dao.ShopDaoImpl;
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

@WebServlet(name = "addProductServlet" ,urlPatterns = "/addProductServlet")
public class addProductServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("shop_id");
        int i = Integer.parseInt(id);
        String shop_name = req.getParameter("shop_name");
        String shop_des = req.getParameter("shop_des");
        String shop_img = req.getParameter("shop_img");
        String m = req.getParameter("shop_price");
        BigDecimal shop_price = new BigDecimal(m);
        String j = req.getParameter("shop_cateId");
        int shop_cateId = Integer.parseInt(j);
        String k = req.getParameter("shop_stock");
        int shop_stock = Integer.parseInt(k);
        String l = req.getParameter("shop_isGc");
        int shop_isGc = Integer.parseInt(l);

        ShopBusinese shopBusinese = new ShopBusineseImpl();
        Shops shops = new Shops(i,shop_name,shop_des,shop_img,shop_price,shop_cateId,shop_stock,shop_isGc);
        ShopDao shopsDao = new ShopDaoImpl();
        boolean b = shopsDao.addOneProduct(shops);
        System.out.println(b);
        if (b==true && i!=0 && !"".equals(i)&&shop_name !=null && !"".equals(shop_name)&& shop_img != null && !"".equals(shop_img)&& shop_price != null && !"".equals(shop_price))
        {
//            req.getRequestDispatcher("/pageServlet").forward(req,resp);
            resp.sendRedirect("/pageServlet");
            return;

        }
        req.getRequestDispatcher("addProduct.jsp").forward(req,resp);
    }
}