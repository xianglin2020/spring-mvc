<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-11
  Time: 上午10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style type="text/css">
        @import url("<c:url value="/css/main.css"/>");
    </style>
</head>
<body>
<div id="global">
    <form:form commandName="login" action="login" method="post">
        <fieldset>
            <legend>Login</legend>
            <p>
                <label for="userName">User Name: </label>
                <form:input path="userName" id="userName" cssErrorClass="error"/>
            </p>
            <p>
                <label for="password">Password: </label>
                <form:password path="password" id="password" cssErrorClass="error"/>
            </p>
            <p id="button">
                <input type="reset" id="reset" tabindex="4">
                <input type="submit" id="submit" tabindex="5" value="Login">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
