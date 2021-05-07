<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>Welcome!</h2>

<br>
<br>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your nynyme: ${employee.anime}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>
<br>
Phone number: ${employee.phone}
<br>
Email: ${employee.email}

</body>
</html>
