<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Student Form</title></head>
<body>
<h2>Student Form</h2>
<form:form method="post" action="${student.id == null ? '/save' : '/update'}" modelAttribute="student">
    <form:hidden path="id"/>
    Name: <form:input path="name"/><br/>
    Email: <form:input path="email"/><br/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>