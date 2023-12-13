<%-- 
    Document   : tambah
    Created on : Dec 2, 2023, 10:20:49 AM
    Author     : DIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data Mahasiswa</title>
        <link rel="stylesheet" href="stylle.css"/>
    </head>
    <body>
        <%@page import="java.sql.*"%>
        <%@page import="javax.swing.*"%>
        
        <%
            String topMenu="<nav><ul>"
                    + "<li><a href=index5.jsp>Home</a></li>"
                    + "<li><a href=tambah.jsp>Tambah Data Mahasiswa</a>"
                    + "</li>"
                    + "</ul>"
                    + "</nav>";
            
            //PanggilHasilPenginputan
            String nim=request.getParameter("nim");
            String nama=request.getParameter("nama");
            String alamat=request.getParameter("alamat");
            String prodi=request.getParameter("prodi");
            String URL = "jdbc:mysql://localhost/unpamjavaweb";
            
            //koneksi database
            Connection conn = null;
            PreparedStatement ps= null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            int updateQuery=0;
            
            //notifikasi bahwa seluruh form tidak boleh kosong
            
            if(nim!=null &&  nama!=null && alamat!=null && prodi!=null){
                try{
                    conn=DriverManager.getConnection(URL, "root", "");
                    String query = "INSERT INTO mahasiswa (nim,nama,alamat,prodi) VALUES (?,?,?,?)"; ps = conn.prepareStatement (query);
                    ps.setString(1, nim);
                    ps.setString(2, nama);
                    ps.setString(3, alamat);
                    ps.setString(4, prodi);
                    updateQuery=ps.executeUpdate();
                    if (updateQuery!=0) {
                        JOptionPane.showMessageDialog(null, "Berhasil Tambah Data Mahasiswa");
                        response.sendRedirect("index5.jsp");
                    }
                } catch(Exception e){
                    response.sendRedirect("index5.jsp");
                } finally{
                    ps.close();
                    conn.close();
                }
            }
            %>
    <center>
        <table width="80%" bgcolor="#eeeeee">
            <tr>
                <td colspan="4" align="center">
                    <br>
                    <h2 colspan="4" align="center">
                        Tambah Data Mahasiswa
                    </h2>
                    <h1 colspan="4" align="center">
                        UNIVERSITAS PAMULANG
                    </h1>
                    <h4 colspan="4" align="center">
                        Jl. Surya Kencana No 1 Pamulang, Tangerang Selatan, Banten
                    </h4>
                    <%=topMenu%>
    </center>
    <br>
    <form colspan="4" align="center" action="" method="POST">
        <label>Nim  :</label><input type="text" name="nim"/><br/>
        <label>Nama Mahasiswa :</label><input type="text" name="nama"/><br/>
        <label>Alamat  :</label><input type="text" name="alamat"/><br/>
        <label>Program Studi  :</label>
        <select id="prodi" name="prodi">
            <option value="Teknik Informatika">Teknik Informatika</option><option value="Sistem Informasi">Sistem Informasi</option>
            <option value="Akuntansi">Akuntansi</option><option value="Menejemen">Manajemen</option>
        </select><br/>
        <br>
        <input type="submit" name="submit" value="simpan"/>
        <button href="index5.jsp">Kembali</button><br><br>
    </form>
    <center>
        <tr>
            <td colspan="4" align="center" bgcolor="#eeeeff">
                <small>
                    Copyright &copy;2022 Universitas Pamulang <br>
                    Jl. Surya kencana No.1 Pamulang, Tangerang Selatan, Banten<br>
                </small>
            </td>
            </td>
        </tr>
    </table>
    </center>
    </body>
</html>
