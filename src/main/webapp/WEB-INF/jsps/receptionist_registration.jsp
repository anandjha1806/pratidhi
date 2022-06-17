<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="admin_menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Receptionist Registration</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>

</head>
<body>
<h2 style="text-align:center;color:red"><img alt="Receptionist" src="../img/rec.png" height=50>Register New Receptionist</h2><hr>
<form action="addReceptionist" method="post">
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

		  <div class="form-outline mb-4">
		   <label class="form-label" for="form3Example3">Email address</label>
		    <input type="email" id="form3Example3" class="form-control" name="email" />
		   
		  </div>
		
		  <div class="form-outline mb-4">
		 	<label class="form-label" for="form3Example4">Password</label>
		    <input type="text" id="form3Example4" class="form-control" name="password" />
		  </div>
		  
		  <button type="submit" class="btn btn-primary btn-block mb-4">Add Receptionist</button>
</div>
</div>
</div>
</div>
</div>
 </section>
</form>

</body>
</html>