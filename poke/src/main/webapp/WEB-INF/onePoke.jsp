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

      <h1>Expense Details</h1>
    
		       <a href="/">Go Back</a>
		       <p>Expense name:<c:out value="${ poke.expense}"></c:out></p>
		       <p>Expense description:<c:out value="${ poke.description}"></c:out></p>
		    
		       <p>Vendor:<c:out value="${poke.vendor }"></c:out></p>
		    
		       <p>Amount Spent: <c:out value="${poke.amount}"></c:out></p>
		    
		    

        
</body>
</html>