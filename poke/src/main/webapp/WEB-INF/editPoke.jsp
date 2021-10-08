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
         <h1>Edit Expense</h1>

           <a href="/">Home</a>
           
  <form:form action="/editPoke/${poke.id }" method="post" modelAttribute="poke">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="expense">Expense Name</form:label>
        <form:errors path="expense"/>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor :</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
      <p>
        <form:label path="description">Description :</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="amount">Amount :</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
 
    <input type="submit" value="Submit"/>
</form:form>    
           
           
           
           
		    
</body>
</html>