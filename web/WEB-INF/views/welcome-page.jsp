<%--
  Created by IntelliJ IDEA.
  User: Kamran
  Date: 2020-03-23
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mom's Cafe</title>
</head>

<body>
    <form action="processOrder">
        <div align="center">
            <h1 align="center">MOM'S CAFE</h1>
            <hr>
            <label for="item_name">Item Name: </label>
            <input type="text" name="foodType" placeholder="Food Type" id="item_name">
            <input type="submit" value="Order">
        </div>
    </form>
</body>

</html>
