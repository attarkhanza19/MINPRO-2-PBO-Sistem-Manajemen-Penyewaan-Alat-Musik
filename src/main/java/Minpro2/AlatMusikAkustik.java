package Minpro2;

public class AlatMusikAkustik extends AlatMusik {

    private String bahan;

    public AlatMusikAkustik(String idAlat, String namaAlat, String jenisAlat,
                            double hargaSewa, String status, String bahan) {

        super(idAlat, namaAlat, jenisAlat, hargaSewa, status);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Bahan         : " + bahan);
    }
}