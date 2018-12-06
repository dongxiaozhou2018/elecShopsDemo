
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/12/3
  Time: 1:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>

<table class="table table-hover">
    <tr>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>商品图片</th>
        <th>商品描述</th>
        <th>商品价格</th>
    </tr>
    <c:forEach items="${pageBean.shops}" var="shop">
        <tr>
            <td>${shop.shop_id}</td>
            <td>${shop.shop_name}</td>
            <td><img src="http://localhost:8080/photo/${shop.shop_img}"width="50px" height="50px"></td>
            <td>${shop.shop_des}</td>
            <td>${shop.shop_price}</td>
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
</body>
</html>
