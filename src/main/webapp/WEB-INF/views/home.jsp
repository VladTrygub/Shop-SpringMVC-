<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home</title>
	<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
	<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
</head>
<body>
	<header>
		<nav class="navbar navbar-default menu">
  		<div class="container">
    	<!-- 
    	Brand and toggle get grouped for better mobile display 
    	-->
    		<div class="navbar-header">
      		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-	navbar-collapse-1" aria-expanded="false">
        		<span class="sr-only">Toggle navigation</span>
        		<span class="icon-bar"></span>
        		<span class="icon-bar"></span>
        		<span class="icon-bar"></span>
      		</button>
      		<a class="navbar-brand" href="#">Shop [SpringMVC]</a>
    		</div>
    		<!-- 
    		Collect the nav links, forms, and other content for toggling 
    		-->
    		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      		<ul class="nav navbar-nav">
      	  	<li class="active-link"><a href="home">home</a></li>
      	  	<li><a href="category">categories</a></li>
      	  	<li><a href="item">items</a></li>
      	  	<li><a href="#">support</a></li>
      	  	<li><a href="#">blog</a></li>
      	  	<li><a href="#">contact</a></li>
      	  	<li><a href="#">my bag</a></li>
      		</ul>
     		<!-- <ul class="nav navbar-nav navbar-right icons">
     		 	<li><a href="#"><img src='<c:url value="/resources/img/facebook.png"/>' height="26" width="26"></a></li>
     		 	<li><a href="#"><img src='<c:url value="/resources/img/twitter.png"/>' height="26" width="26"></a></li>
     		 	<li><a href="#"><img src='<c:url value="/resources/img/vk.png"/>' height="26" width="26"></a></li>
     		 	<li><a href="#"><img src='<c:url value="/resources/img/rss.png"/>' height="26" width="26"></a></li>
     		</ul> -->
   			</div><!-- /.navbar-collapse -->  	
 			</div><!-- /.container-fluid -->
		</nav>
	</header>
	<script src="http://code.jquery.com/jquery.min.js"></script>
  <script src="/resources/js/bootstrap.min.js"></script>
</body>
</html>
