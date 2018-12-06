<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/26
  Time: 23:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改界面</title>
        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/update.js"></script>
</head>
<body>
<div id="right3">
<form action="UpdateServlet" method="post">
        商品ID：<input type="text" value="${shop.shop_id}" readonly="readonly"name="shop_id"/>
        <br/>
        商品名称：<input type="text" value="${shop.shop_name}"name="shop_name"/>
        <br/>
        商品介绍：<input type="text" value="${shop.shop_des}"name="shop_des"/>
        <br/>
        商品图片：<input type="text" value="${shop.shop_img}"name="shop_img"/>
        <br/>
        商品价格：<input type="text" value="${shop.shop_price}"name="shop_price"/>
        <br/>
        商品类型ID：<input type="text" value="${shop.shop_cateId}"name="shop_cateId"/>
        <br/>
        商品库存：<input type="text" value="${shop.shop_stock}"name="shop_stock"/>
        <br/>
        是否上架：<input type="text" value="${shop.shop_isGc}"name="shop_isGc"/>
        <br/>
        <input type="submit" value="确认修改"name="tijiao"/>

</form>
        <form action="pageServlet" method="post">
                <div><input type="submit" value="返回商品列表"></div>
        </form>
</div>
</body>
</html>
