<%-- 
    Document   : index1
    Created on : Nov 15, 2023, 11:24:13 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Form memasukan Nilai</h2>
        <form action="HitungBarang" method="post">
            <table>
                <tr> 
                    <td> NamaBarang </td>
                    <td><input type="text" name="namabarang"></td>
                </tr>
                <tr> 
                    <td> HargaSatuan </td>
                    <td><input type="text" name="hargasatuan"></td>
                </tr>
                
                <tr> 
                    <td> Jumlah </td>
                    <td><input type="text" name="jumlah"></td>
                </tr>
                <tr> 
                    <td colspan="2">Diskon diberikan sebesar 5% jika jummlah >= 100 </td>
                </tr>
                <tr> 
                    <td colspan="2">Dan total harga sebelum di diskon >= 10000000</td>
                </tr>
                <tr> 
                    <td colspan="2"><input type="submit" value="hitung"></td>
                </tr>  
            </table>
        </form>
    </body>
</html>
