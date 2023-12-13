<%-- 
    Document   : index2
    Created on : Nov 19, 2023, 10:05:25 AM
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
         <h2>Form memasukan Nilai</h2>
        <form action="HitungLuas" method="post">
            <table>
                <tr> 
                    <td> Panjang        :</td>
                    <td><input type="text" name="panjang"></td>
                </tr>
                <tr> 
                    <td> Lebar          :</td>
                    <td><input type="text" name="lebar"></td>
                </tr>
                <tr> 
                    <td colspan="2"><input type="submit" value="hitung"></td>
                </tr>  
            </table>
        </form>
    </body>
</html>
