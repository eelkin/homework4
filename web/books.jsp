<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 8293, Elon University, Elon, NC 27244
-->

<%@ include file="header.html" %>

<main>
  <h2>Currently checked out books</h2>
  <table>

    <tr>
      <th>Patron Name</th>
      <th>Email Address</th>
      <th class="long">Book Title</th>
      <th>Due Date</th>
      <th class="short">Overdue</th>
    </tr>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:forEach var="user" items="${users}">
      <tr>
        <td>${user.firstName} ${user.lastName}</td>
        <td>${user.email}</td>
        <td class="long">${user.bookTitle}</td>
        <td>${user.formattedDueDate}</td>
        <td class="short">${user.overdue}</td>
        <%-- Replace with button --%>
        <%--<td><a href="userAdmin?action=delete_user&amp;email=${user.email}">Check In</a></td>--%>
        <td>
          <form action="library" method="post">
            <input type="hidden" name="action" value="delete">
            <button type="submit">Check In</button>
          </form>
        </td>
      </tr>
    
    </c:forEach>

  </table>
  
  <p><a href="library">Return to front page</a></p>
</main>
    
<%@ include file="footer.html" %>
