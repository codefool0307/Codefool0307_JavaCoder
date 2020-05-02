
<%--
  Created by IntelliJ IDEA.
  User: CodeFool0307
  Date: 2020/4/4
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>添加页面</title>
</head>

<body>

<%
  pageContext.setAttribute("ctp",request.getContextPath());
%>
    <form:form action="${ctp}/emp" modelAttribute="employee" method="post">
        lastName:<form:input path="lastName"/><br>
        email:   <form:input path="email"/><br>
        gender:  <br>
        男：  <form:radiobutton path="gender" value="1"/><br>
        女：  <form:radiobutton path="gender" value="0"/><br>
        dept:
        <form:select path="department.id"
                     items="${depts}"
                     itemLabel="departmentName"
                     itemValue="id"></form:select><br>
        <input type="submit" value="保存">
    </form:form>
    <%-- <form action="">
         lastName:<input type="text" name="lastName"><br>
         email:   <input type="text" name="email"><br>
         gender:  <br>
            男：  <input type="radio" name="gender" value="1"><br>
            女：  <input type="radio" name="gender" value="2"><br>
         dept:
                  <select name="department.id">
                      <c:forEach items="${depts}" var="deptItem">
                          <option value="${deptItem.id}">${deptItem.departmentName}</option>
                      </c:forEach>
                  </select>
     </form>--%>
</body>
</html>
