package control;

import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "pesan", urlPatterns = {"/pesan"})
public class pesan extends HttpServlet {

    public String proses(String SQL, String URL, String status)
            throws ClassNotFoundException,SQLException {
        koneksi kon = new koneksi();
        kon.stmt.executeUpdate(SQL);
        kon.close();
        String result = "<script>"
                + "alert('Data berhasil di " + status + "');"
                + "window.location='" + URL + "';"
                + "</script>";
        return result;
    }
    
    public String proses2(String SQL, String URL, String status)
            throws ClassNotFoundException, SQLException {
        koneksi kon = new koneksi();
        kon.stmt.executeUpdate(SQL);
        kon.close();
        String result = "<script>"
                + "alert('Data Barang Berhasil Di " + status + "');"
                + "window.location='" + URL + "';"
                + "</script>";
        return result;
    }
    
    public void proses(String SQL) throws ClassNotFoundException,
            SQLException {
        koneksi kon = new koneksi();
        kon.stmt.executeUpdate(SQL);
        kon.close();
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
