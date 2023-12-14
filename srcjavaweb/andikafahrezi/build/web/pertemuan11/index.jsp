<%-- 
    Document   : index
    Created on : Nov 8, 2023, 11:47:54 AM
    Author     : DIKA
--%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>materi session dan cookies</title>
    </head>
    <body>
        <%
            String userLogin ="";
            Cookie[] cookies = request.getCookies();
            String waktuLogin ="";
            java.util.Date saatIni = new java.util.Date();
            java.text.SimpleDateFormat waktu = new java.text.SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            if (!session.isNew()){
                try {
                    userLogin = session.getAttribute("userLogin").toString();
                    waktuLogin = session.getAttribute("waktuLogin").toString();
                } catch (Exception ex) {}
            }
            if ((cookies != null) && (cookies.length > 0)){
                for (int i=0; i<cookies.length; i++) {
         %>
         Data cookie ke-<%=i %> nama: <%=cookies[i].getName() %> <br>
         Data cookie ke-<%=i %> data: <%=cookies[i].getName() %> <br>
         <%
                   
                }
            }
            
            if(!userLogin.equals("")){
%>
<h2>Belajar Cookies dan Session</h2>
Sudah login dengan nama <%=userLogin %> <br>
Waktu login : <%=waktuLogin %> <br>
Waktu saat ini : <%=waktu.format(saatIni) %> <br>
<% } else{ %>
<form action="Validasi.jsp" method="post">
    <table>
        <tr>
            <td> User ID</td>
            <td><input type="text" name="userId"></td>
        </tr>
        
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"</td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="login">
            </td>
        </tr>
    </table>
</form>
<% } %>            
    </body>
</html>