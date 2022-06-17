<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en" class="h-100">
  <head>
    <meta charset="utf-8">
    <title>Receptionist</title>
    
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
    
  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->
 
 
  <main class="px-3"><br>
  
<div style="text-align: center;">
	<img alt="admin" src="../img/rec.png" height=200>
</div>
   
  </main>
  <div style="padding:20px;margin:20px;text-align:center; color:red;">
  ${msg }
  </div>
  

  <footer class="mt-auto text-white-50">
    <p>Created By Anand Kumar</p>
  </footer>
</div>
    
  </body>
</html>

    