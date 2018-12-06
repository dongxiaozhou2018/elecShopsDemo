package com.neuedu.controller;


import com.neuedu.entity.PageBean;
import com.neuedu.service.ShopBusinese;
import com.neuedu.service.ShopBusineseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pageServlet",urlPatterns = "/pageServlet")
public class pageServlet extends HttpServlet {
      @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          req.setCharacterEncoding("utf-8");

          String pageNum = req.getParameter("pageNum");
            int changePage = 0;
            if (pageNum == null || "".equals(pageNum))
            {
                changePage = 1;
            }else
            {
                changePage = Integer.parseInt(pageNum);
            }
            ShopBusinese shopBusinese = new ShopBusineseImpl();
            PageBean shopByPaging = shopBusinese.getShopByPaging(changePage, 7);
            req.setAttribute("pageBean",shopByPaging);
            req.getRequestDispatcher("Queryshops.jsp").forward(req,resp);
        }
}
