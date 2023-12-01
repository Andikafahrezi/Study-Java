<%-- 
    Document   : index3
    Created on : Nov 22, 2023, 11:13:12 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informasi Nilai Mahasiswa</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body bgcolor="808080">
        <%  
            String menu="<br><b>Master Data</b></br>"
                    + "<a href=.>Mahasiswa</a><br><br>"
                    + "<a href=.>Mata Kuliah</a><br><br>"
                    + "<b>Transaksi</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<b>Laporan</b><br>"
                    + "<a href=.>Nilai</a><br><br>"
                    + "<a href=LoginController>Login</a><br><br>";
            String topMenu="<nav><ul>"
                    + "<li><a href=.>Home</a></li>"
                    + "<li><a href=#>Master Data </a>"
                    + "<ul>"
                    + "<li><a href=.>Mahasiswa</a></li>"
                    + "<li><a href=.>Mata Kuliah</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Transaksi</a>"
                    + "<ul>"
                    + "<li><a href=.>Nilai</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=#>Laporan</a>"
                    + "<ul>"
                    + "<li><a href=.>Nilai</a></li>"
                    + "</ul>"
                    + "</li>"
                    + "<li><a href=LoginController>Login</a></li>"
                    + "</ul>"
                    + "</nav";
            
            String konten="<br><h1>Selamat Datang</h1>";
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
            %>
            
    <center>
        <table width="80%" bgcolor="eeeee">
            <tr>
                <td colspan="2" align="center">
                    <br>
                    <h2 style="margin-bottom: 0px; margin-top: 0px;">
                        Informasi Nilai Mahasiswa
                    </h2>
                    <h1 style="margin-bottom: 0px; margin-top: 0px;">
                        Universitas Pamulang
                    </h1>
                    <h4 style="margin-bottom: 0px; margin-top: 0px;">
                        Jl. Surya kencana no.1 Pamulang, Tangerang Selatan, Banten
                    </h4>
                    <br>
                </td>
            </tr>
            <tr height="400">
                <td width="200" align="center" valign="top" bgcolor="#eeffee">
                    <br>
                    <div id="menu">
                        <%=menu %>
                        
                    </div>
                </td>
                
                <td align="center" valign="top" bgcolor="#ffffff">
                    <%=topMenu%>
                    <br>
                    <%=konten%>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" bgcolor="#eeeeff">
                <small>
                    Copyright &copy;2016 Universitas Pamulang <br>
                    Jl. Surya kencana No.1 Pamulang, Tangerang Selatan, Banten<br>
                </small>
            </td>
            </tr>
        </table>
    </center>
    </body>
</html>
