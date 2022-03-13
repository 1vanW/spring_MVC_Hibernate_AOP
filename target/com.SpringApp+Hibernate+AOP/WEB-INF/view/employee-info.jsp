<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vinev
  Date: 09.03.2022
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee-info</title>
</head>
<body>

<h2>Employee-info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>
    
    Name:<form:input path="name"/>
    <br>
    Surname:<form:input path="surname"/>
    <br>
    Departments:<form:input path="department"/>
    <br>
    Salary:<form:input path="salary"/>
    <br>
    <input type="submit" value="OK">

    
</form:form>

</body>
</html>
