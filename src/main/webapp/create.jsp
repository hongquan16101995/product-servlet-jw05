<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>JSP 2.0 Expression Language - Implicit Objects</title>
    <style>
    </style>
  </head>
    <body>
        <h1>Form create product</h1>
        <form action="/product/products?action=createPost" method="post">
            <label for="id">Id</label>
            <input type="text" id="id" name="id">
            <label for="name">Name</label>
            <input type="text" id="id" name="name">
            <label for="price">Price</label>
            <input type="text" id="id" name="price">
            <label for="quantity">Quantity</label>
            <input type="text" id="id" name="quantity">
            <button>Create</button>
        </form>
        <a href="/product/products">Back to home</a>
    </body>
</html>
