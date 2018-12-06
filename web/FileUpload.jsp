<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/28
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片上传</title>
</head>
<body>
<form action="ImgUploadServlet" method="post" enctype="multipart/form-data">
    <%--<input type="text" name="username">--%>
    <%--<input name="password" name="password">--%>
    <input type="file" name="file1"/><span>${message}</span>
    <input type="submit" value="上传">
</form>
</body>
</html>
