<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 18-7-9
  Time: 下午7:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Demo1</title>
</head>
<body>
<ul>
    <li>
        <p>\${2+3}\${3+4}: ${2+3}${3+4}</p>
    </li>
    <li>
        <p>\${header.host}: ${header.host}}</p>
    </li>
    <li>
        <p>\${header["host"]}}: ${header["host"]}</p>
    </li>
    <li>
        <p>characterEncoding: ${pageContext.request.characterEncoding}</p>
    </li>
    <li>
        <p>protocol: ${pageContext.request.protocol}</p>
    </li>
    <li>
        <p>remoteHost: ${pageContext.request.remoteHost}</p>
    </li>
    <li>
        <p>cookie: ${cookie.size()}</p>
    </li>
    <li>
        <p>除法： ${3/2} ${3 div 2}</p>
    </li>
    <li>
        <p>关系： 3=2 ${3 eq 2}</p>
    </li>
    <li>
        <p>${empty cookie}</p>
    </li>
    <li>
        <p>&radic;<span style="text-decoration: overline;">&nbsp;36&nbsp;</span> = ${Math.sqrt(36)}</p>
    </li>
    <li>
        <p>&pi; = ${Math.PI}</p>
    </li>
</ul>
</body>
</html>
