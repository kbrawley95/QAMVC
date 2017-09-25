<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" 	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    
    <!-- Custom Main.css -->
    <spring:url value="/resources/public-resources/css/main.css"  var="mainCSS" />
    <link href="${mainCSS}" rel="stylesheet" />
    
  </head>
  <header>
  	<nav class="navbar navbar-fixed">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">WebSiteName</a>
	    </div>
		    <ul class="nav navbar-left">
		      <li class="nav-item"><a href="#">Home</a></li>
		      <li class="nav-item"><a href="#">Page 1</a></li>
		      <li class="nav-item"><a href="#">Page 2</a></li>
		      <li class="nav-item"><a href="#">Page 3</a></li>
		    </ul>
	  </div>
	</nav>
  </header>
  <hr/>