<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<form action="accountForm">
<h2>Welcome ${userName}</h2>
<input type="submit" name="showBookList" value="Show Books" ></input><br><br>
<input type="submit" name="myBooks" value="My Books"></input><br><br>
<input type="submit" name="issueBook" value="Issue Book"></input><br><br>

</form>
</div>

</body>
</html>