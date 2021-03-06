<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Spring MVC </h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Employee</div>
    </div>
    <div class="panel-body">
     <form:form action="saveEmployee" cssClass="form-horizontal"
      method="post" modelAttribute="employee">

      <!-- need to associate this data with employee id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="name" class="col-md-3 control-label">
        Name</label>
       <div class="col-md-9">
        <form:input path="Name" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="salary" class="col-md-3 control-label">Salary
        </label>
       <div class="col-md-9">
        <form:input path="Salary" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
       <label for="department" class="col-md-3 control-label">Department</label>
       <div class="col-md-9">
        <form:input path="Department" cssClass="form-control" />
       </div>
      </div>
		 <div class="form-group">
       <label for="designation" class="col-md-3 control-label">Designation</label>
       <div class="col-md-9">
        <form:input path="Designation" cssClass="form-control" />
       </div>
      </div>
       <div class="form-group">
       <label for="address" class="col-md-3 control-label">Address</label>
       <div class="col-md-9">
        <form:input path="Address" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>