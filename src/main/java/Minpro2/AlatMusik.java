package Minpro2;

public class AlatMusik {

    private String idAlat;
    private String namaAlat;
    private String jenisAlat;
    private double hargaSewa;
    private String status;

    public AlatMusik(String idAlat, String namaAlat, String jenisAlat,
                     double hargaSewa, String status) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.jenisAlat = jenisAlat;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    public String getIdAlat() {
        return idAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public String getJenisAlat() {
        return jenisAlat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getStatus() {
        return status;
    }

    public void setIdAlat(String idAlat) {
        this.idAlat = idAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public void setJenisAlat(String jenisAlat) {
        this.jenisAlat = jenisAlat;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tampilkanData() {
        System.out.println("ID Alat       : " + idAlat);
        System.out.println("Nama Alat     : " + namaAlat);
        System.out.println("Jenis Alat    : " + jenisAlat);
        System.out.println("Harga Sewa    : Rp" + hargaSewa);
        System.out.println("Status        : " + status);
    }
}