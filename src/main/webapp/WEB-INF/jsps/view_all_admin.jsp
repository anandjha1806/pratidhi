<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@ include file="admin_menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Admin</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>


</head>
<body>
<div><h2 style="color:red;text-align:center;"><img alt="admin" src="../img/adminlogo.png" height=50>List of All Admin</h2></div><hr>
<div class="container">
	<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email ID</th>
      <th scope="col">Password</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${admin}" var="admin">
    <tr>
      <th scope="col">${admin.id}</th>
      <th scope="col">${admin.adminName}</th>
      <th scope="col">${admin.adminEmail}</th>
      <th scope="col">${admin.adminPassword}</th>
      <th scope="col"><a href="deleteAdmin?id=${admin.id}"><i class="bi bi-trash" height=30></i></a></th>
    </tr>
 </c:forEach>
 
  </tbody>
</table>
</div>

</body>
</html>