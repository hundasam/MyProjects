<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@page import="java.util.List" %>
    <%@page import="com.library.pojo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.mycss{
	
	border: 5px outset red;
	margin:auto;
	align:center;
	width: 300px;
 	 background-color: lightblue;    
  	text-align: center;
}
</style>
</head>
<body>
<div class="mycss">

<table border="1" cellpadding="5">
	<caption><h2>List Of Books</h2></caption>
	<tr>
		<th>Id</th>
		<th>Book Name</th>
		<th>Author</th>
		<th>Price</th>
	</tr>
	<%List<Books> listOfBooks= (List<Books>)request.getAttribute("listOfBooks");
	for(Books book:listOfBooks) {%>
		<tr>		
			<td><%=book.getBookId()%></td>
			<td><%=book.getBookName()%></td>
			<td><%=book.getAuthor()%></td>
			<td><%=book.getPrice() %></td>
		</tr>
		<%}%>
</table>
</div>

</body>
</html>