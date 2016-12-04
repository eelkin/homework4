<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 7947, Elon University, Elon, NC 27244
-->

<%@ include file="includes/header.html" %>

  <form action="library" method="post">
    <input type="hidden" name="action" value="add">        
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br>
    <label class="pad_top">Email Address:</label>
    <input type="email" name="email" value="${user.email}"><br>
    <label class="pad_top">Book Title:</label>
    <input type="text" name="bookTitle" value="${user.bookTitle}"><br>
    <label>&nbsp;</label>
    <input type="submit" value="Join Now" class="margin_left">
  </form>
    
<%@ include file="includes/footer.html" %>>

