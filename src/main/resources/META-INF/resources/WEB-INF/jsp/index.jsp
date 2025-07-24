<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body onload="showAlert()">
<img src="/images/logo.png" alt="Logo" height="60">
<h2>Students</h2>
<a href="/new">Add New</a>
<table>
    <tr><th>Name</th><th>Email</th><th>Actions</th></tr>
    <c:forEach var="s" items="${listStudents}">
        <tr>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>
                <a href="/edit/${s.id}">Edit</a>
                <a href="/delete/${s.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>