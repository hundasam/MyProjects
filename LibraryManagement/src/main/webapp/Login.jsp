<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.myDiv{
	
	border: 5px outset red;
	margin:auto;
	align:center;
	width: 300px;
 	 background-color: lightblue;    
  	text-align: center;
}
h2{
	color: black;
	font-family: verdana;
    font-size: 20px;
}
</style>
</head>
<body>

<img src="<c:url value="/resources/images/littleLibrary.jpg"/>" alt="Image"/> 
<div class="myDiv">
<h2 color>Login</h2>
<form action="read">
User Name: <Input type="text" name="userName"/><br><br>
Password: <Input type="text" name="password"/><br><br>
<input type="submit" value="Login"></input>
Click here <a href="signUp.jsp"> to Sign up</a>


</form>
</div>
</body>
</html>
