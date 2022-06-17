<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="admin_menu.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Detail</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

<style type="text/css">
a{
text-decoration: none;

}
</style>

</head>
<body class="text-center">
<div>

<main class="container">
<h2 style="color:red;text-align:center;">Doctor Detail</h2><hr>

<div class="container">
<form>
	
	<pre>
	Doctor Id: <input type="text" name="id" value="${doctor.id}">
	Doctor First Name: <input type="text" name="firsName" value="${doctor.firstName}">
	Doctor Last Name: <input type="text" name="lastName" value="${doctor.lastName}">
	Email Id: <input type="email" name="email" value="${doctor.email }">
	Password: <input type="text" name="password" value="${doctor.password }">
	Specialization: <input type="text" name="specialization" value="${doctor.specialization}"><br>
	<a href="updateDoc" style ="height:20"><i class="bi bi-pencil-fill"></i>Edit</a> <a href="deleteDoc?id=${doctor.id}" style ="height:20"><i class="bi bi-trash"></i>Delete</a>
	
	</pre>
</form>
	
</div>

</main>
<footer class="mt-auto text-white-50">
	<p>Created By Anand Kumar</p>
</footer>
</div>
    
</body>
</html>