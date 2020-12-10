<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
.myCss{
border: 10px outset red;
width: 500px;
align-content:center;
background-color: lightblue;
text-align:center;


}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="myCss">
<h2>Issue Book</h2>
<form action="issueBook">
Book Id:<input type="text" name="bookId" id="bookId" value= "${bookId}">
<input type="submit" value="Search" name="searchBookIdButton"/><br><br>
Book Name: <input type="text" name="bookName" id="bookName" value="${bookName}"><br><br>

Issue date: <input type="text" name="issueDate" value="<%
Date dnow=new Date();
dnow.toString();%>"/><br><br>
Return date: <input type="text" name="returnDate"/><br><br>
<input type="submit" value="Issue Book" name="issueButton"/><br><br>
</form>
</div>
</body>
</html>