<%--
  Created by IntelliJ IDEA.
  User: CodeFool0307
  Date: 2020/3/18
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
  <form action="http://localhost:8080/Demo200318fileshangchuan/200318second"
        method="post" enctype="multipart/form-data">
      用户名：<input type="text" name="username"><br>
      头像：<input type="file" name="photo"><br>
      <input type="submit" value="上传">
  </form>
</body>
</html>
