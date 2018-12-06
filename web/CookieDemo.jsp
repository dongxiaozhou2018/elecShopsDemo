<%--
  Created by IntelliJ IDEA.
  User: mr-d9
  Date: 2018/11/26
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie[] cookies = request.getCookies();
        if (cookies==null)
        {
            Cookie cookie = new Cookie("name","hello");
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }
        if (cookies != null && cookies.length>0)
        {
            for (Cookie c:cookies){
                out.print(c.getName());
                out.print(c.getValue());
            }
        }
    %>
</body>
</html>
