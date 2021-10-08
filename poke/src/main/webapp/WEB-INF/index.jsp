<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isErrorPage="true" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9kGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
     <h1>PokeBook</h1>  
     <a href="/newPoke">New poke</a>
     
		    
      <table>
      <tbody>
		  <tr>
		    <th>Expense</th>
		    <th>Vendor</th>
		    <th>Amount</th>
		    <th>Actions</th>
		  </tr>
		  <c:forEach var="i" items="${pokes}" >
		  <tr>
		      <td><a href="/onePoke/${i.id}"><c:out value="${i.expense}"></c:out></a> </td>
		       <td> <c:out value="${i.vendor}"></c:out> </td>
		        <td> $<c:out value="${i.amount}"></c:out> </td>
		         <td> <a href="/editPoke/${i.id }">Edit</a>  <a href="destroy/${i.id }">Delete</a> </td>
		  </tr>
		  </c:forEach>
     </tbody>	    
     </table>
     
</body>
</html>