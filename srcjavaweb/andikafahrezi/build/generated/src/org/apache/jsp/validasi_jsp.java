package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validasi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String userId= request.getParameter("userId");
        String password = request.getParameter("password");
        Cookie cookie;

        if ((userId != null) && (userId.equalsIgnoreCase("ADMIN")) 
             && (password != null) && (password.equalsIgnoreCase("ADMIN"))){

        java.text.SimpleDateFormat waktu =
            new java.text.SimpleDateFormat("HH:MM:ss dd-MM-yyyy");
        java.util.Date waktuLogin = new java.util.Date();

        session.setAttribute("userLogin", "Administrator");
        session.setAttribute("waktuLogin", waktu.format(waktuLogin));
        session.setMaxInactiveInterval(20);

        cookie = new Cookie("nama", "Administrator");
        cookie.setMaxAge(15);
        response.addCookie(cookie);

        cookie = new Cookie("waktulogin", waktu.format(waktuLogin));
        cookie.setMaxAge (20);
        response.addCookie (cookie);
        } else {
            cookie = new Cookie("keterangan", "User ID atau panayozd salah");
            cookie.setMaxAge (15);
            response.addCookie (cookie);
        }
        response.sendRedirect("index.jsp");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
