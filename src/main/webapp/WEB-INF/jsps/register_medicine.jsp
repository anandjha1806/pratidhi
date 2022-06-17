<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Medicine</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</head>
<body class="d-flex h-100 text-center text-white bg-dark">
    
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">

 
 <!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark shadow-5-strong">
  <!-- Container wrapper -->
  <div class="container-fluid">
    <!-- Navbar brand -->
    <a class="navbar-brand" href="/"> <img src="../img/logo.png"height="40"alt="hospital" loading="lazy"/></a>

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
    
  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->
 
<main class="px-3"><br>
<h2 style="text-align:center;color:red">Register New Medicine</h2><hr>


<form action="addNewMedicine" method="post">
<section class="vh-100 gradient-custom">
<div class="container py-5 h-100">
 <div class="row d-flex justify-content-center align-items-center h-100">
 <div class="col-12 col-md-8 col-lg-6 col-xl-5">
  <div class="card bg-light text-black" style="border-radius: 1rem;">
  <div class="card-body p-5 text-center">
          
	  <div class="row mb-4">
      	<div class="form-outline">
      	 	<label class="form-label" for="form3Example1">Medicine name</label>
        	<input type="text" id="form3Example1" class="form-control" name="medicineName" />
    	</div>
    </div>
     <div class="row mb-4">
      	<div class="form-outline">
      	 	<label class="form-label" for="form3Example1">Medicine Brand</label>
        	<input type="text" id="form3Example1" class="form-control" name="medicineBrand" />
    	</div>
    </div>
  	<div class="form-outline mb-4">
		 <label class="form-label" for="form3Example5">Medicine Price</label>
		 <input type="text" min="0" max="10000" id="form3Example5" class="form-control" name="medicinePrice" />
	</div>
	<button type="submit" class="btn btn-primary btn-block mb-4">Add Medicine</button>
</div>
</div>
</div>
</div>
</div>
 </section>
</form>
  

   
  </main>
  ${msg }

  <footer class="mt-auto text-white-50">
    <p>Created By Anand Kumar</p>
  </footer>
</div>
    
  </body>
</html>