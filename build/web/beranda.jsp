<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql"uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/penjualan"
                   user="root"password=""/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Penjualan</title>
    <link href="config/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="config/setting.js"></script>
    
</head>
    <body>
        <div id="wrap">
            <div id="header" align="center"> 
                <h1><a>Sistem Informasi Penjualan</a></h1>
                <h2>Toko ASIENTO</h2>
                <h2>Jalan Sahabat Nomor 100 RT 06 RW 05 Tegal Alur, Jakarta Barat</h2>
            </div>
            <div id="menu">
                <ul>
                    <li><a href="beranda.jsp">Home</a></li>
                </ul>
            </div>
            <div id="content">
                <div class="left">
                <h2>Master Data</h2>
                <ul>
                    <li><a href="beranda.jsp?halaman=tampilbrg&aksi=SIMPAN">Data Barang</a></li>
                    <li><a href="beranda.jsp?halaman=tampilcus&aksi=SIMPAN">Data Customer</a></li>
                    <li><a href="beranda.jsp?halaman=tampiluser&aksi=SIMPAN">Data User</a></li>   
                </ul>
                <h2>Transaksi</h2>
                <ul>
                    <li><a href="beranda.jsp?halaman=pesan">Pemesanan</a></li>
                    <li><a href="beranda.jsp?halaman=jual">Penjualan</a></li>  
                    <li><a href="beranda.jsp?halaman=retur">Retur Penjualan</a></li>
                </ul>
                <h2>Laporan</h2>
                <ul>
                    <li><a href="beranda.jsp?halaman=cetaklapbarang">Laporan Barang</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklapcustomer">Laporan Customer</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklappemesanan">Laporan Pemesanan</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklappenjualan">Laporan Penjualan</a></li>
                    <li><a href="beranda.jsp?halaman=cetaklapretur">Laporan Retur Penjualan</a></li>
                </ul>
                </div>
                <div class="right">
                    <table width="100%">
                        <tr>
                            <td valign="top" width="110%">
                            <c:choose>
                                <c:when test="${param.halaman=='home'}">
                            <%@include file="home.jsp" %>
                        </c:when>                       
                        <c:when test="${param.halaman=='tampilbrg'}">
                            <%@include file="barang.jsp" %>
                        </c:when>    
                        <c:when test="${param.halaman=='tampilcus'}">
                            <%@include file="customer.jsp" %>
                        </c:when> 
                        <c:when test="${param.halaman=='tampiluser'}">
                            <%@include file="user.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='pesan'}">
                            <%@include file="pemesanan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='jual'}">
                            <%@include file="penjualan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='retur'}">
                            <%@include file="retur.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapbarang'}">
                            <%@include file="CetakLaporanBarang.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapcustomer'}">
                            <%@include file="CetakLaporanCustomer.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappemesanan'}">
                            <%@include file="CetakLaporanPemesanan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklappenjualan'}">
                            <%@include file="CetakLaporanPenjualan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='cetaklapretur'}">
                            <%@include file="CetakLaporanRetur.jsp" %>
                        </c:when>
                        <c:otherwise>
                            <%@include file="home.jsp" %>
                        </c:otherwise>
                    </c:choose>              
                            </td>                    
                        </tr>
                    </table>
            </div>
            <div style="clear:both;"></div>
            </div>
        </div>
    </body>
</html>

