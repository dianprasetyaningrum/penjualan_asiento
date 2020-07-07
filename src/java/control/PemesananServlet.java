package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pemesanan;
import java.sql.*;


public class PemesananServlet extends pesan {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            pemesanan pemesanan = new pemesanan();
            PreparedStatement pstmt = null;
            PreparedStatement pstmt1 = null;
            PreparedStatement pstmt2 = null;
            koneksi kon = new koneksi();
            int result = 0;
            int result1 = 0;
            int result2 = 0;
            String res;
            String aksi = request.getParameter("aksi");
            String nopemesanan=request.getParameter("no_pemesanan");
            String tglpemesanan=request.getParameter("tanggal");
            String idcustomer=request.getParameter("customer");
            String kodebarang=request.getParameter("kode");
            String total=request.getParameter("tobay");
            String qtypesan=request.getParameter("jml");
            String subtotal=request.getParameter("sub");
            String aksi1 = request.getParameter("aksi1");
            String aksi2 = request.getParameter("aksi2");
            String aksi3 = request.getParameter("aksi3");
            pemesanan var = new pemesanan(nopemesanan,tglpemesanan,idcustomer,kodebarang,total,qtypesan,subtotal);
            String URL ="beranda.jsp?halaman=pesan&aksi=SIMPAN";
            if(aksi1 != null) {
                out.print(super.proses2(var.toInsert(), URL, "TAMBAH"));
            } else if (aksi2 != null){
                out.print(super.proses2(var.toDelete(), URL, "HAPUS"));
            } else if (aksi3 != null) {
                pemesanan.setNopemesanan(request.getParameter("no_pemesanan"));
                pemesanan.setTglpemesanan(request.getParameter("tanggal"));
                pemesanan.setIdcustomer(request.getParameter("customer"));
                pemesanan.setTotal(request.getParameter("tobay"));
    pstmt=kon.conn.prepareStatement("INSERT detail_pemesanan SELECT '"+pemesanan.getNopemesanan()+"',"
            + "kode,quantity,subtotal FROM tabel_sementara"); 
    result=pstmt.executeUpdate();
    pstmt1 = kon.conn.prepareStatement("INSERT INTO pemesanan values('" + pemesanan.getNopemesanan() + "','"
            + pemesanan.getTglpemesanan() + "','"
            + pemesanan.getTotal() + "','"
            + pemesanan.getIdcustomer() + "')");
    result1 = pstmt1.executeUpdate();
    pstmt2=kon.conn.prepareStatement("TRUNCATE TABLE tabel_sementara");
    result2=pstmt2.executeUpdate();
        if (result +result1 + result2 > 0) {
            out.println("<script> "
                    + "alert('Data telah disimpan');"
                    + "document.location='beranda.jsp?hal=pesan';"
                    + " </script>");
        }
            }
        
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BarangServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BarangServlet.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                out.close();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
