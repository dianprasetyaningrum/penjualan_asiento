package model;

public class retur {
    
    private String noretur,tglretur,idcustomer,kodebarang,totalretur,qtyretur,subretur;
    
    public retur() {
    }
    
    public retur(String noretur, String tglretur, String idcustomer,
            String kodebarang,String totalretur, String qtyretur, String subretur) {
        this.noretur = noretur;
        this.tglretur = tglretur;
        this.idcustomer = idcustomer;
        this.kodebarang = kodebarang;
        this.totalretur = totalretur;
        this.qtyretur = qtyretur;
        this.subretur = subretur;
    }

    public String getNoretur() {
        return noretur;
    }

    public void setNoretur(String noretur) {
        this.noretur = noretur;
    }

    public String getTglretur() {
        return tglretur;
    }

    public void setTglretur(String tglretur) {
        this.tglretur = tglretur;
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

    public String getTotalretur() {
        return totalretur;
    }

    public void setTotalretur(String totalretur) {
        this.totalretur = totalretur;
    }

    public String getQtyretur() {
        return qtyretur;
    }

    public void setQtyretur(String qtyretur) {
        this.qtyretur = qtyretur;
    }

    public String getSubretur() {
        return subretur;
    }

    public void setSubretur(String subretur) {
        this.subretur = subretur;
    }

    public String selectAll(){
        String sql = "select * from retur_jual";
        return sql;
    } 
    
    public String select(){
        String sql = "select * from retur_jual where "
                + "no_retur='"+noretur+"'";
        return sql;
    } 
    
    public String toDelete() {
        return "DELETE FROM tabel_sementara "
                + " WHERE kode='" + kodebarang + "'";
    } 
    
    public String toInsert() {
        return "INSERT INTO tabel_sementara VALUES('"
                + noretur + "','"
                + kodebarang + "','"
                + qtyretur + "','"
                + subretur + "')";
    }   
}
