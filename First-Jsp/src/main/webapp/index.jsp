<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% out.print("welcome to mypage"); %>
<%  
String name=request.getParameter("username");  
out.print("welcome "+name);  



String Name=request.getParameter("uname");  
out.print("HII "+Name);  

session.setAttribute("user",name);  




%>  
<a href="second.jsp">second jsp page</a> 
 


</body>
</html>