<%-- 
    Document   : proses-edit
    Created on : Nov 29, 2023, 11:47:54 AM
    Author     : DIKA
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@page import="java.sql.*"%>
         <%
             String nim=request.getParameter("nim");
                   String nama=request.getParameter("nama");
                   String alamat=request.getParameter("alamat");
                   String prodi=request.getParameter("prodi");
                   if (nim !=null){
                       Connection conn=null;
                       PreparedStatement ps =null;
                       try{
                           Class.forName("com.mysql.jdbc.Driver");
                           conn = DriverManager.getConnection("jdbc:mysql://localhost/unpamjavaweb","root","");
                            String query = "UPDATE mahasiswa SET nim=?, nama=?, alamat=?, prodi=? WHERE nim="+nim+"";
                            ps = conn.prepareStatement (query);
                            ps.setString(1, nim);
                           ps.setString(2, nama);
                           ps.setString(3, alamat);
                           ps.setString(4, prodi);
                           int i=ps.executeUpdate();
                           response.sendRedirect("index5.jsp");
                       } catch (Exception e){
                           response.sendRedirect("index5.jsp");
                       }}
                   %>
                   
                   
    </body>
</html>