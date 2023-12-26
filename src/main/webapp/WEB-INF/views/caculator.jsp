<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 12/26/2023
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="caculator" method="post">
<h1>Caculator</h1>
<input type="number" name="number1">
<input type="number" name="number2">
<select name="calculation" >
  <option value="+">+</option>
  <option value="-">-</option>
  <option value="*">*</option>
  <option value="/">/</option>
</select>
  <button type="submit" >OK</button>
</form>
<p>${result}</p>
</body>
</html>
