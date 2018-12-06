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


@WebServlet(name = "QueryServlet",urlPatterns = "/QueryServlet")
    public class QueryServlet extends HttpServlet {
        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");

            String id = req.getParameter("id");
            int i = Integer.parseInt(id);
            ShopBusinese shopBusinese = new ShopBusineseImpl();
            Shops oneShop = shopBusinese.getOneShop(i);
            req.setAttribute("shop",oneShop);
            req.getRequestDispatcher("update.jsp").forward(req,resp);
        }
    }


