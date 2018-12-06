<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.entity.Shops" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/21
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息页面</title>
</head>
<body>

<form action="QueryServlet">
    <input type="submit" name="提交表单" >
</form>
<%--<table >--%>
    <%--<% Object shops = request.getAttribute("shops");--%>
            <%--if (shops instanceof List)--%>
            <%--{--%>
            <%--List<Shops> lists = (List<Shops>)shops;--%>
            <%--for (Shops s:lists) {--%>
    <%--%>--%>
    <%--<tr>--%>
        <%--<td><%=s.getShop_id()%></td>--%>
        <%--<td><%=s.getShop_name()%></td>--%>
        <%--<td><img src="http://localhost:8080/photo/<%=s.getShop_img()%>"></td>--%>
        <%--<td><%=s.getShop_des()%></td>--%>
        <%--<td><%=s.getShop_price()%></td>--%>
    <%--</tr>--%>
    <%--<%--%>
            <%--}--%>
        <%--}--%>
    <%--%>--%>
<%--</table>--%>
<table>
        <tr>
            <th>商品ID</th>
            <th>商品名称</th>
            <th>商品图片</th>
            <th>商品描述</th>
            <th>商品价格</th>
        </tr>
            <c:forEach items="${shops}" var="shop">
                <tr>
                    <td>${shop.shop_id}</td>
                    <td>${shop.shop_name}</td>
                    <td><img src="http://localhost:8080/photo/${shop.shop_img}"></td>
                    <td>${shop.shop_des}</td>
                    <td>${shop.shop_price}</td>
                    <td><a href="DeleteServlet?id=${shop.shop_id}">删除</a></td>
                    <td><a href="QueryServlet?id=${shop.shop_id}">修改</a></td>
                </tr>
            </c:forEach>
</table>
</body>
</html>