package com.neuedu.controller;


import com.neuedu.entity.User;
import com.neuedu.service.UserBusinese;
import com.neuedu.service.UserBusineseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServ",urlPatterns = "/helloServlet")
public class helloServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        response.getWriter().write("hello Servl");
//
//    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String userPsw = req.getParameter("userPsw");
        boolean exists = false;
        if (username !=null && !"".equals(username)&& userPsw != null && !"".equals(userPsw))
        {
            UserBusinese userBusinese = new UserBusineseImpl();
            User compareuser = new User();
            compareuser.setUserName(username);
            compareuser.setUserPsw(userPsw);
            exists = userBusinese.userIsExist(compareuser);
        }
        if (exists == true)
        {
            Cookie cookie = new Cookie("logincookie",username);
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
            req.getRequestDispatcher("shouye.jsp").forward(req,resp);
            return;
        }else
        {
            Cookie[] cookies = req.getCookies();
            if (cookies != null){
                for (Cookie c:cookies) {
                    if ("logincookie".equals(c.getName()))
                    {
                        req.getRequestDispatcher("shouye.jsp").forward(req,resp);
                        return;
                    }else{
                        req.getRequestDispatcher("index.jsp").forward(req,resp);
                        return;
                    }
                }
            }
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
    }

    //    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        String userPsw = req.getParameter("userPsw");
//        boolean exists = false;
//        if (username !=null && !"".equals(username)&& userPsw != null && !"".equals(userPsw))
//        {
//            UserBusinese userBusinese = new UserBusineseImpl();
//            User compareuser = new User();
//            compareuser.setUserName(username);
//            compareuser.setUserPsw(userPsw);
//            exists = userBusinese.userIsExist(compareuser);
//        }
//        if (exists == true)
//        {
//            Cookie cookie = new Cookie("logincookie",username);
//            cookie.setMaxAge(60);
//            resp.addCookie(cookie);
//            req.getRequestDispatcher("shouye.jsp").forward(req,resp);
//            return;
//        }else
//        {
//            Cookie[] cookies = req.getCookies();
//            if (cookies != null){
//                for (Cookie c:cookies) {
//                    if ("logincookie".equals(c.getName()))
//                    {
//                        req.getRequestDispatcher("shouye.jsp").forward(req,resp);
//                        return;
//                    }else{
//                        req.getRequestDispatcher("index.jsp").forward(req,resp);
//                        return;
//                    }
//                }
//            }
//            req.getRequestDispatcher("index.jsp").forward(req,resp);
//        }
//    }
//}