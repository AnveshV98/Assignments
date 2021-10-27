<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>
<style>

h1{
text-align:center;
font-style: italic;

}

.emp1{
	position: fixed;
	width: 50%;
	margin-left: 350px;
	margin-top: 20px;
	padding: 20px;
	background-color: #8FBCD3;
	border: 1px solid #ddd;
	border-radius: 4px;
	text-align: center;
}
.tb1{

	margin-left: 150px;


}



</style>

</head>
<body>

	
    <div class="emp1">
        <h1>Employee List</h1>
        <h3>
            <a href="newEmployee">New Employee</a>
        </h3>
        <table border="1" class="tb1">
 			
 			<th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            
            <th>Action</th>
 
            <c:forEach var="employee" items="${listEmployee}">
                <tr>
 					
 					<td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.email}</td>
                    <td>${employee.address}</td>
                    
                    <td><a href="editEmployee?id=${employee.id}">Edit</a>
                    	<a href="deleteEmployee?id=${employee.id}">Delete</a>
                        
                        
                    </td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>