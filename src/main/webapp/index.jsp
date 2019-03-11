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
<h1>lalalalla</h1>

<form action="MyServlet">
    <input type="number" min="0" max="99999" step="1" value="10"
    name="value1" required>
    <select name="operator">
        <option value="+">Celsius</option>
        <option value="-">Fahrenheit</option>
    </select>
    <input type="submit" value="oblicz">
</form>
</body>
</html>

