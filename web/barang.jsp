<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>
<h1 align="center">Data Master Barang</h1>
<table border="0">
    <form action="BarangServlet" method="post" onsubmit="return validasi_inputBarang(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>Kode Barang</td> <td> : <input type="text" name="kode" value="${param.kode_barang}"/> </td>
        </tr>
        <tr>
            <td>Nama Barang</td> <td> : <input type="text" name="nama" value="${param.nama_barang}"/> </td>
        </tr>
        <tr>
            <td>Harga Barang</td> <td> : <input type="text" name="harga" onkeypress="return hanyaAngka(event)" 
            value="${param.harga}"/> </td>
        </tr>
        <tr>
            <td>Stok Barang</td> <td> : <input type="text" name="stok" onkeypress="return hanyaAngka(event)" 
            value="${param.stok}"/> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td> </td>
        </tr>
    </form>
</td></tr></table><br>
<form action="" method="post">
    Cari Data Barang : <input type="text" name="cari" value="${param.cari}"/>
    <input type="submit" value="Cari" class="button"/> <br>
</form>
<sql:query var="querybarang" dataSource="${dataSource}">
    SELECT * from barang where kode_barang like '%${param.cari}%' or
    nama_barang like '%${param.cari}%'
</sql:query>
<br><table border="1" width="100%" cellpadding="0" cellspacing="0">
    <tr class="head">
        <td>Kode Barang</td><td>Nama Barang</td><td>Harga Barang</td><td>Stok Barang</td><td>Action</td>
    </tr>
    <c:forEach var="rowbrg" items="${querybarang.rowsByIndex}">
        <tr class="isi">
            <td valign='top'>${rowbrg[0]}</td>
            <td valign='top'>${rowbrg[1]}</td>
            <td valign='top'>${rowbrg[2]}</td>
            <td valign='top'>${rowbrg[3]}</td>
            <td valign='top'><a href='BarangServlet?aksi=HAPUS&kode=${rowbrg[0]}'> Hapus</a> |
                <a href='beranda.jsp?halaman=tampilbrg&aksi=GANTI&kode_barang=${rowbrg[0]}
                   &nama_barang=${rowbrg[1]}&harga=${rowbrg[2]}&stok=${rowbrg[3]}'> Edit </a>
            </td>                                                          
        </tr>
    </c:forEach>
</table>