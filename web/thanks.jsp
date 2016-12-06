<!--
Copyright (c) 2016 Evan Elkin
Campus Box 7947, Elon University, Elon, NC 27244

Copyright (c) 2016 Breslin Wiley
Campus Box 8293, Elon University, Elon, NC 27244
-->
<%@ include file="header.html" %>
<main>
  <section>
    <p>
      Thank you for your patronage of the Belk Library. 
      You've successfully checked out the book, ${user.bookTitle}.
      Please note that the book is due back on ${user.formattedDueDate}.
      A friendly email reminder will be sent to you if your book becomes
      overdue.
    </p><br/>
    <p><a href="library">Return to front page</a></p>
  </section>
  
</main>
<%@ include file="footer.html" %>
