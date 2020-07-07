<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.barang,model.customer,model.pemesanan"%>
<%@page import="java.util.Date"%>
<%@include file="config/kode.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    pemesanan pemesanan = new pemesanan();
    barang barang = new barang();
    customer customer = new customer();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrybarang = null;
    ResultSet qrypemesanan = null;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Transaksi Pemesanan</title>
</head>
<body>
<sql:query var="ttl" dataSource="${dataSource}">
    SELECT SUM(quantity) AS ttl_D,
    SUM(subtotal) AS ttl_K FROM tabel_sementara
</sql:query>
    <h1 align="center">Transaksi Pemesanan Barang</h1><br>
    <table border="0">
        <form action="PemesananServlet" method="post">
            <h2>Data Barang</h2>
            <tr> 
                <td>No Pesan</td>       <td>: <input type="text" name="no_pemesanan" id="nopemesanan" value="" 
                 readonly="readonly"/>
                <input type="button" onclick="pesan()" value="Add No pesan" class="button"></td>
            </tr>
            <tr>
                <td>Tanggal Pesan</td>  <td>: <input type="text" name="tanggal" value =<%= tgl%> readonly="readonly"></td>
            </tr> 
            <tr>
                <td>Barang</td>         <td>: <select name="kode" onchange="showEmp(this.value);">
                        <option value="-1">Pilih Barang</option>
                        <%
                            rs =  kon.stmt.executeQuery("SELECT * from barang ");
                            while (rs.next()) {
                                barang.setKodebarang(rs.getString("kode_barang"));
                                barang.setNamabarang(rs.getString("nama_barang"));
                        %>
                        <option value="<%=barang.getKodebarang()%>"><%=barang.getKodebarang()%>
                            || <%=barang.getNamabarang()%></option>
                        <% } %>
                    </select></td> 
            </tr>
            <input type="hidden" name="emp_id" id="emp_id" value="">
            <tr>
                <td>Harga Barang</td>  <td>: <input type="text" name="harga" id="ename" value=""
                readonly="readonly" onkeyup="sumPesan();"></td>
            </tr>
            <tr>
                <td>Jumlah Pesan</td>  <td>: <input type="text" name="jml" id="jml" onkeyup="sumPesan();"></td>
            </tr>
            <tr>
                <td>Subtotal</td>      <td>: <input type="text" name="sub" id="subtotal" readonly="readonly"></td>
            </tr>
            <tr>
                <td><input type="submit" value="TAMBAH" name="aksi1"></td>
            </tr>
    </table>
    <h2>Data Customer</h2>
    Customer       <select name="customer">
        <option value="-1">Pilih Customer</option>
        <% 
            rs = kon.stmt.executeQuery("SELECT * from customer ");
            while (rs.next()) {
                customer.setIdcustomer(rs.getString("id_customer"));
                customer.setNamacustomer(rs.getString("nama_customer"));
        %>
        <option value="<%=customer.getIdcustomer()%>"><%=customer.getNamacustomer()%></option>
        <%  } %>
    </select><br><br>
            
    <table width="535" border="1" align="center">
        <tr align="center">
            <td colspan="5"><h3 align="center">Data Barang Untuk Dipesan</h3></td>
        </tr>
        <tr>
            <th>Kode Barang</th>
            <th>Quantity</th>
            <th>Subtotal</th>
            <th>AKSI</th>
        </tr>
        <% 
            rs = kon.stmt.executeQuery("SELECT * from tabel_sementara");
            while (rs.next()) {
                out.println("<tr class=isi>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=PemesananServlet?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                        + "</tr>");
            }
        %>
    </table>
    <c:forEach var='ttlDK'items='${ttl.rowsByIndex}'><br>
        <table border="0">
            <tr><td>Total Jumlah Barang Dipesan</td> <td>:
                    <input type="text" readonly="readonly" name="totjum" size="1" value="${ttlDK[0]}"></td></tr>
            <tr><td>Total Bayar</td>                 <td>:
                    <input type="text" readonly="readonly" name="tobay" value="${ttlDK[1]}"></td></tr>
    </c:forEach>
    <%kon.close();%>
    <tr><td><input type="submit" value="PROSES" name="aksi3"> <input type="reset" value="CANCEL"></td></tr>
</table>
</form>
</body>
</html>