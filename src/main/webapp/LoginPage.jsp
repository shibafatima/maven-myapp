<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<html>
<head>  
<meta charset="utf-8"> 
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<title>Login Form</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body> 
<section class="container">  
<div class="login"> 
<h1>Login to Web App</h1>  
<!-- <form method="post" action="index.html"> -->
<form name="actionForm" action="LoginServlet" method ="Post">   
<p><input type="text" name="uname" value="" placeholder="Username or Email"></p>   
<p><input type="password" name="password" value="" placeholder="Password"></p>    
<p class="remember_me">    
<label>
<input type="checkbox" name="remember_me" id="remember_me"> 
Remember me on this computer ... Done..!!!
</label>
</p>  
<p class="submit">
<input type="submit" name="commit" value="Login">
</p>    
</form> 
</div> 
<div class="login-help"> 
<p>Forgot your password?
<a href="index.html">Click here to reset it</a>.
</p> 
</div> 
</section>
</body>
</html>


