<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/25
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商品</title>
    <link rel="stylesheet" href="css/shouye.css">
    <link rel="stylesheet" href="css/addproduct.css">
    <link rel="stylesheet" href="css/bootstrap.min.css"/>

</head>
<body>
<!--添加商品页面-->
<div id="right2">
    <div id="addproduct_left">
        <form action="addProductServlet">
            <ul>
                <li><input type="text"name="shop_id" placeholder="商品ID"></li>
                <li><input type="text"name="shop_name"placeholder="商品名称"></li>
                <li><input type="text"name="shop_des"placeholder="商品介绍"></li>
                <li><input type="text"name="shop_img"placeholder="商品图片"></li>
                <li><input type="text"name="shop_price"placeholder="商品价格"></li>
                <li><input type="text"name="shop_cateId"placeholder="类别ID"></li>
                <li><input type="text"name="shop_stock"placeholder="商品库存"></li>
                <li><input type="text"name="shop_isGc"placeholder="是否上架"></li>
                <li><input type="submit"name="确认添加"></li>
            </ul>
        </form>
        <form action="pageServlet">
            <input type="submit"value="返回商品列表">
        </form>
    </div>
    <div id="addproduct_center">
        <ul id="goodstype">
            <li>商品标题</li>
            <li><input type="text"placeholder="商品标题"></li>
            <li>商品介绍</li>
            <li><div class="product_introduce"><input type="text"class="product_introduce_input"></div></li>

        </ul>
    </div>
    <div id="addproduct_right">
        <ul class="goodspicture">
            <li><div></div></li>
            <form action="ImgUploadServlet" method="post" enctype="multipart/form-data">
                <%--<input type="text" name="username">--%>
                <%--<input name="password" name="password">--%>
                    <li><input type="file" name="file1"/><span>${message}</span></li>
                    <li><li><input type="submit" value="上传图片" id="addbutten"></li></div></li>
            </form>
            <%--<li><input type="button" value="选择图片" class="picture_button"></li>--%>
            <%--<li><div class="product_picture"><input type="text"class="product_picture_input"></div></li>--%>
        </ul>
    </div>
</div>
</body>
</html>