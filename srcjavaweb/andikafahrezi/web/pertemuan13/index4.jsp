<%-- 
    Document   : index4
    Created on : Nov 22, 2023, 11:13:12 AM
    Author     : DIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Barang</title>
        <link rel="stylesheet" href="stylee.css"/>
    </head>
    <body bgcolor="808080">
        <%  
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
            %>
            
    <center>
        <table width="80%" bgcolor="blue">
            <tr>
                <td colspan="2" align="center">
                    <br>
                    <h2 style="margin-bottom: 0px; margin-top: 0px;">
                        Tampilan Admin
                    </h2>
                    <h1 style="margin-bottom: 0px; margin-top: 0px;">
                        Toko Addustcorp
                    </h1>
                    <h4 style="margin-bottom: 0px; margin-top: 0px;">
                        Jl. Mangga sembilan no 23 Tangerang Utara
                    </h4>
                    <br>
                </td>
            </tr>
            <tr height="400">
                <td width="200" align="center" valign="top" bgcolor="black">
                    <br>
                    <div id="menu">
                        <%=menu %>
                        
                    </div>
                </td>
                
                <td align="center" valign="top" bgcolor="white">
                    <%=topMenu%>
                    <br>
                    <%=konten%>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center" bgcolor="black">
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
