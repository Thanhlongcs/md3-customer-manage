<%@ page import="java.util.List" %>
<%@ page import="rikkei.academy.customer_management.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>

<table border="1" width="100%">
    <tr>
        <th>name</th>
        <th>date</th>
        <th>address</th>
        <th>image</th>
    </tr>
    <c:forEach var="cus" items="${customerList}">
        <tr>
            <td><c:out value="${cus.name}"></c:out></td>
            <td><c:out value="${cus.date}"></c:out></td>
            <td><c:out value="${cus.address}"></c:out></td>
            <td><img height="100" width="100" src="${cus.image}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>