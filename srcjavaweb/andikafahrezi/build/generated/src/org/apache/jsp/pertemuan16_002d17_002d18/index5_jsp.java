package org.apache.jsp.pertemuan16_002d17_002d18;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Koneksi</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylle.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try{
            String connectionURL = "jdbc:mysql://localhost/unpamjavaweb";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(connectionURL, username, password);
            
            statement = connection.createStatement();
            String query = " SELECT * FROM mahasiswa";
            rs = statement.executeQuery(query);
            
           String topMenu="<nav><ul>"
                    + "<li><a href=index5.jsp>Home</a></li>"
                    + "<li><a href=tambah.jsp>Tambah Data Mahasiswa</a>"
                    + "</li>"
                    + "</ul>"
                    + "</nav>";
           
            String userName="";
            
            if(!session.isNew()){
                try {
                    userName = session.getAttribute("userName").toString();
                } catch (Exception  ex){}
                
                try {
                    topMenu = session.getAttribute("menu").toString();
                } catch (Exception ex){}
                
                try {
                    topMenu = session.getAttribute("menu").toString();
                } catch(Exception ex){}
                
                }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\" align=\"center\">\n");
      out.write("                    <br>\n");
      out.write("                    <h2 colspan=\"4\" align=\"center\">\n");
      out.write("                        Data Mahasiswa\n");
      out.write("                    </h2>\n");
      out.write("                    <h1 colspan=\"4\" align=\"center\">\n");
      out.write("                        UNIVERSITAS PAMULANG\n");
      out.write("                    </h1>\n");
      out.write("                    <h4 colspan=\"4\" align=\"center\">\n");
      out.write("                        Jl. Surya Kencana No 1 Pamulang, Tangerang Selatan, Banten\n");
      out.write("                    </h4>\n");
      out.write("                    ");
      out.print(topMenu);
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <tr colspan=\"4\" align=\"center\">\n");
      out.write("                <th colspan=\"1\" align=\"center\">NIM</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Nama</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Alamat</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Program Studi</th>\n");
      out.write("                <th colspan=\"1\" align=\"center\">Aksi</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while (rs.next()) { 
      out.write("\n");
      out.write("            <tr colspan=\"4\" align=\"center\">\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getInt("nim")); 
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getString("nama")); 
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\">");
out.println(rs.getString("alamat")); 
      out.write("</td>\n");
      out.write("                <td colspan=\"2\" align=\"center\">");
out.println(rs.getString("prodi")); 
      out.write("</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\"><a href=\"edit.jsp?nim=");
out.println(rs.getInt("nim"));
      out.write("\">edit</td>\n");
      out.write("                <td colspan=\"1\" align=\"center\"><a href=\"delete.jsp?nim=");
out.println(rs.getInt("nim"));
      out.write("\">deletet</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                rs.close();
                statement.close();
                connection.close();
                } catch (Exception e){
System.err.println("GAGAL KONEKSI"+e.getMessage());
out.println("GAGAL"+e.getMessage());
}

      out.write("\n");
      out.write("<tr>\n");
      out.write("                <td colspan=\"4\" align=\"center\" bgcolor=\"#eeeeff\">\n");
      out.write("                <small>\n");
      out.write("                    Copyright &copy;2022 Universitas Pamulang <br>\n");
      out.write("                    Jl. Surya kencana No.1 Pamulang, Tangerang Selatan, Banten<br>\n");
      out.write("                </small>\n");
      out.write("            </td>\n");
      out.write("            </tr>\n");
      out.write("                \n");
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
