<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.net.InetAddress" %><%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-9
  Time: 下午7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>创建Set、List、Map</p>
${list = {1, 2, 3, 4, 5, 6, 7}}
<hr>
<p>toArray()</p>
${list.stream().toArray()}
<hr>
<p>limit()</p>
${list.stream().limit(3).toList()}
<hr>
<p>sorted()</p>
${list.stream().sorted().toList()}
<hr>
<p>average()</p>
${list.stream().average().get()}
<hr>
<p>sum</p>
${list.stream().sum()}
<hr>
<p>count</p>
${list.stream().count()}
<hr>
<p>map</p>
${list.stream().map(x -> 3*x).toList()}
<hr>
<p>filter()</p>
${list.stream().filter(x -> x > 3).toList()}
<hr>
<p>forEach</p>
${list.stream().forEach(x -> System.out.println(x))}
${list.stream().forEach(x -> pageContext.out.print(x))}
<br>
<hr>
<p>格式化数字</p>
${String.format("%-10.2f%n", 125.178)}
<hr>
<p>格式化日期</p>
${d=LocalDate.now().plusDays(2);String.format("%tB %te %tY%n", d, d, d)}
</body>
</html>
