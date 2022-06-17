<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of All Medicine</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">

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
          <a class="nav-link" href="pharmacistloggedIn">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addMedicine">Add Medicine</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewAllMedicine">View Medicine</a>
        </li>
      </ul>
    </div>
    <!-- Right elements -->

  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->

<main class="container">
<h2 style="color:red;text-align:center;">List of All Medicine</h2></div><hr>

<div class="container">
	<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Medicine Id</th>
      <th scope="col">Medicine Name</th>
      <th scope="col">Medicine Brand</th>
      <th scope="col">Delete Medicine</th>
      
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${medicine}" var="medicine">
    <tr>
      <th scope="col">${medicine.id}</th>
      <th scope="col"><a href="viewMedicine?id=${medicine.id}">${medicine.medicineName}</a></th>
      <th scope="col">${medicine.medicineBrand}</th>
      <th scope="col"><a href="deleteMedicine?id=${medicine.id }"><i class="bi bi-trash"></i></a></th>

    </tr>
 </c:forEach>
 
  </tbody>
</table>
</div>

</main>
<footer class="mt-auto text-white-50">
	<p>Created By Anand Kumar</p>
</footer>
</div>
    
</body>
</html>