package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Penjualan Barang</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylee.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"808080\">\n");
      out.write("        ");
  
            String menu="<br><b>Data Penjualan</b></br>"
                    + "<a href=.>Barang keluar</a><br>"
                    + "<a href=.>Barang masuk</a><br><br>"
                    + "<b>Transaksi</b><br>"
                    + "<a href=.>Barang yang terjual</a><br><br>"
                    + "<b>Laporan</b><br>"
                    + "<a href=.>Barang Terjual</a><br><br>"
                    + "<a href=.>Barang Tersedia</a><br><br>"
                    + "<a href=LoginController>Login</a><br><br>";
            String topMenu="<nav><ul>"
                    + "<li><a href=.>Home</a></li>"
                    + "<li><a href=#>Data Barang </a>"
                    + "<ul>"
                    + "<li><a href=.>Barang Masuk</a></li>"
                    + "<li><a href=.>Barang Terjual</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Transaksi Barang</a>"
                    + "<ul>"
                    + "<li><a href=.>Barang terjual</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Laporan</a>"
                    + "<ul>"
                    + "<li><a href=.>Barang Terjual</a></li>"
                    + "<li><a href=.>Barang Tersedia</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=LoginController>Login</a></li>"
                    + "</ul>"
                    + "</nav";
            
            String konten="<br><h1>Toko Addustcorp</h1>";
            String userName="";
            
            if(!session.isNew()){
                try {
                    userName = session.getAttribute("userName").toString();
                } catch (Exception  ex){}
                
                if(!((userName==null) || userName.equals(""))){
                    konten += "<h2>"+userName+"<h2>";
                    
                
                try {
                    menu = session.getAttribute("menu").toString();
                } catch (Exception ex){}
                
                try {
                    topMenu = session.getAttribute("topMenu").toString();
                } catch(Exception ex){}
                
                }
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("    <center>\n");
      out.write("        <table width=\"80%\" bgcolor=\"blue\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\">\n");
      out.write("                    <br>\n");
      out.write("                    <h2 style=\"margin-bottom: 0px; margin-top: 0px;\">\n");
      out.write("                        Tampilan Admin\n");
      out.write("                    </h2>\n");
      out.write("                    <h1 style=\"margin-bottom: 0px; margin-top: 0px;\">\n");
      out.write("                        Toko Addustcorp\n");
      out.write("                    </h1>\n");
      out.write("                    <h4 style=\"margin-bottom: 0px; margin-top: 0px;\">\n");
      out.write("                        Jl. Mangga sembilan no 23 Tangerang Utara\n");
      out.write("                    </h4>\n");
      out.write("                    <br>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr height=\"400\">\n");
      out.write("                <td width=\"200\" align=\"center\" valign=\"top\" bgcolor=\"black\">\n");
      out.write("                    <br>\n");
      out.write("                    <div id=\"menu\">\n");
      out.write("                        ");
      out.print(menu );
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td align=\"center\" valign=\"top\" bgcolor=\"white\">\n");
      out.write("                    ");
      out.print(topMenu);
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    ");
      out.print(konten);
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" align=\"center\" bgcolor=\"black\">\n");
      out.write("                <small>\n");
      out.write("                    Copyright &copy;2016 Universitas Pamulang <br>\n");
      out.write("                    Jl. Surya kencana No.1 Pamulang, Tangerang Selatan, Banten<br>\n");
      out.write("                </small>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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
