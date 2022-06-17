<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>

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
    <a class="navbar-brand" href="/">Hospital</a>

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
<h2 style="text-align:center;color:red">Register New Patient</h2><hr>


<form action="addNewPatient" method="post">
<section class="vh-100 gradient-custom">
<div class="container py-5 h-100">
 <div class="row d-flex justify-content-center align-items-center h-100">
 <div class="col-12 col-md-8 col-lg-6 col-xl-5">
  <div class="card bg-dark text-white" style="border-radius: 1rem;">
  <div class="card-body p-5 text-center">
          
	  <div class="row mb-4">
    	<div class="col">
      	<div class="form-outline">
      	 	<label class="form-label" for="form3Example1">First name</label>
        	<input type="text" id="form3Example1" class="form-control" name="firstName" />
    	   </div>
    	</div>
    
    	<div class="col">
      	<div class="form-outline">
       	<label class="form-label" for="form3Example2">Last name</label>
        <input type="text" id="form3Example2" class="form-control" name="lastName" />
      	</div>
    	</div>
  		</div>
  		
  		     
	  <div class="row mb-4">
    	<div class="col">
      	<div class="form-outline">
      	 	<label class="form-label" for="form3Example1">Gender</label>
        	<input type="text" id="form3Example2" class="form-control" name="gender" />
    	   </div>
    	</div>
    
    	<div class="col">
      	<div class="form-outline">
       	<label class="form-label" for="form3Example2">Age</label>
        <input type="text" id="form3Example2" class="form-control" name="age" />
      	</div>
    	</div>
  		</div>
		  
		  <div class="form-outline mb-4">
		 	<label class="form-label" for="form3Example5">Disease</label>
		    <input type="text" id="form3Example5" class="form-control" name="disease" />
		  </div>
		<div class="form-outline mb-4">
		 	<label class="form-label" for="form3Example5">Assign Doctor</label>
		   <select class="form-select form-select-sm" aria-label=".form-select-sm example" name="assignDoctor">
		     
				  <option selected>Select a doctor</option>
				<c:forEach items="${doctor}" var="doctor">
				  <option value="${doctor.firstName}">${doctor.firstName}</option>
				  </c:forEach>
			</select>
		  </div>
		
		  <button type="submit" class="btn btn-primary btn-block mb-4">Add Patient</button>
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