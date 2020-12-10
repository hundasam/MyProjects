<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.myCss{
border: 10px outset red;
width: 500px;
align-content:center;
background-color: lightblue;
text-align:center;


}
</style>

</head>
<body>
<div class="myCss">
<h2>Register</h2>
<form action="signUp">

Name: <input type="text" name="name"></input><br><br>
Address: <input type="text" name="address"/><br><br>
Phone no: <input type="text" name="phoneNo"/><br><br>
User name: <input type="text" name="userName"/><br><br>
Password: <input type="text" name="password"/><br><br>
<input type="submit" value="Create Account"/> <br><br>
<alert>Sign Up successfully</alert>


</form>
<h2>Click <a href="Login.jsp"> to Login</h2> 
</a>
</div>
</body>
</html>