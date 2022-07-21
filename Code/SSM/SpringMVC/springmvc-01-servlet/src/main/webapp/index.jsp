<%--
  Created by IntelliJ IDEA.
  User: zgf35
  Date: 2021/11/26
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="HelloServlet" method="post">
    <label>
        <input type="radio" name="method" value="add">add
        <br>
        <input type="radio" name="method" value="delete">delete
        <br>
    </label>
    <input type="submit">
</form>
</body>
</html>
