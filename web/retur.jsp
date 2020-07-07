<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.barang,model.customer,model.retur"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgl = tahun + "-" + bulan + "-" + tanggal;
    retur retur = new retur();
    barang barang = new barang();
    customer customer = new customer();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qrybarang = null;
    ResultSet qryretur = null;
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Transaksi Retur</title>
</head>
<body>
<h1 align="center">Transaksi Retur</h1><br>
<table border="0">
<form action="ReturServlet" method="post">
<pre>
<tr>
<td>No Retur</td> <td> : <%
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    ResultSet noretur = null;
                    noretur = kon.stmt.executeQuery("select max(right(no_retur,6)) as no FROM retur_jual");
                    while (noretur.next()) {
                        if (noretur.first() == false) {
                            out.println("<input type='text' class='form-control' id='noret' readonly value='RT000001' name='no_retur'>");
                        } else {
                            noretur.last();
                            int autonort = noretur.getInt(1) + 1;
                            String nomorrt = String.valueOf(autonort);
                            int noLong = nomorrt.length();
                
                            for (int a = 1; a < 7 - noLong; a++) {
                                nomorrt = "0" + nomorrt;
                            }
                            String nomerrt = "RT" + nomorrt;
                            out.println("<input type='text' class='form-control' id='noret' readonly value='" + nomerrt + "' name='no_retur'>");
                        }
                        
                    }
                } catch (Exception e) {
                   out.println(e);
                }
            %>
</td>
</tr>
</pre>
            <tr>
                <td>Tanggal Retur</td>  <td>: <input type="text" name="tanggal" value =<%= tgl%> readonly="readonly"></td>
            </tr> 
            <tr>
                <td>Customer</td>       <td>: <select name="customer"> 
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
            </tr>
            <tr>
                <td>Barang</td>         <td>: <select name="kode" onchange="showEmp(this.value);">
                        <option value="-1">Select</option>
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
                <td>Jumlah Retur</td>  <td>: <input type="text" name="jml" id="jml" onkeyup="sumPesan();"></td>
            </tr>
            <tr>
                <td>Subtotal</td>      <td>: <input type="text" name="sub" id="subtotal" readonly="readonly"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Tambah" name="aksi1"></td>
            </tr>
</table><br>
    
    <table width="535" border="1" align="center">
        <tr align="center">
            <td colspan="5"><h3 align="center">Data Barang Untuk Diretur</h3></td>
        </tr>
        <tr>
            <th>No Retur</th>
            <th>Kode Barang</th>
            <th>Quantity</th>
            <th>Subtotal</th>
            <th>AKSI</th>
        </tr>
        <% 
            rs = kon.stmt.executeQuery("SELECT * from tabel_sementara");
            while (rs.next()) {
                out.println("<tr class=isi>"
                        + "<td>" + rs.getString(1) + "</td>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=ReturServlet?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a> </td>"
                        + "</tr>");
            }
        %>
    </table>
    <table>
        <sql:query var="ttl" dataSource="${dataSource}">
            SELECT SUM(quantity) AS ttl_D,
            SUM(subtotal) AS ttl_K FROM tabel_sementara
        </sql:query>
        <c:forEach var='ttlDK'items='${ttl.rowsByIndex}'><br>
            <table border="0">
                <tr>
                    <td>Total Jumlah Barang Diretur</td> 
                    <td>: <input type="text" readonly="readonly" name="totjumlah" size="1" value="${ttlDK[0]}"></td>
                </tr>
                <tr>
                    <td>Total Retur Jual</td>
                    <td>: <input type="text" readonly="readonly" name="totretur" value="${ttlDK[1]}"></td>
                </tr>
    </c:forEach>
    <tr><td><input type="submit" value="Simpan" name="aksi3"></td></tr>
</table>
</body>
</html>
