<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 7947, Elon University, Elon, NC 27244
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/includes/header.html" %>

<h1>Currently checked out books</h1>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>

  <tr>
    <th>Patron Name</th>
    <th>Email Address</th>
    <th>Book Title</th>
    <th>Due Date</th>
    <th>Overdue</th>
  </tr>

  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="user" items="${users}">
  <tr>
    <td>${user.firstName} ${user.lastName}</td>
    <td>${user.email}</td>
    <td>${user.bookTitle}</td>
    <td>${user.dueDate}</td>
    <td>${user.overdue}</td>
    <td><a href="userAdmin?action=display_user&amp;email=${user.email}">Update</a></td>
    <%--Change to check in button --%>
    <td><a href="userAdmin?action=delete_user&amp;email=${user.email}">Delete</a></td>
  </tr>
  </c:forEach>

</table>
  
<%@ include file="/includes/footer.html" %>
