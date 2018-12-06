package com.neuedu.controller;

import com.neuedu.dao.ShopDao;
import com.neuedu.dao.ShopDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteServlet" ,value = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        ShopDao shopDao = new ShopDaoImpl();
        int i = Integer.parseInt(id);
        shopDao.deleteOneShop(i);
        req.getRequestDispatcher("/pageServlet").forward(req,resp);
    }
}
