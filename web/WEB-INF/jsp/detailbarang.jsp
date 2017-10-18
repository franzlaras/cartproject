<%-- 
    Document   : detailbarang
    Created on : Oct 17, 2017, 3:26:51 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Barang</title>
    </head>
    <body class="container">
        <p>Isi Keranjang :</p>
        <h1>${brgData.barangNama}</h1>
        <div class="col-md-4" >
          <h2><a href="${bd.barangId}">${bd.barangNama}</a></h2>
          <img src="images/bird.png" class="img-rounded" alt="Cinque Terre" width="304" height="236">
          <p>Jenis : ${brgData.barangJenis}</p>
        <p>Harga : ${brgData.barangHarga}</p>
        <p>Stock : ${brgData.barangStok}</p>
        <p>Kondisi : ${brgData.barangKondisi}</p>
          <p><a class="btn btn-default" href="add" role="button">Add to Keranjang >></a></p>
        </div>
    </body>
</html>
