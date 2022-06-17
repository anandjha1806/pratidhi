<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Patient</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</head>
<body class="text-center">
<div>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <!-- Container wrapper -->
  <div class="container-fluid">
    <!-- Toggle button -->
    <button
      class="navbar-toggler"
      type="button"
      data-mdb-toggle="collapse"
      data-mdb-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <i class="fas fa-bars"></i>
    </button>

    <!-- Collapsible wrapper -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <!-- Navbar brand -->
      <a class="navbar-brand mt-2 mt-lg-0" href="/">
        <img src="../img/logo.png"height="40"alt="hospital" loading="lazy"/>
      </a>
     
    </div>
    <!-- Collapsible wrapper -->
    
     <!-- Right elements -->
    <div class="d-flex align-items-center">
     
     	<ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="receptionistloggedIn">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addPatient">Add Patient</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewAllPatient">View Patient</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewAllQuery">View Query</a>
        </li>
      </ul>
    </div>
    <!-- Right elements -->

  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->

<main class="container">
<h2 style="color:red;text-align:center;">List of All Patient</h2></div><hr>

<div class="container">
	<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Disease</th>
      <th scope="col">Status</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${patient}" var="patient">
    <tr>
      <th scope="col">${patient.id}</th>
      <th scope="col"><a href="viewPatientforBill?id=${patient.id}">${patient.firstName}</a></th>
      <th scope="col">${patient.lastName}</th>
      <th scope="col">${patient.disease}</th>
      <th scope="col">${patient.status}</th>

    </tr>
 </c:forEach>
 
  </tbody>
</table>
</div>

</main>

</div>
    <footer class="mt-auto text-black-50">
	<p>Created By Anand Kumar</p>
</footer>
</body>
</html>