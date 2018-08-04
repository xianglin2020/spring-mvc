<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-10
  Time: 下午5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title><spring:message code="page.productform.title"/></title>
    <style type="text/css">
        @import url("<c:url value="/css/main.css"/>");
    </style>
</head>
<body>
<div id="global">
    Current Locale : ${pageContext.response.locale}
    <br>
    accept-language header : ${header["accept-language"]}

    <form:form commandName="product" action="product-save" method="post">
        <fieldset>
            <legend><spring:message code="form.name"/></legend>
            <p>
                <label for="name"><spring:message code="label.productName" text="default text"/>: </label>
                <form:input path="name" id="name" cssErrorClass="error"/>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
