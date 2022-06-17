<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
          <a class="nav-link" href="doctorLoggedIn">Home</a>
        </li>
       
      </ul>
    </div>
    <!-- Right elements -->

  </div>
  <!-- Container wrapper -->
</nav>
<!-- Navbar -->

<main class="container">
<h2 style="color:red;text-align:center;">Patient Detail</h2></div><hr>

<div class="container">
<form action="updatePatient" method="post">
	
	<pre>
	Patient Id: <input type="text" name="id" value="${patient.id}" readonly>
	Patient First Name: <input type="text" name="firstName" value="${patient.firstName}" readonly>
	Patient Last Name: <input type="text" name="lastName" value="${patient.lastName}" readonly>
	Patient Gender: <input type="text" name="gender" value="${patient.gender}" readonly>
	Patient Age: <input type="text" name="age" value="${patient.age}" readonly>
	Assigned Doctor: <input type="text" name="assignDoctor" value="${patient.assignDoctor}" readonly>
	Disease: <input type="text" name="disease" value="${patient.disease}">
	Previous Medicine:<input type="text" value="${patient.medicine}"/ readonly>
	New Medicine: <select name="medicine">
			<option  value="${patient.medicine}" selected>${patient.medicine}</option> 
					<c:forEach items="${medi}" var="medi">
				<option  value="${medi.medicineName}">${medi.medicineName}</option>
					</c:forEach>	        	 
			</select>
	Previous Status: <input type="text" value="${patient.status}"/ readonly>
	Status: <select name="status">
				<option>Select Status</option>
				<option value="Under_Observation">Under Observation</option>
				<option value="Medicince_Given">Medicine Given</option>
				<option value="Discharge">Discharge</option>
			</select>
			<input type ="submit" value="Save">
	</pre>
</form>
	
</div>


<footer class="mt-auto text-black-50">
	<p>Created By Anand Kumar</p>
</footer>
    
</body>
</html>