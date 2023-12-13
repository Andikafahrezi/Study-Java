<%-- 
    Document   : Validasi
    Created on : Nov 8, 2023, 11:49:55 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String userId = request.getParameter("userId");
            String password = request.getParameter("password");
            Cookie cookie;
            
            if ((userId != null) && (userId.equalsIgnoreCase("ADMIN"))
                    && (password != null) && (password.equalsIgnoreCase("ADMIN"))){
                
                 java.text.SimpleDateFormat waktu = 
                         new java.text.SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                 java.util.Date waktuLogin = new java.util.Date();
             
                 session.setAttribute ("userLogin", "Administrator");
                 session.setAttribute ("waktuLogin", waktu.format(waktuLogin));
                 session.setMaxInactiveInterval(20);
                 
                 cookie = new Cookie ("nama", "Administrator");
                 cookie.setMaxAge (15);
                 response.addCookie (cookie);

            } else {
                cookie = new Cookie ("Keterangan", "User ID atau password salah");
                cookie.setMaxAge(15);
                response.addCookie(cookie);
            }
            
              response.sendRedirect("index.jsp");
            
         %>
    </body>
</html>
