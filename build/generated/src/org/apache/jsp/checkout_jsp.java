package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Copyright (c) 2016 Evan Elkin\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("\n");
      out.write("Copyright (c) 2016 Breslin Wiley\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("Copyright (c) 2016 Evan Elkin\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("\n");
      out.write("Copyright (c) 2016 Breslin Wiley\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("-->\n");
      out.write("<!--Header for all JSP pages-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("    <title>CSC330 Homework 4</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/main.css\"/>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <form action=\"library\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"add\">        \n");
      out.write("    <label class=\"pad_top\">First Name:</label>\n");
      out.write("    <input type=\"text\" name=\"firstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("    <label class=\"pad_top\">Last Name:</label>\n");
      out.write("    <input type=\"text\" name=\"lastName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("    <label class=\"pad_top\">Email Address:</label>\n");
      out.write("    <input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("    <label class=\"pad_top\">Book Title:</label>\n");
      out.write("    <input type=\"text\" name=\"bookTitle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.bookTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("    <label>&nbsp;</label>\n");
      out.write("    <input type=\"submit\" value=\"Join Now\" class=\"margin_left\">\n");
      out.write("  </form>\n");
      out.write("    \n");
      out.write("<!--\n");
      out.write("Copyright (c) 2016 Evan Elkin\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("\n");
      out.write("Copyright (c) 2016 Breslin Wiley\n");
      out.write("Campus Box 7947, Elon University, Elon, NC 27244\n");
      out.write("-->\n");
      out.write("<!--Footer for all JSP pages-->\n");
      out.write("<footer>\n");
      out.write("<p>&copy; 2016, Evan Elkin, Breslin Wiley</p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(">\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
