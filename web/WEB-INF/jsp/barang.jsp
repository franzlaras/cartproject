<%-- 
    Document   : barang
    Created on : Oct 17, 2017, 11:47:23 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item Page</title>
    </head>
    <header >
        
    </header>
    <body class="container">
        <div class="header clearfix">
        <p class="align-right">Isi Keranjang :</p>
        </div>
        <div class="row">
        <h1>Daftar Barang</h1>
        <p:forEach var="bd" items="${brg}">
            
        <div class="col-md-4">
          <h2><a href="${bd.barangId}">${bd.barangNama}</a></h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="${bd.barangId}" role="button">View details &raquo;</a></p>
        </div>
        </p:forEach>
            </div>
     <nav aria-label="...">
        <ul class="pager">
          <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> Back</a></li>
          <li class="next"><a href="#">Next <span aria-hidden="true">&rarr;</span></a></li>
        </ul>
      </nav>

    </body>
</html>
