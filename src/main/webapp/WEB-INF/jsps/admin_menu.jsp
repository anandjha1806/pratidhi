<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>


</head>
<body>

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
      <a class="navbar-brand mt-2 mt-lg-0" href="dashboard">
        <img src="../img/logo.png"height="40"alt="hospital" loading="lazy"/>
      </a>
      <!-- Left links -->
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="dashboard">Dashboard</a>
        </li>
        <li class="nav-item">
       
          <a class="nav-link" href="doctorRegistration">Add Doctor</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="receptionistRregistration">Add Receptionist</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="adminRegistration">Add Admin</a>
        </li>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="pharmacistRegistration">Add Pharmacist</a>
        </li>
      </ul>
      <!-- Left links -->
    </div>
    <!-- Collapsible wrapper -->
    
    
    
     <!-- Right elements -->
    <div class="d-flex align-items-center">
     
     	<ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="viewAllDoctor">View Doctor</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewAllReceptionist">View Receptionist</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewAllAdmin">View Admin</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="viewAllPharmacist">View Pharmacist</a>
        </li>
      </ul>


     
    </div>
    <!-- Right elements -->
    
    

  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->

</body>
</html>