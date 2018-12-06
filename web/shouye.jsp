<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.entity.Shops" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/19
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页面</title>
    <link rel="stylesheet" href="css/shouye.css">
    <link rel="stylesheet" href="css/productList.css">
    <link rel="stylesheet" href="css/addproduct.css">
    <link rel="stylesheet" href="css/deleteproduct.css">
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/mainpage.js"></script>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<div id="container">
    <!--logo-->
    <div id="title"><div>logo here</div></div>
    <div id="content">
        <!--左侧导航栏-->
        <div id="leftmenu">
            <div id="managermenu" ><div>用户与商品管理</div></div>
           <%--<a href="/pageServlet" target="1"><div id="selectmenu" class="menustyle">查看商品</div></a>--%>
            <%--<a href="addProduct.jsp" target="1"><div id="addmenu" class="menustyle">添加商品</div></a>--%>
            <%--<div id="updatemenu" class="menustyle">修改商品</div>--%>

            <div id="selectmenu" class="menustyle">商品管理</div>
            <%--<div id="addmenu" class="menustyle">添加商品</div>--%>
            <div id="classesmenu" class="menustyle">类别管理</div>
            <div id="homepagemenu" class="menustyle">首页类别管理</div>
            <div id="orderinfo" class="menustyle">订单信息</div>
            <div id="aboutus" class="menustyle">关于</div>
        </div>
        <!--管理显示界面-->
        <div id="right">

            <%--欢迎界面--%>
            <div id="right0">welcome home</div>
                <%--<iframe src="shouye.jsp" frameborder="0"name="1" width="100%" height="100%"></iframe>--%>
                <%--查询界面--%>
                <div id="right1"><iframe src="pageServlet" width="100%" height="100%" name="jumpgo"></iframe></div>
                <%--添加界面--%>
                <div id="right2"><iframe src="addProduct.jsp" width="100%" height="100%" name="jumpgo"></iframe></div>
                <%--修改界面--%>
                <div id="right3"><iframe src="update.jsp" width="100%" height="100%" name="jumpgo"></iframe></div>
            <!--查看商品信息界面-->
            <%--<div id="right1">--%>
                <%--<table id="productlist1" border="1px">--%>
                    <%--<tr>--%>
                        <%--<th>商品ID</th>--%>
                        <%--<th>商品名称</th>--%>
                        <%--<th>商品描述</th>--%>
                        <%--<th>商品图片</th>--%>
                        <%--<th>商品价格</th>--%>
                        <%--<th>商品类别ID</th>--%>
                        <%--<th>商品库存</th>--%>
                        <%--<th>商品是否上架</th>--%>
                        <%--<th>商品操作</th>--%>
                    <%--</tr>--%>
                    <%--<c:forEach items="${shops}" var="shop">--%>
                        <%--<tr>--%>
                            <%--<td>${shop.shop_id}</td>--%>
                            <%--<td>${shop.shop_name}</td>--%>
                            <%--<td>${shop.shop_des}</td>--%>
                            <%--<td><img src="http://localhost:8080/photo/${shop.shop_img}"width="50px" height="50px"></td>--%>
                            <%--<td>${shop.shop_price}</td>--%>
                            <%--<td>${shop.shop_cateId}</td>--%>
                            <%--<td>${shop.shop_stock}</td>--%>
                            <%--<td>${shop.shop_isGc}</td>--%>
                            <%--<td>--%>
                                <%--<div class="delete"><a href="DeleteServlet?id=${shop.shop_id}">删除</a></div>--%>
                                <%--<div class="change"><a href="QueryServlet?id=${shop.shop_id}">修改</a></div>--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                    <%--</c:forEach>--%>
                <%--</table>--%>
            <%--</div>--%>
        </div>
    </div>
</div>
</body>
