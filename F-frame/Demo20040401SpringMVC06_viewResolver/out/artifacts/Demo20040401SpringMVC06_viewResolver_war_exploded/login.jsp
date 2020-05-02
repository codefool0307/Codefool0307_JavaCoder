<%--
  Created by IntelliJ IDEA.
  User: CodeFool0307
  Date: 2020/4/4
  Time: 8:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
   <h1>
       <fmt:message key="welcomeinfo"></fmt:message>
   </h1>
   <form action="">
       <fmt:message key="username"/>:<input><br>
       <fmt:message key="password"/>:<input><br>
       <input type="submit " value='<fmt:message key="loginBtn"/>'>
   </form>
</body>
</html>