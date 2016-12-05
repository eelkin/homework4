<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 7947, Elon University, Elon, NC 27244
-->

<%@ include file="header.html" %>

<h1>Currently checked out books</h1>
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
    <%-- Replace with buttons --%>
    <td><a href="userAdmin?action=delete_user&amp;email=${user.email}">Check In</a></td>
  </tr>
  </c:forEach>

</table>
  
  <p><a href="library">Return to front page</a></p>
  
<%@ include file="footer.html" %>
