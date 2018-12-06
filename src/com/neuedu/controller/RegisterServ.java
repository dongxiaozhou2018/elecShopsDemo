package com.neuedu.controller;


import com.neuedu.dao.UsersDao;
import com.neuedu.dao.UsersDaoImpl;
import com.neuedu.entity.User;
import com.neuedu.service.UserBusinese;
import com.neuedu.service.UserBusineseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Servlet的生命周期

@WebServlet(name = "RegisterServ" ,value={"/registerServ"})
public class RegisterServ extends HttpServlet {

    public RegisterServ(){
        System.out.println("构造方法");

    }
    @Override
    public void init() throws ServletException {
        System.out.println("初始化方法");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service方法");
        req.setCharacterEncoding("utf-8");

        String userId = req.getParameter("userId");
        String userName = req.getParameter("userName");
        String userPsw = req.getParameter("userPsw");
        String userEmail = req.getParameter("userEmail");
        String userTelPhone = req.getParameter("userTelPhone");
        String userRegDate = req.getParameter("userRegDate");
        User user = new User(null,userName,userPsw,userEmail,userTelPhone,userRegDate);
        UsersDao usersDao = new UsersDaoImpl();
        boolean b = usersDao.addOneUser(user);
        System.out.println(b);
        boolean exists = false;
        if (userName !=null && !"".equals(userName)&& userPsw != null && !"".equals(userPsw))
        {
            UserBusinese userBusinese = new UserBusineseImpl();
            User compareuser = new User();
            compareuser.setUserName(userName);
            compareuser.setUserPsw(userPsw);
            exists = userBusinese.userIsExist(compareuser);
        }
        System.out.println(exists);
        if (b==true&& exists== true )
        {
            req.getRequestDispatcher("index.jsp").forward(req,resp);
            return;
        }else{
            req.setAttribute("message","注册失败");
            req.getRequestDispatcher("userRegister.jsp").forward(req,resp);
        }
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
