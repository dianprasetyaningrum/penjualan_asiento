<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>
<h1 align="center">Data Master Customer</h1>
<table border="0">
    <form action="cusServlet" method="post" onsubmit="return validasi_inputCustomer(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>ID Customer</td> <td> : <input type="text" name="id_customer" value="${param.id_customer}"/></td>
        </tr>
        <tr>
            <td>Nama Customer</td> <td> : <input type="text" name="nama_customer" value="${param.nama_customer}"/></td>
        </tr>
        <tr>
            <td>Alamat</td> <td> : <input type="text" name="alamat" value="${param.alamat}"/></td>
        </tr>
        <tr>
            <td>Telepon</td> <td> : <input type="text" name="telpon" onkeypress="return hanyaAngka(event)" 
            value="${param.telpon}"/> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td> </td>
        </tr>
    </form>
</table><br>
<form action="" method="post">
    Cari Data Customer : <input type="text" name="cari" value="${param.cari}"/>
    <input type="submit" value="Cari" class="button"/> <br>
</form>
<sql:query var="querycustomer" dataSource="${dataSource}">
    SELECT * from customer where id_customer like '%${param.cari}%' or
    nama_customer like '%${param.cari}%'
</sql:query>
<br><table border="1" width="100%" cellpadding="0" cellspacing="0">
    <tr class="head">
        <td>ID Customer</td><td>Nama Customer</td><td>Alamat</td><td>Telepon</td><td>Action</td>
    </tr>
    <c:forEach var="rowcus" items="${querycustomer.rowsByIndex}">
        <tr class="isi">
            <td valign='top'>${rowcus[0]}</td>
            <td valign='top'>${rowcus[1]}</td>
            <td valign='top'>${rowcus[2]}</td>
            <td valign='top'>${rowcus[3]}</td>
            <td valign='top'><a href='cusServlet?aksi=HAPUS&id_customer=${rowcus[0]}'> Hapus</a> |
                <a href='beranda.jsp?halaman=tampilcus&aksi=GANTI&id_customer=${rowcus[0]}
                &nama_customer=${rowcus[1]}&alamat=${rowcus[2]}&telpon=${rowcus[3]}'> Edit </a>
            </td>                                                          
        </tr>
    </c:forEach>
</table>