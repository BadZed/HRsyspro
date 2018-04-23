
<%--
  Created by IntelliJ IDEA.
  User: 93645
  Date: 2018/4/22
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<a href="/turnLogin.do">登陆</a>
<a href="/turnRegister.do">注册测试111</a>
</body>
</html>
