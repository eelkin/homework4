<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 7947, Elon University, Elon, NC 27244
-->
<%@ include file="header.html" %>
<main>
  <p>
    Thank you for your patronage of the Belk Library. 
    You're successfully checked out the book, ${user.bookTitle}.
    Please note that the book is due back on ${user.dueDate}.
    A friendly email reminder will be sent to you if your book becomes
    overdue.
  </p>
  <p><a href="library">Return to front page</a></p>
</main>
<%@ include file="footer.html" %>
