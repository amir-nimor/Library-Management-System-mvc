<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/6/2026
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>All Book</title>
</head>
<body>

<c:forEach var="book" items="${books}">
    <li>${book.toString()} <a href="${book.id}">deateails</a> </li>
</c:forEach>

</body>
</html>
