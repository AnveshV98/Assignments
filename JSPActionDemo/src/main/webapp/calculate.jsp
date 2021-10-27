<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

String submit=request.getParameter("submit");
if(submit.equals("Add")){
%>
<jsp:forward page="/add.jsp"/>	
<%}
else if(submit.equals("Sub")){
%>
<jsp:forward page="/sub.jsp"/>	
<%}
else{
%>
<jsp:forward page="/home.html"/>
<%} %>
</body>
</html>