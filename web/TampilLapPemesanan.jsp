<%@page import="control.koneksi"%>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.view.JasperViewer.*"%>
<%@page import="javax.servlet.ServletResponse" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laporan Pemesanan</title>
    </head>
    <body>
        <%
            koneksi kon = new koneksi();
            int bulan = Integer.parseInt(request.getParameter("bulan"));
            int tahun = Integer.parseInt(request.getParameter("tahun"));
            
            File reportFile = new File(application.getRealPath("laporan/Laporan_Pemesanan.jasper"));
            Map  parameter = new HashMap();
            parameter.put("bln", bulan);
            parameter.put("thn", tahun);
            
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), parameter, kon.stmt.getConnection());
            
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
        %>
    </body>
</html>

