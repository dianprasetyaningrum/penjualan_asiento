package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import control.koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;

public class user {
    
    private String id;
    private String iduser;
    private String namauser;
    private String hakakses;
    private String password;
    koneksi db = null;
    
    public user(){
        try {
            db = new koneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public user(String iduser, String namauser, String hakakses, String password) {
        this.iduser = iduser;
        this.namauser = namauser;
        this.hakakses = hakakses;
        this.password = password;
    }

        public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getNamauser() {
        return namauser;
    }

    public void setNamauser(String namauser) {
        this.namauser = namauser;
    }

    public String getHakakses() {
        return hakakses;
    }

    public void setHakakses(String hakakses) {
        this.hakakses = hakakses;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String selectAll(){
        String sql = "select * from user";
        return sql;
    } 
    
    public String select(){
        String sql = "select * from user where "
                + "id_user='"+iduser+"'";
        return sql;
    } 
    
    public List LoginUser(String user, String password) {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM user where id_user='" + user + "'"
                    + "and password='" + password + "'";
            rs = db.ambilData(sql);
            
            while (rs.next()) {
                user am = new user();
                am.setId(rs.getString("id"));
                am.setIduser(rs.getString("id_user"));
                am.setPassword(rs.getString("password"));
                am.setHakakses(rs.getString("hak_akses"));
                data.add(am);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahan cari login user, pasa :\n" + a);
        }
        return data;
    }

    public String toUpdate() {
        return "UPDATE user SET " 
                + "nama_user='" + namauser
                + "', hak_akses='" + hakakses
                + "', password='" + password
                + "' WHERE id_user='" + iduser + "'";
    }
    
    public String toDelete() {
        return "DELETE FROM user "
                + " WHERE id_user='" + iduser + "'";
    }
    
    public String toInsert() {
        return "INSERT INTO user VALUES('"
                + iduser + "','"
                + namauser + "','"
                + hakakses + "','"
                + password + "')";
    }
    
}