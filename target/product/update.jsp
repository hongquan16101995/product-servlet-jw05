<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>JSP 2.0 Expression Language - Implicit Objects</title>
    <style>
    </style>
  </head>
    <body>
        <h1>Form update product</h1>
        <form action="/product/products?action=updatePost&id=${product.id}" method="post">
            <label for="name">Name</label>
            <input type="text" id="id" name="name" value="${product.name}">
            <label for="price">Price</label>
            <input type="text" id="id" name="price" value="${product.price}">
            <label for="quantity">Quantity</label>
            <input type="text" id="id" name="quantity" value="${product.quantity}">
            <button>Update</button>
        </form>
        <a href="/product/products">Back to home</a>
    </body>
</html>
