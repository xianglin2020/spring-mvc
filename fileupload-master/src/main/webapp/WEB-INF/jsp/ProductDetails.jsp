<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-10
  Time: 下午10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Save Product</title>
    <style type="text/css">
        @import url("<c:url value="/css/main.css"/>");
    </style>
</head>
<body>
<div id="global">
    <h4>The product has been saved.</h4>
    <p>
    <h5>Details: </h5>
    Product Name: ${product.name}
    <br>
    Desc: ${product.desc}
    <br>
    Price: ${product.price}
    <br>
    <p>Following files are upload successfully.</p>
    <ol>
        <c:forEach items="${product.images}" var="image">
            <li>${image.originalFilename}
                <br><br>
                <img src="<c:url value="/image/"/>${image.originalFilename}" alt="" width="600"/>
            </li>
        </c:forEach>
    </ol>
    </p>
</div>
</body>
</html>
