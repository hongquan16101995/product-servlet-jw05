<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>JSP 2.0 Expression Language - Implicit Objects</title>
    <style>
        table, tr, th, td {
            border: 1px solid;
            border-collapse: collapse;
        }
    </style>
  </head>
    <body>
        <h1>List product</h1>
        <a href="/product/products?action=createGet">Create new product</a>
        <table>
            <tr>
                <th>STT</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Price</th>
                <th colspan="2">Action</th>
            </tr>
            <c:forEach items="${products}" var="p" varStatus="ps">
                <tr>
                    <td>${ps.count}</td>
                    <td>${p.name}</td>
                    <td>${p.quantity}</td>
                    <td>${p.price}</td>
                    <td><a href="/product/products?action=updateGet&id=${p.id}">Update</a></td>
                    <td><a href="/product/products?action=deleteProduct&id=${p.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
