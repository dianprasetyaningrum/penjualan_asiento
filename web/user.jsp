<%@page import="control.koneksi"%>
<%@page import="java.sql.*" %>
<h1 align="center">Data Master User</h1>
<table border="0">
    <form action="userServlet" method="post" onsubmit="return validasi_inputUser(this)">
        <input type="hidden" name="aksi" value="${param.aksi}"/>
        <tr>
            <td>ID User</td> <td> : <input type="text" name="id_user" value="${param.id_user}"/> </td>
        </tr>
        <tr>
            <td>Nama User</td> <td> : <input type="text" name="nama_user" value="${param.nama_user}"/> </td>
        </tr>
        <tr>
            <td>Hak Akses</td> <td> : <input type="text" name="hak_akses" value="${param.hak_akses}"/> </td>
        </tr>
        <tr>
            <td>Password</td> <td> : <input type="text" name="password" onkeypress="return hanyaAngka(event)"
            value="${param.password}"/> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Simpan" class="button"/></td> <td> </td>
        </tr>
    </form>
</td></tr></table><br>
<form action="" method="post">
    Cari Data User : <input type="text" name="cari" value="${param.cari}"/>
    <input type="submit" value="Cari" class="button"/> <br>
</form>
<sql:query var="queryuser" dataSource="${dataSource}">
    SELECT * from user where id_user like '%${param.cari}%' or
    nama_user like '%${param.cari}%'
</sql:query>
<br><table border="1" width="100%" cellpadding="0" cellspacing="0">
    <tr class="head">
        <td>ID</td><td>ID User</td><td>Nama User</td><td>Hak Akses</td><td>Password</td><td>Action</td>
    </tr>
    <c:forEach var="rowuser" items="${queryuser.rowsByIndex}">
        <tr class="isi">
            <td valign='top'>${rowuser[0]}</td>
            <td valign='top'>${rowuser[1]}</td>
            <td valign='top'>${rowuser[2]}</td>
            <td valign='top'>${rowuser[3]}</td>
            <td valign='top'>${rowuser[4]}</td>
            <td valign='top'><a href='userServlet?aksi=HAPUS&id_user=${rowuser[1]}'> Hapus</a> |
                <a href='beranda.jsp?halaman=tampiluser&aksi=GANTI&id_user=${rowuser[1]}
                &nama_user=${rowuser[2]}&hak_akses=${rowuser[3]}&password=${rowuser[4]}'> Edit </a>
            </td>                                                          
        </tr>
    </c:forEach>
</table>