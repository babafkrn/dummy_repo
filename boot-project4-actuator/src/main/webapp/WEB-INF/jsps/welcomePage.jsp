<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<!-- Access the bootstrap Css like this, 
		Spring boot will handle the resource mapping automatically -->
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
	
	<c:url value="/css/main.css" var="jstlCss"></c:url>
	<link href="${jstlCss}" rel="stylesheet"/>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class="container">
		<div class="starter-template">
			<h2>${message}</h2>
			Click on this <strong><a href="/myapp4">link</a></strong> to access the previous page.
		</div>	
	</div>
	
	<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
</body>
</html>