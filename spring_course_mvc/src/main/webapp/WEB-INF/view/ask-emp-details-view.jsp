<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: erne_
  Date: 20.04.2021
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Please enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee" method="get">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Animesnik ebaniy?
    <form:radiobuttons path="anime" items="${employee.answers}"/>
    <br><br>
    Foreign language(s):
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    Phone number <form:input path="phone"/>
    <form:errors path="phone"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>

    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
