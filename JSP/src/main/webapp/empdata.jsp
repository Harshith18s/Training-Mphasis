<%@page import="test.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Details</h1>
<jsp:userBean id="emp" class="test.Employee"></jsp:userBean>
<jsp:setProperty property="*" name="emp"/>
<jsp:getProperty property="name" name="emp"/>
<jsp:getProperty property="cmp" name="emp"/>
<jsp:getProperty property="city" name="emp"/>

<%
Employee emp1=new Employee();
String name=request.getParameter("name");
emp1.setName(name);
session.setAttribute("emp", emp1);
application.setAttribute("info",emp1);%>
<a href="data1.jsp">Next Page</a>
</body>
</html>