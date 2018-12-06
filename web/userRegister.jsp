<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/20
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册页面</title>
    <link rel="stylesheet" href="css/userRegister.css">
    <script type="text/javascript" src="js/userRegister.js"></script>
</head>
<body>
<div id="user_register_body">
    <div id="user_register_body_move">
        <form action="registerServ">
            <div class="userregister_width"><input type="text" id="username" name="userName" placeholder="用户名"><span id="span1"></span></div>
            <div class="userregister_width"><input type="password" id="password" name="userPsw" placeholder="密码"><span id="span2"></span></div>
            <div class="userregister_width"><input type="password" id="repassword" name="repassword" placeholder="确认密码"><span id="span3"></span></div>
            <div class="userregister_width"><input type="email" id="email" name="userEmail" placeholder="邮箱"><span id="span4"></span></div>
            <div class="userregister_width"><input type="text" id="tel" name="userTelPhone" placeholder="手机号"><span id="span5"></span></div>
            <div class="userregister_width"><input type="text" id="zipcode" name="zipcode" placeholder="邮编"><span id="span6"></span></div>
            <div class="userregister_width"><input type="text" id="id" name="userRegDate" placeholder="身份证号"><span id="span7"></span></div>
            <div class="userregister_width"><input type="submit" id="submit" value="提交"></div>
        </form>
    </div>
</div>
<%=request.getAttribute("message")%>
</body>
</html>
