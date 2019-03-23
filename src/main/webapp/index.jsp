<%--
  Created by IntelliJ IDEA.
  User: Wlazrad
  Date: 10/03/2019
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>New user</h1>

<h2>Please fill in the form to register a new user.</h2>

<form action="MyServlet">
    Email<input
    name="value1" required>


        <input type="radio" name="value2" value="male" checked> User<br>
        <input type="radio" name="value3" value="female"> Superuser<br>

    <input type="checkbox" name="value4">TCstudio<br>
    <input type="checkbox" name="value5">TCserver<br>
    <input type="checkbox" name="value6">TCSite<br>


    <input type="submit" value="Register">
</form>
</body>
</html>

