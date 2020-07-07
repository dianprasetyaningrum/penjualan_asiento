<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.pemesanan,model.penjualan"%>
<%@page import="java.util.Date" %>
<%@include file="config/kode.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    pemesanan pemesanan = new pemesanan();
    ResultSet qrypesan = null;
    String no = null;
    String sql = "SELECT MAX(RIGHT(no_jual,6)) FROM penjualan";
    koneksi kon = new koneksi();
    ResultSet rs = kon.stmt.executeQuery(sql);
    if (!rs.next()) {
        no = "PJ000001";
    } else {
        int urutanBaru = rs.getInt(1) + 1;
        String kode = String.valueOf(urutanBaru);
        int panjangKode = kode.length();
        for (int i = panjangKode; i < 6; i++) {
            kode = "0" + kode;
        }
        no = "PJ" + kode;
    }
    String nof = "FK" + no.substring(2);
%>
<html>
    <head>
        <title>Transaksi Penjualan</title>
    </head>
    <body>
        <h1 align="center">Transaksi Penjualan Barang</h1></br>
        <table border="0">
            <form action="PenjualanServlet" method="post">
                <h2>Data Penjualan</h2>
                <tr>
                    <td>No Penjualan</td>
                    <td>: <input type="text" name="no" value="<%=no%>" readonly/> </td>
                </tr>
                <tr>
                    <td>No Faktur</td>
                    <td>: <input type="text" name="nof" value="<%=nof%>" readonly/> </td>
                </tr>
                <tr>
                    <td>Tanggal Jual</td>
                    <td>: <input type="text" name="tgl" value =<%= tgl%> ></td>
                </tr>
                <tr>
                    <td>Nomor Pesan</td>
                    <td>: <select name="nopes" onchange="showPesan(this.value);">
                    <option value="-1">Pilih Nomor Pesan</option>
                    <%
                    qrypesan = kon.stmt.executeQuery("SELECT no_pemesanan FROM pemesanan where not exists"
                    + "(select * from penjualan where pemesanan.no_pemesanan=penjualan.no_pemesanan)");
                    while (qrypesan.next()) {
                    pemesanan.setNopemesanan(qrypesan.getString("no_pemesanan"));
                    %>
                    <option value="<%=pemesanan.getNopemesanan()%>"><%=pemesanan.getNopemesanan()%></option>
                    <%  }%>
                    </select>
                    </td>
                </tr>
                <input type="hidden" class="form-control" name="nopes" id="pesan" value="${param.cari}">
                <tr>
                    <td><input type="submit" name="aksi" value="Tambah"/></td></br>
                </tr>
        </table>
        <%
            sql = "select * from tabel_sementara";
            rs = kon.stmt.executeQuery(sql);
        %>
        <br/><br/>
        <table width="535" border="1" align="center">
        <tr align="center">
            <td colspan="5"><h3 align="center">Data Barang Untuk Dijual</h3></td>
        </tr>
        <tr>
            <th>Nomor</th>
            <th>Kode Barang</th>
            <th>Quantity</th>
            <th>Subtotal</th>
            <th>AKSI</th>
        </tr>
            <% if (!rs.next()) { %>
            <tr>
                <td colspan="5">Data masih kosong</td>
            </tr>
            <% } %>
            <% rs.beforeFirst(); %>
            <% while (rs.next()) {%>
            <tr class="isi">
                <td><%= rs.getString(1)%></td>
                <td><%= rs.getString(2)%></td>
                <td><%= rs.getString(3)%></td>
                <td><%= rs.getString(4)%></td>
                <td>
                    <a href="PenjualanServlet?aksi=Delete&kodebarang=<%= rs.getString(2)%>">
                        HAPUS
                    </a>
                </td>
            </tr>
            <% }%>
        </table>
        <table>
            <sql:query var="ttl" dataSource="${dataSource}">
                SELECT SUM(quantity) AS ttl_D,
                SUM(subtotal) AS ttl_K FROM tabel_sementara
            </sql:query>
            <c:forEach var='ttlDK'items='${ttl.rowsByIndex}'><br>
                <table border="0">
                    <tr>
                        <td>Total Jumlah Barang Dijual</td>
                        <td>: <input type="text" readonly="readonly" name="total" size="1" value="${ttlDK[0]}"></td>
                    </tr>
                    <tr>
                        <td>Total Bayar</td>
                        <td>: <input type="text" readonly="readonly" name="tobay" value="${ttlDK[1]}"></td>
                    </tr>
            </c:forEach>
            <tr><td><input type="submit" value="Simpan" name="aksi"></td></tr>
            </table>
    </body>
</html>
