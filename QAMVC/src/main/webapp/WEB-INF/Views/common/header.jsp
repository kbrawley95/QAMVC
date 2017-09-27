<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    
    <spring:url value="/resources/public-resources/imgs/logo.png"  var="logo" />
    
  </head>
  <header>
  	<div class="banner_area">
  		<a id="banner_1"><img class="banner" id="banner" src="${logo}" alt=""></a>
  	</div>
  	<nav class="navbar navbar-fixed">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">QA Cinemas</a>
	    </div>
		    <ul class="nav navbar-left">
		      <li class="nav-item"><a href="/home">Home</a></li>
		      <li class="nav-item"><a href="/aboutus">About Us</a></li>
		      <li class="nav-item"><a href="/contactus">Contact Us</a></li>
		      <li class="nav-item"><a href="/cart">Shopping Cart</a></li>
		    </ul>
	  </div>
	</nav>
  </header>
  <hr/>