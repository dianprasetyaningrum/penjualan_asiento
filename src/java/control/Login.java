package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        
        if (proses.equals("login")){
            String user = request.getParameter("username");
            String password = request.getParameter("password");
            String hak_akses = request.getParameter("hak_akses");
            String id = request.getParameter("id");
            if (password == null || password.equals("")) {
                response.sendRedirect("index.jsp");
            } else {
                user pm = new user();
                List<user> datalogin = new ArrayList<user>();
                
                datalogin = pm.LoginUser(user, password);
                if (datalogin.isEmpty()) {
                    response.sendRedirect("index.jsp");
                } else {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("username", datalogin.get(0).getIduser());
                    session.setAttribute("id", datalogin.get(0).getId());
                    session.setAttribute("hak_akses", datalogin.get(0).getHakakses());
                    
                    if (datalogin.get(0).getHakakses().equals("Bagian Penjualan")) {
                        response.sendRedirect("beranda.jsp"); // validasi login berdasarkan hak aksesnya
                    }
                    else if (datalogin.get(0).getHakakses().equals("Pimpinan")) {
                        response.sendRedirect("CetakLaporanPenjualan.jsp");
                    }
                }
            }
        }
    }
}
