<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.6.0.js"></script>
    <script>
        function a() {
            $.post({
                url: "/springmvc_06_Ajax_war/01",
                data: {"name": $("#username").value},
                success: function (data,status) {
                    console.log(data);
                    console.log(status)
                }
            });
        }
    </script>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="${pageContext.request.contextPath}/01">click to test 01</a>
<a href="test2.jsp">test2</a>
<input type="text" id="username" onblur="a()">
</body>
</html>