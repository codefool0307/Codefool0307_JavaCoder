<%--
  Created by IntelliJ IDEA.
  User: CodeFool0307
  Date: 2020/4/3
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="hello">转一下</a><br>
  <a href="handle01">handle01功能</a><br>
  <a href="handle02">handle02功能</a><br>
  <a href="handle03">handle03功能</a><br>
  <a href="handle04">handle04功能</a><br>
  <form action="updatebook" method="post">
    <input type="hidden" name="id" value="100"/>
    书名：西游记；<br/>
    作者：<input type="text" name="author"/><br/>
    价格：<input type="text" name="price"/><br/>
    库存：<input type="text" name="stock"/><br/>
    销量：<input type="text" name="sales"/><br/>
    <input type="submit" value="修改图书"/>
  </form>
  </body>
</html>
