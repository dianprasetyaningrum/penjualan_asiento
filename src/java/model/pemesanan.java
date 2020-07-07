package model;

public class pemesanan {
    
    private String nopemesanan,tglpemesanan,idcustomer,kodebarang,total,qtypesan,subtotal;
    
    public pemesanan() {
    }
    
    public pemesanan(String nopemesanan, String tglpemesanan, String idcustomer,
            String kodebarang, String total,
            String qtypesan, String subtotal) {
        this.nopemesanan = nopemesanan;
        this.tglpemesanan = tglpemesanan;
        this.idcustomer = idcustomer;
        this.kodebarang = kodebarang;
        this.total = total;
        this.qtypesan = qtypesan;
        this.subtotal = subtotal;
    }

    public String getNopemesanan() {
        return nopemesanan;
    }

    public void setNopemesanan(String nopemesanan) {
        this.nopemesanan = nopemesanan;
    }

    public String getTglpemesanan() {
        return tglpemesanan;
    }

    public void setTglpemesanan(String tglpemesanan) {
        this.tglpemesanan = tglpemesanan;
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getQtypesan() {
        return qtypesan;
    }

    public void setQtypesan(String qtypesan) {
        this.qtypesan = qtypesan;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
    
    public String selectAll(){
        String sql = "select * from pemesanan";
        return sql;
    } 
    
    public String select(){
        String sql = "select * from pemesanan where "
                + "no_pemesanan='"+nopemesanan+"'";
        return sql;
    } 
    
    public String toDelete() {
        return "DELETE FROM tabel_sementara "
                + " WHERE kode='" + kodebarang + "'";
    } 
    
    public String toInsert() {
        return "INSERT INTO tabel_sementara VALUES('"
                + nopemesanan + "','"
                + kodebarang + "','"
                + qtypesan + "','"
                + subtotal + "')";
    }   
    
}