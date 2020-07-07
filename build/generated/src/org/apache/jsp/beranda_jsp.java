package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.customer;
import model.pemesanan;
import java.util.Date;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import model.pemesanan;
import model.penjualan;
import java.util.Date;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.customer;
import model.retur;
import java.util.Date;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/home.jsp");
    _jspx_dependants.add("/barang.jsp");
    _jspx_dependants.add("/customer.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/pemesanan.jsp");
    _jspx_dependants.add("/config/kode.jsp");
    _jspx_dependants.add("/penjualan.jsp");
    _jspx_dependants.add("/retur.jsp");
    _jspx_dependants.add("/CetakLaporanBarang.jsp");
    _jspx_dependants.add("/CetakLaporanCustomer.jsp");
    _jspx_dependants.add("/CetakLaporanPemesanan.jsp");
    _jspx_dependants.add("/CetakLaporanPenjualan.jsp");
    _jspx_dependants.add("/CetakLaporanRetur.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <title>Aplikasi Penjualan</title>\n");
      out.write("    <link href=\"config/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"config/setting.js\"></script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div id=\"header\" align=\"center\"> \n");
      out.write("                <h1><a>Sistem Informasi Penjualan</a></h1>\n");
      out.write("                <h2>Toko ASIENTO</h2>\n");
      out.write("                <h2>Jalan Sahabat Nomor 100 RT 06 RW 05 Tegal Alur, Jakarta Barat</h2>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp\">Home</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                <h2>Master Data</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=tampilbrg&aksi=SIMPAN\">Data Barang</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=tampilcus&aksi=SIMPAN\">Data Customer</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=tampiluser&aksi=SIMPAN\">Data User</a></li>   \n");
      out.write("                </ul>\n");
      out.write("                <h2>Transaksi</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=pesan\">Pemesanan</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=jual\">Penjualan</a></li>  \n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=retur\">Retur Penjualan</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <h2>Laporan</h2>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=cetaklapbarang\">Laporan Barang</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=cetaklapcustomer\">Laporan Customer</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=cetaklappemesanan\">Laporan Pemesanan</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=cetaklappenjualan\">Laporan Penjualan</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?halaman=cetaklapretur\">Laporan Retur Penjualan</a></li>\n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <table width=\"100%\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td valign=\"top\" width=\"110%\">\n");
      out.write("                            ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("                       \n");
          out.write("                        ");
          if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("    \n");
          out.write("                        ");
          if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write(" \n");
          out.write("                        ");
          if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='pesan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write('\n');
              out.write('\n');
              out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopemesanan = null;
        nopemesanan = kon.stmt.executeQuery("select max(right(no_pemesanan,6)) as no FROM pemesanan");
        while (nopemesanan.next()) {
            if (nopemesanan.first() == false) {
                out.println("<input type='hidden' name='no_pemesanan' value='PS000001' id='nopes'/>");
            } else {
                nopemesanan.last();
                int autonops = nopemesanan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' name='no_pemesanan' id='nopes' value='" + nomerps + "'/>");
            }
        }
    } catch (Exception e) {
        out.println(e);
    }

              out.write('\n');
              out.write('\n');
              out.write('\n');
 java.util.Date waktu = new java.util.Date();
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

              out.write("\n");
              out.write("<html>\n");
              out.write("<head>\n");
              out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("    <title>Transaksi Pemesanan</title>\n");
              out.write("</head>\n");
              out.write("<body>\n");
              if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
                return;
              out.write("\n");
              out.write("    <h1 align=\"center\">Transaksi Pemesanan Barang</h1><br>\n");
              out.write("    <table border=\"0\">\n");
              out.write("        <form action=\"PemesananServlet\" method=\"post\">\n");
              out.write("            <h2>Data Barang</h2>\n");
              out.write("            <tr> \n");
              out.write("                <td>No Pesan</td>       <td>: <input type=\"text\" name=\"no_pemesanan\" id=\"nopemesanan\" value=\"\" \n");
              out.write("                 readonly=\"readonly\"/>\n");
              out.write("                <input type=\"button\" onclick=\"pesan()\" value=\"Add No pesan\" class=\"button\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Tanggal Pesan</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
              out.print( tgl);
              out.write(" readonly=\"readonly\"></td>\n");
              out.write("            </tr> \n");
              out.write("            <tr>\n");
              out.write("                <td>Barang</td>         <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\n");
              out.write("                        <option value=\"-1\">Pilih Barang</option>\n");
              out.write("                        ");

                            rs =  kon.stmt.executeQuery("SELECT * from barang ");
                            while (rs.next()) {
                                barang.setKodebarang(rs.getString("kode_barang"));
                                barang.setNamabarang(rs.getString("nama_barang"));
                        
              out.write("\n");
              out.write("                        <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write("\n");
              out.write("                            || ");
              out.print(barang.getNamabarang());
              out.write("</option>\n");
              out.write("                        ");
 } 
              out.write("\n");
              out.write("                    </select></td> \n");
              out.write("            </tr>\n");
              out.write("            <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
              out.write("            <tr>\n");
              out.write("                <td>Harga Barang</td>  <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\"\n");
              out.write("                readonly=\"readonly\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Jumlah Pesan</td>  <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Subtotal</td>      <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td>\n");
              out.write("            </tr>\n");
              out.write("    </table>\n");
              out.write("    <h2>Data Customer</h2>\n");
              out.write("    Customer       <select name=\"customer\">\n");
              out.write("        <option value=\"-1\">Pilih Customer</option>\n");
              out.write("        ");
 
            rs = kon.stmt.executeQuery("SELECT * from customer ");
            while (rs.next()) {
                customer.setIdcustomer(rs.getString("id_customer"));
                customer.setNamacustomer(rs.getString("nama_customer"));
        
              out.write("\n");
              out.write("        <option value=\"");
              out.print(customer.getIdcustomer());
              out.write('"');
              out.write('>');
              out.print(customer.getNamacustomer());
              out.write("</option>\n");
              out.write("        ");
  } 
              out.write("\n");
              out.write("    </select><br><br>\n");
              out.write("            \n");
              out.write("    <table width=\"535\" border=\"1\" align=\"center\">\n");
              out.write("        <tr align=\"center\">\n");
              out.write("            <td colspan=\"5\"><h3 align=\"center\">Data Barang Untuk Dipesan</h3></td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <th>Kode Barang</th>\n");
              out.write("            <th>Quantity</th>\n");
              out.write("            <th>Subtotal</th>\n");
              out.write("            <th>AKSI</th>\n");
              out.write("        </tr>\n");
              out.write("        ");
 
            rs = kon.stmt.executeQuery("SELECT * from tabel_sementara");
            while (rs.next()) {
                out.println("<tr class=isi>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=PemesananServlet?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                        + "</tr>");
            }
        
              out.write("\n");
              out.write("    </table>\n");
              out.write("    ");
              if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
                return;
              out.write("\n");
              out.write("    ");
kon.close();
              out.write("\n");
              out.write("    <tr><td><input type=\"submit\" value=\"PROSES\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>\n");
              out.write("</table>\n");
              out.write("</form>\n");
              out.write("</body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_5.setPageContext(_jspx_page_context);
          _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='jual'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
          if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write('\n');
              out.write('\n');
              out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopemesanan = null;
        nopemesanan = kon.stmt.executeQuery("select max(right(no_pemesanan,6)) as no FROM pemesanan");
        while (nopemesanan.next()) {
            if (nopemesanan.first() == false) {
                out.println("<input type='hidden' name='no_pemesanan' value='PS000001' id='nopes'/>");
            } else {
                nopemesanan.last();
                int autonops = nopemesanan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' name='no_pemesanan' id='nopes' value='" + nomerps + "'/>");
            }
        }
    } catch (Exception e) {
        out.println(e);
    }

              out.write('\n');
              out.write('\n');
              out.write('\n');
 java.util.Date waktu = new java.util.Date();
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

              out.write("\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <title>Transaksi Penjualan</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <h1 align=\"center\">Transaksi Penjualan Barang</h1></br>\n");
              out.write("        <table border=\"0\">\n");
              out.write("            <form action=\"PenjualanServlet\" method=\"post\">\n");
              out.write("                <h2>Data Penjualan</h2>\n");
              out.write("                <tr>\n");
              out.write("                    <td>No Penjualan</td>\n");
              out.write("                    <td>: <input type=\"text\" name=\"no\" value=\"");
              out.print(no);
              out.write("\" readonly/> </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>No Faktur</td>\n");
              out.write("                    <td>: <input type=\"text\" name=\"nof\" value=\"");
              out.print(nof);
              out.write("\" readonly/> </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Tanggal Jual</td>\n");
              out.write("                    <td>: <input type=\"text\" name=\"tgl\" value =");
              out.print( tgl);
              out.write(" ></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Nomor Pesan</td>\n");
              out.write("                    <td>: <select name=\"nopes\" onchange=\"showPesan(this.value);\">\n");
              out.write("                    <option value=\"-1\">Pilih Nomor Pesan</option>\n");
              out.write("                    ");

                    qrypesan = kon.stmt.executeQuery("SELECT no_pemesanan FROM pemesanan where not exists"
                    + "(select * from penjualan where pemesanan.no_pemesanan=penjualan.no_pemesanan)");
                    while (qrypesan.next()) {
                    pemesanan.setNopemesanan(qrypesan.getString("no_pemesanan"));
                    
              out.write("\n");
              out.write("                    <option value=\"");
              out.print(pemesanan.getNopemesanan());
              out.write('"');
              out.write('>');
              out.print(pemesanan.getNopemesanan());
              out.write("</option>\n");
              out.write("                    ");
  }
              out.write("\n");
              out.write("                    </select>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <input type=\"hidden\" class=\"form-control\" name=\"nopes\" id=\"pesan\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\">\n");
              out.write("                <tr>\n");
              out.write("                    <td><input type=\"submit\" name=\"aksi\" value=\"Tambah\"/></td></br>\n");
              out.write("                </tr>\n");
              out.write("        </table>\n");
              out.write("        ");

            sql = "select * from tabel_sementara";
            rs = kon.stmt.executeQuery(sql);
        
              out.write("\n");
              out.write("        <br/><br/>\n");
              out.write("        <table width=\"535\" border=\"1\" align=\"center\">\n");
              out.write("        <tr align=\"center\">\n");
              out.write("            <td colspan=\"5\"><h3 align=\"center\">Data Barang Untuk Dijual</h3></td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <th>Nomor</th>\n");
              out.write("            <th>Kode Barang</th>\n");
              out.write("            <th>Quantity</th>\n");
              out.write("            <th>Subtotal</th>\n");
              out.write("            <th>AKSI</th>\n");
              out.write("        </tr>\n");
              out.write("            ");
 if (!rs.next()) { 
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td colspan=\"5\">Data masih kosong</td>\n");
              out.write("            </tr>\n");
              out.write("            ");
 } 
              out.write("\n");
              out.write("            ");
 rs.beforeFirst(); 
              out.write("\n");
              out.write("            ");
 while (rs.next()) {
              out.write("\n");
              out.write("            <tr class=\"isi\">\n");
              out.write("                <td>");
              out.print( rs.getString(1));
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2));
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3));
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4));
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"PenjualanServlet?aksi=Delete&kodebarang=");
              out.print( rs.getString(2));
              out.write("\">\n");
              out.write("                        HAPUS\n");
              out.write("                    </a>\n");
              out.write("                </td>\n");
              out.write("            </tr>\n");
              out.write("            ");
 }
              out.write("\n");
              out.write("        </table>\n");
              out.write("        <table>\n");
              out.write("            ");
              if (_jspx_meth_sql_query_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
                return;
              out.write("\n");
              out.write("            ");
              if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
                return;
              out.write("\n");
              out.write("            <tr><td><input type=\"submit\" value=\"Simpan\" name=\"aksi\"></td></tr>\n");
              out.write("            </table>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
          out.write("\n");
          out.write("                        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_6.setPageContext(_jspx_page_context);
          _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='retur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
          if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
 java.util.Date waktu = new java.util.Date();
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

              out.write("\n");
              out.write("<html>\n");
              out.write("<head>\n");
              out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("    <title>Transaksi Retur</title>\n");
              out.write("</head>\n");
              out.write("<body>\n");
              out.write("<h1 align=\"center\">Transaksi Retur</h1><br>\n");
              out.write("<table border=\"0\">\n");
              out.write("<form action=\"ReturServlet\" method=\"post\">\n");
              out.write("<pre>\n");
              out.write("<tr>\n");
              out.write("<td>No Retur</td> <td> : ");

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
            
              out.write("\n");
              out.write("</td>\n");
              out.write("</tr>\n");
              out.write("</pre>\n");
              out.write("            <tr>\n");
              out.write("                <td>Tanggal Retur</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
              out.print( tgl);
              out.write(" readonly=\"readonly\"></td>\n");
              out.write("            </tr> \n");
              out.write("            <tr>\n");
              out.write("                <td>Customer</td>       <td>: <select name=\"customer\"> \n");
              out.write("                        <option value=\"-1\">Pilih Customer</option>\n");
              out.write("                        ");
 
                            rs = kon.stmt.executeQuery("SELECT * from customer ");
                            while (rs.next()) {
                                customer.setIdcustomer(rs.getString("id_customer"));
                                customer.setNamacustomer(rs.getString("nama_customer"));
                        
              out.write("\n");
              out.write("                        <option value=\"");
              out.print(customer.getIdcustomer());
              out.write('"');
              out.write('>');
              out.print(customer.getNamacustomer());
              out.write("</option>\n");
              out.write("                        ");
  } 
              out.write("\n");
              out.write("                     </select><br><br>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Barang</td>         <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\n");
              out.write("                        <option value=\"-1\">Select</option>\n");
              out.write("                        ");

                            rs =  kon.stmt.executeQuery("SELECT * from barang ");
                            while (rs.next()) {
                                barang.setKodebarang(rs.getString("kode_barang"));
                                barang.setNamabarang(rs.getString("nama_barang"));
                        
              out.write("\n");
              out.write("                        <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write("\n");
              out.write("                            || ");
              out.print(barang.getNamabarang());
              out.write("</option>\n");
              out.write("                        ");
 } 
              out.write("\n");
              out.write("                    </select></td> \n");
              out.write("            </tr>\n");
              out.write("            <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
              out.write("            <tr>\n");
              out.write("                <td>Harga Barang</td>  <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\"\n");
              out.write("                readonly=\"readonly\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Jumlah Retur</td>  <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumPesan();\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td>Subtotal</td>      <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
              out.write("            </tr>\n");
              out.write("            <tr>\n");
              out.write("                <td><input type=\"submit\" value=\"Tambah\" name=\"aksi1\"></td>\n");
              out.write("            </tr>\n");
              out.write("</table><br>\n");
              out.write("    \n");
              out.write("    <table width=\"535\" border=\"1\" align=\"center\">\n");
              out.write("        <tr align=\"center\">\n");
              out.write("            <td colspan=\"5\"><h3 align=\"center\">Data Barang Untuk Diretur</h3></td>\n");
              out.write("        </tr>\n");
              out.write("        <tr>\n");
              out.write("            <th>No Retur</th>\n");
              out.write("            <th>Kode Barang</th>\n");
              out.write("            <th>Quantity</th>\n");
              out.write("            <th>Subtotal</th>\n");
              out.write("            <th>AKSI</th>\n");
              out.write("        </tr>\n");
              out.write("        ");
 
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
        
              out.write("\n");
              out.write("    </table>\n");
              out.write("    <table>\n");
              out.write("        ");
              if (_jspx_meth_sql_query_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
                return;
              out.write("\n");
              out.write("        ");
              if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
                return;
              out.write("\n");
              out.write("    <tr><td><input type=\"submit\" value=\"Simpan\" name=\"aksi3\"></td></tr>\n");
              out.write("</table>\n");
              out.write("</body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("              \n");
      out.write("                            </td>                    \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dataSource");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/penjualan");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='home'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<div class=\"box2\" align=\"center\">\n");
        out.write("    <div class=\"text_area\">\n");
        out.write("        <img src=\"images/home.jpeg\"  width=\"400\" height=\"230\" class=\"pic\" /><br>\n");
        out.write("        <h2>SELAMAT DATANG</h2><br>\n");
        out.write("        Selamat bekerja ! Gunakan sistem ini untuk penjualan dan pemasaran produk.<br>\n");
        out.write("        Silahkan gunakan layanan yang ada pada area ini dengan meng-klik tombol menu pada bagian samping kanan halaman.<br>\n");
        out.write("        Jangan lupa untuk selalu Logout setelah Anda menggunakan fasiltas ini.\n");
        out.write("    </div>\n");
        out.write("</div>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilbrg'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1 align=\"center\">Data Master Barang</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"BarangServlet\" method=\"post\" onsubmit=\"return validasi_inputBarang(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Kode Barang</td> <td> : <input type=\"text\" name=\"kode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.kode_barang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama Barang</td> <td> : <input type=\"text\" name=\"nama\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nama_barang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Harga Barang</td> <td> : <input type=\"text\" name=\"harga\" onkeypress=\"return hanyaAngka(event)\" \n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.harga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Stok Barang</td> <td> : <input type=\"text\" name=\"stok\" onkeypress=\"return hanyaAngka(event)\" \n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.stok}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td> </td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("</td></tr></table><br>\n");
        out.write("<form action=\"\" method=\"post\">\n");
        out.write("    Cari Data Barang : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("    <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("</form>\n");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("    <tr class=\"head\">\n");
        out.write("        <td>Kode Barang</td><td>Nama Barang</td><td>Harga Barang</td><td>Stok Barang</td><td>Action</td>\n");
        out.write("    </tr>\n");
        out.write("    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</table>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_sql_query_0.setVar("querybarang");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT * from barang where kode_barang like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or\n");
          out.write("    nama_barang like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_0.setVar("rowbrg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querybarang.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr class=\"isi\">\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'><a href='BarangServlet?aksi=HAPUS&kode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\n");
          out.write("                <a href='beranda.jsp?halaman=tampilbrg&aksi=GANTI&kode_barang=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                   &nama_barang=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&harga=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&stok=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("            </td>                                                          \n");
          out.write("        </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilcus'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1 align=\"center\">Data Master Customer</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"cusServlet\" method=\"post\" onsubmit=\"return validasi_inputCustomer(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>ID Customer</td> <td> : <input type=\"text\" name=\"id_customer\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id_customer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama Customer</td> <td> : <input type=\"text\" name=\"nama_customer\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nama_customer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Alamat</td> <td> : <input type=\"text\" name=\"alamat\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.alamat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Telepon</td> <td> : <input type=\"text\" name=\"telpon\" onkeypress=\"return hanyaAngka(event)\" \n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.telpon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td> </td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("</table><br>\n");
        out.write("<form action=\"\" method=\"post\">\n");
        out.write("    Cari Data Customer : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("    <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("</form>\n");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("    <tr class=\"head\">\n");
        out.write("        <td>ID Customer</td><td>Nama Customer</td><td>Alamat</td><td>Telepon</td><td>Action</td>\n");
        out.write("    </tr>\n");
        out.write("    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</table>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_sql_query_1.setVar("querycustomer");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT * from customer where id_customer like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or\n");
          out.write("    nama_customer like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setVar("rowcus");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querycustomer.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr class=\"isi\">\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'><a href='cusServlet?aksi=HAPUS&id_customer=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\n");
          out.write("                <a href='beranda.jsp?halaman=tampilcus&aksi=GANTI&id_customer=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                &nama_customer=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&alamat=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&telpon=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowcus[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("            </td>                                                          \n");
          out.write("        </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampiluser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("\n");
        out.write("<h1 align=\"center\">Data Master User</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"userServlet\" method=\"post\" onsubmit=\"return validasi_inputUser(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>ID User</td> <td> : <input type=\"text\" name=\"id_user\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama User</td> <td> : <input type=\"text\" name=\"nama_user\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nama_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Hak Akses</td> <td> : <input type=\"text\" name=\"hak_akses\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hak_akses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Password</td> <td> : <input type=\"text\" name=\"password\" onkeypress=\"return hanyaAngka(event)\"\n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td> </td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("</td></tr></table><br>\n");
        out.write("<form action=\"\" method=\"post\">\n");
        out.write("    Cari Data User : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("    <input type=\"submit\" value=\"Cari\" class=\"button\"/> <br>\n");
        out.write("</form>\n");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("    <tr class=\"head\">\n");
        out.write("        <td>ID</td><td>ID User</td><td>Nama User</td><td>Hak Akses</td><td>Password</td><td>Action</td>\n");
        out.write("    </tr>\n");
        out.write("    ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</table>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_sql_query_2.setVar("queryuser");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT * from user where id_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or\n");
          out.write("    nama_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_2.setVar("rowuser");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${queryuser.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <tr class=\"isi\">\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[4]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td valign='top'><a href='userServlet?aksi=HAPUS&id_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\n");
          out.write("                <a href='beranda.jsp?halaman=tampiluser&aksi=GANTI&id_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                &nama_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&hak_akses=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&password=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[4]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("            </td>                                                          \n");
          out.write("        </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_sql_query_3.setVar("ttl");
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    SELECT SUM(quantity) AS ttl_D,\n");
          out.write("    SUM(subtotal) AS ttl_K FROM tabel_sementara\n");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_forEach_3.setVar("ttlDK");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\n");
          out.write("        <table border=\"0\">\n");
          out.write("            <tr><td>Total Jumlah Barang Dipesan</td> <td>:\n");
          out.write("                    <input type=\"text\" readonly=\"readonly\" name=\"totjum\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("            <tr><td>Total Bayar</td>                 <td>:\n");
          out.write("                    <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_4 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_sql_query_4.setVar("ttl");
    _jspx_th_sql_query_4.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_4 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_4 = _jspx_th_sql_query_4.doStartTag();
      if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_4[0]++;
          _jspx_th_sql_query_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_4.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                SELECT SUM(quantity) AS ttl_D,\n");
          out.write("                SUM(subtotal) AS ttl_K FROM tabel_sementara\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_sql_query_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_4[0]--;
      }
      if (_jspx_th_sql_query_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_4.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_forEach_4.setVar("ttlDK");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\n");
          out.write("                <table border=\"0\">\n");
          out.write("                    <tr>\n");
          out.write("                        <td>Total Jumlah Barang Dijual</td>\n");
          out.write("                        <td>: <input type=\"text\" readonly=\"readonly\" name=\"total\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                    </tr>\n");
          out.write("                    <tr>\n");
          out.write("                        <td>Total Bayar</td>\n");
          out.write("                        <td>: <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                    </tr>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_5 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_sql_query_5.setVar("ttl");
    _jspx_th_sql_query_5.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_5 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_5 = _jspx_th_sql_query_5.doStartTag();
      if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_5[0]++;
          _jspx_th_sql_query_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_5.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT SUM(quantity) AS ttl_D,\n");
          out.write("            SUM(subtotal) AS ttl_K FROM tabel_sementara\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_5[0]--;
      }
      if (_jspx_th_sql_query_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_5.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_forEach_5.setVar("ttlDK");
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\n");
          out.write("            <table border=\"0\">\n");
          out.write("                <tr>\n");
          out.write("                    <td>Total Jumlah Barang Diretur</td> \n");
          out.write("                    <td>: <input type=\"text\" readonly=\"readonly\" name=\"totjumlah\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                </tr>\n");
          out.write("                <tr>\n");
          out.write("                    <td>Total Retur Jual</td>\n");
          out.write("                    <td>: <input type=\"text\" readonly=\"readonly\" name=\"totretur\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\n");
          out.write("                </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='cetaklapbarang'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Cetak Laporan</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h2>Cetak Laporan Barang Berdasarkan Stok Tersedia</h2><br>\n");
        out.write("        <form action=\"TampilLapBarang.jsp\" method=\"get\">\n");
        out.write("            Stok <= <input type=\"number\" name=\"jumlah\" value=\"0\">\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='cetaklapcustomer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Cetak Laporan</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h2>Cetak Laporan Customer</h2><br>\n");
        out.write("        <form action=\"TampilLapCustomer.jsp\" method=\"get\">\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='cetaklappemesanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Cetak Laporan</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h2>Tampilkan Laporan Pemesanan Berdasarkan Bulan dan Tahun</h2><br>\n");
        out.write("        <form action=\"TampilLapPemesanan.jsp\">\n");
        out.write("            Masukkan Bulan :\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\n");
        out.write("                <option value=\"1\">Januari</option>\n");
        out.write("                <option value=\"2\">Februari</option>\n");
        out.write("                <option value=\"3\">Maret</option>\n");
        out.write("                <option value=\"4\">April</option>\n");
        out.write("                <option value=\"5\">Mei</option>\n");
        out.write("                <option value=\"6\">Juni</option>\n");
        out.write("                <option value=\"7\">Juli</option>\n");
        out.write("                <option value=\"8\">Agustus</option>\n");
        out.write("                <option value=\"9\">September</option>\n");
        out.write("                <option value=\"10\">Oktober</option>\n");
        out.write("                <option value=\"11\">November</option>\n");
        out.write("                <option value=\"12\">Desember</option>\n");
        out.write("            </select><br>\n");
        out.write("            Masukkan Tahun :\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\n");
        out.write("                <option value=\"2019\">2019</option>\n");
        out.write("                <option value=\"2020\">2020</option>\n");
        out.write("                <option value=\"2021\">2021</option>\n");
        out.write("                <option value=\"2022\">2022</option>\n");
        out.write("                <option value=\"2023\">2023</option>\n");
        out.write("                <option value=\"2024\">2024</option>\n");
        out.write("                <option value=\"2025\">2025</option>\n");
        out.write("                <option value=\"2026\">2026</option>\n");
        out.write("                <option value=\"2027\">2027</option>\n");
        out.write("                <option value=\"2028\">2028</option>\n");
        out.write("                <option value=\"2029\">2029</option>\n");
        out.write("            </select>\n");
        out.write("            <br><br>\n");
        out.write("            <input type=\"submit\" value=\"Cetak Laporan\">\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='cetaklappenjualan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Cetak Laporan</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h2>Tampilkan Laporan Penjualan Berdasarkan Bulan dan Tahun</h2><br>\n");
        out.write("        <form action=\"TampilLapPenjualan.jsp\">\n");
        out.write("            Masukkan Bulan :\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\n");
        out.write("                <option value=\"1\">Januari</option>\n");
        out.write("                <option value=\"2\">Februari</option>\n");
        out.write("                <option value=\"3\">Maret</option>\n");
        out.write("                <option value=\"4\">April</option>\n");
        out.write("                <option value=\"5\">Mei</option>\n");
        out.write("                <option value=\"6\">Juni</option>\n");
        out.write("                <option value=\"7\">Juli</option>\n");
        out.write("                <option value=\"8\">Agustus</option>\n");
        out.write("                <option value=\"9\">September</option>\n");
        out.write("                <option value=\"10\">Oktober</option>\n");
        out.write("                <option value=\"11\">November</option>\n");
        out.write("                <option value=\"12\">Desember</option>\n");
        out.write("            </select><br>\n");
        out.write("            Masukkan Tahun :\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\n");
        out.write("                <option value=\"2019\">2019</option>\n");
        out.write("                <option value=\"2020\">2020</option>\n");
        out.write("                <option value=\"2021\">2021</option>\n");
        out.write("                <option value=\"2022\">2022</option>\n");
        out.write("                <option value=\"2023\">2023</option>\n");
        out.write("                <option value=\"2024\">2024</option>\n");
        out.write("                <option value=\"2025\">2025</option>\n");
        out.write("                <option value=\"2026\">2026</option>\n");
        out.write("                <option value=\"2027\">2027</option>\n");
        out.write("                <option value=\"2028\">2028</option>\n");
        out.write("                <option value=\"2029\">2029</option>\n");
        out.write("            </select>\n");
        out.write("            <br><br>\n");
        out.write("            <input type=\"submit\" value=\"Cetak Laporan\">\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='cetaklapretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Cetak Laporan</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h2>Tampilkan Laporan Retur Penjualan Berdasarkan Bulan dan Tahun</h2><br>\n");
        out.write("        <form action=\"TampilLapRetur.jsp\">\n");
        out.write("            Masukkan Bulan :\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\n");
        out.write("                <option value=\"1\">Januari</option>\n");
        out.write("                <option value=\"2\">Februari</option>\n");
        out.write("                <option value=\"3\">Maret</option>\n");
        out.write("                <option value=\"4\">April</option>\n");
        out.write("                <option value=\"5\">Mei</option>\n");
        out.write("                <option value=\"6\">Juni</option>\n");
        out.write("                <option value=\"7\">Juli</option>\n");
        out.write("                <option value=\"8\">Agustus</option>\n");
        out.write("                <option value=\"9\">September</option>\n");
        out.write("                <option value=\"10\">Oktober</option>\n");
        out.write("                <option value=\"11\">November</option>\n");
        out.write("                <option value=\"12\">Desember</option>\n");
        out.write("            </select><br>\n");
        out.write("            Masukkan Tahun :\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\n");
        out.write("                <option value=\"2019\">2019</option>\n");
        out.write("                <option value=\"2020\">2020</option>\n");
        out.write("                <option value=\"2021\">2021</option>\n");
        out.write("                <option value=\"2022\">2022</option>\n");
        out.write("                <option value=\"2023\">2023</option>\n");
        out.write("                <option value=\"2024\">2024</option>\n");
        out.write("                <option value=\"2025\">2025</option>\n");
        out.write("                <option value=\"2026\">2026</option>\n");
        out.write("                <option value=\"2027\">2027</option>\n");
        out.write("                <option value=\"2028\">2028</option>\n");
        out.write("                <option value=\"2029\">2029</option>\n");
        out.write("            </select>\n");
        out.write("            <br><br>\n");
        out.write("            <input type=\"submit\" value=\"Cetak Laporan\">\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        out.write("<div class=\"box2\" align=\"center\">\n");
        out.write("    <div class=\"text_area\">\n");
        out.write("        <img src=\"images/home.jpeg\"  width=\"400\" height=\"230\" class=\"pic\" /><br>\n");
        out.write("        <h2>SELAMAT DATANG</h2><br>\n");
        out.write("        Selamat bekerja ! Gunakan sistem ini untuk penjualan dan pemasaran produk.<br>\n");
        out.write("        Silahkan gunakan layanan yang ada pada area ini dengan meng-klik tombol menu pada bagian samping kanan halaman.<br>\n");
        out.write("        Jangan lupa untuk selalu Logout setelah Anda menggunakan fasiltas ini.\n");
        out.write("    </div>\n");
        out.write("</div>");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
