<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/12/4
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询界面</title>
    <link rel="stylesheet" href="css/productList.css"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>
<!--查看商品信息界面-->
<div id="right1">
    <table id="productlist1" border="1px">
        <tr>
            <th>商品ID</th>
            <th>商品名称</th>
            <th>商品描述</th>
            <th>商品图片</th>
            <th>商品价格</th>
            <th>类别ID</th>
            <th>商品库存</th>
            <th>是否上架</th>
            <th>商品操作</th>
        </tr>
        <c:forEach items="${pageBean.shops}" var="shop">
            <tr>
                <td>${shop.shop_id}</td>
                <td>${shop.shop_name}</td>
                <td>${shop.shop_des}</td>
                <td><img src="http://10.25.148.199:80/photo/${shop.shop_img}"width="50px" height="50px"></td>
                <td>${shop.shop_price}</td>
                <td>${shop.shop_cateId}</td>
                <td>${shop.shop_stock}</td>
                <td>${shop.shop_isGc}</td>
                <td>
                    <a href="DeleteServlet?id=${shop.shop_id}"><div class="delete">删除</div></a>
                    <a href="addProduct.jsp"><div class="add">添加</div></a>
                    <a href="QueryServlet?id=${shop.shop_id}"><div class="change">修改</div></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center">
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li>
                    <c:if test="${pageBean.pageNum>1}">
                        <a href="${pageContext.request.contextPath}/pageServlet?pageNum=${pageBean.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>
                </li>
                <c:forEach begin="${pageBean.startPage}" end="${pageBean.endPage}" step="1" var="i">
                    <li><a href="${pageContext.request.contextPath}/pageServlet?pageNum=${i}">${i}</a></li>
                </c:forEach>
                <li>
                    <c:if test="${pageBean.pageNum < pageBean.allPages}">
                        <a href="${pageContext.request.contextPath}/pageServlet?pageNum=${pageBean.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>
                </li>
            </ul>
        </nav>
    </div>
</div>
</body>
</html>
