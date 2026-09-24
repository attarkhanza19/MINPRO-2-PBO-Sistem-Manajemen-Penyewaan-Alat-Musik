package Minpro2;

public class AlatMusikElektrik extends AlatMusik {

    private int daya;

    public AlatMusikElektrik(String idAlat, String namaAlat, String jenisAlat,
                             double hargaSewa, String status, int daya) {

        super(idAlat, namaAlat, jenisAlat, hargaSewa, status);
        this.daya = daya;
    }

    public int getDaya() {
        return daya;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Daya          : " + daya + " Watt");
    }
}