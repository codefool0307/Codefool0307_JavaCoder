<%--
  Created by IntelliJ IDEA.
  User: CodeFool0307
  Date: 2020/3/31
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>

  <body>
        <form action="user/1" method="get">
            <input type="submit" value="查询图书">
        </form>
        <form action="user/1" method="post">
            <input name="_method" value="delete">
            <input type="submit" value="删除图书">
        </form>
        <form action="user/1" method="post">
            <input name="_method" value="put">
            <input type="submit" value="更新图书">
        </form>
        <form action="user" method="post">
            <input type="submit" value="添加新图书">
        </form>
  </body>
</html>
