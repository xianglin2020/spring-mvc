<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-10
  Time: 下午10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
    <style type="text/css">
        @import url("<c:url value="/css/main.css"/>");
    </style>
</head>
<body>
<div id="global">
    <form:form commandName="product" action="save-product" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name: </label>
                <form:input path="name" id="name" cssErrorClass="error"/>
                <form:errors path="name" cssClass="error"/>
            </p>
            <p>
                <label for="desc">Product Desc: </label>
                <form:input path="desc" id="desc" cssErrorClass="error"/>
            </p>
            <p>
                <label for="price">Product Price: </label>
                <form:input path="price" id="price" cssErrorClass="error"/>
            </p>
            <p>
                <label for="image">Product Image</label>
                <input type="file" name="images" id="image" multiple="multiple"/>
            </p>
            <p id="buttons">
                <input type="reset" name="reset" tabindex="4">
                <input type="submit" name="submit" tabindex="5" value="Add Product">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
