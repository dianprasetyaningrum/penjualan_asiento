package model;

public class customer {
    private String idcustomer,namacustomer,alamat,telpon;
    
    public customer() {
    }
    
    public customer(String idcustomer, String namacustomer, String alamat, String telpon) {
        this.idcustomer = idcustomer;
        this.namacustomer = namacustomer;
        this.alamat = alamat;
        this.telpon = telpon;
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getNamacustomer() {
        return namacustomer;
    }

    public void setNamacustomer(String namacustomer) {
        this.namacustomer = namacustomer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String selectAll(){
        String sql = "select * from customer";
        return sql;
    } 
    
    public String select(){
        String sql = "select * from customer where "
                + "id_customer='"+idcustomer+"'";
        return sql;
    } 
    
    public String toUpdate() {
        return "UPDATE customer SET " 
                + "nama_customer='" + namacustomer
                + "', alamat='" + alamat
                + "', telpon='" + telpon
                + "' WHERE id_customer='" + idcustomer + "'";
    }
    
    public String toDelete() {
        return "DELETE FROM customer "
                + " WHERE id_customer='" + idcustomer + "'";
    }
    
    public String toInsert() {
        return "INSERT INTO customer VALUES('"
                + idcustomer + "','"
                + namacustomer + "','"
                + alamat + "','"
                + telpon + "')";
    }
}

    

