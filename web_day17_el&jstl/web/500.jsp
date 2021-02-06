<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>服务器正忙。。。。</h1>

<%--<%
    String message = exception.getMessage();
    out.print(message);
%>--%>

<%
    pageContext.setAttribute("msg","hello");
%>

<%=pageContext.getAttribute("msg")%>
</body>
</html>
