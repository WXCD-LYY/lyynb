<%--
  Created by IntelliJ IDEA.
  User: 13222
  Date: 2020/6/7
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%--<%
    response.getWriter().write("response");
  %>--%>

  <%
    System.out.println("hello jsp");
    int i = 5;

    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>

  <%!
    int i = 3;
  %>

  <%=
    i
  %>

  <%
    response.getWriter().write("response...");
  %>

  <h1>hi~ jsp!</h1>

  </body>
</html>
