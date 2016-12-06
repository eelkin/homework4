<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 8293, Elon University, Elon, NC 27244
-->

<%@ include file="header.html" %>
<main>
  <form action="library" method="post">
    <input type="hidden" name="action" value="add">        
    <label class="pad-top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}" required><br>
    <label class="pad-top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}" required><br>
    <label class="pad-top">Email Address:</label>
    <input type="email" name="email" value="${user.email}" required><br>
    <label class="pad-top">Book Title:</label>
    <input type="text" name="bookTitle" value="${user.bookTitle}" required><br>
    <label>&nbsp;</label>
    <input type="submit" value="Checkout" class="margin-left">
  </form>
</main>    
<%@ include file="footer.html" %>


