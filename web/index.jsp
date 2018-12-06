<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/19
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>登录</title>
  <link rel="stylesheet" href="css/login.css">
</head>
  <body>
  <div id="contain">
    <div id="login_main"class="login_main">
      <div id="Administrator"><span id="Atitle">用户登录</span></div>
        <form action="helloServlet" method="post">
          <div id="yonghuming"class="yonghuming">
            <input type="text" name="username"placeholder="用户名"id="usernameinput"/>
          </div>
          <div id="mima"class="mima">
            <input type="password" name="userPsw"placeholder="密码"id="password"/>
          </div>
          <div id="butten"class="butten"><input type="submit" name="提交"id="butten_input"value="登录"/></div>
          <div><a target="_blank" href="userRegister.jsp"><div id="chuangjianzhanghu">创建账户</div></a></div>
        </form>
    </div>
  </div>
  </body>
</html>
