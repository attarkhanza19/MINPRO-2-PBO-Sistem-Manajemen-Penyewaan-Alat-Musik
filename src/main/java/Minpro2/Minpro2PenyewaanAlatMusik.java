package Minpro2;

import java.util.ArrayList;
import java.util.Scanner;

public class Minpro2PenyewaanAlatMusik {

    static Scanner input = new Scanner(System.in);

    static ArrayList<AlatMusik> daftarAlat = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();

    public static void main(String[] args) {

        // Data Dummy
        daftarAlat.add(
            new AlatMusikAkustik(
                "GTR-001",
                "Gitar Akustik",
                "Gitar",
                100000,
                "Ready",
                "Kayu"
            )
        );

        daftarAlat.add(
            new AlatMusikElektrik(
                "KBD-001",
                "Keyboard",
                "Keyboard",
                150000,
                "Ready",
                220
            )
        );

        daftarPelanggan.add(
            new Pelanggan(
                "PLN-001",
                "Dilan",
                "08882293918",
                "Samarinda"
            )
        );

        daftarPenyewaan.add(
            new Penyewaan(
                "SW-001",
                "PLN-001",
                "GTR-001",
                2,
                200000
            )
        );

        int pilihan;

        do {
            System.out.println("\n=================================");
            System.out.println(" SISTEM PENYEWAAN ALAT MUSIK");
            System.out.println("=================================");
            System.out.println("1. Kelola Data Alat Musik");
            System.out.println("2. Kelola Data Pelanggan");
            System.out.println("3. Kelola Data Penyewaan");
            System.out.println("4. Keluar");
            System.out.println("=================================");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    menuAlat();
                    break;

                case 2:
                    menuPelanggan();
                    break;

                case 3:
                    menuPenyewaan();
                    break;

                case 4:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Yang Anda masukkan tidak valid.");
            }

        } while (pilihan != 4);
    }
    
    static void menuAlat() {

        int pilihan;

        do {
            System.out.println("\n===== DATA ALAT MUSIK =====");
            System.out.println("1. Tambah Alat");
            System.out.println("2. Lihat Alat");
            System.out.println("3. Ubah Alat");
            System.out.println("4. Hapus Alat");
            System.out.println("5. Kembali");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahAlat();
                    break;

                case 2:
                    lihatAlat();
                    break;

                case 3:
                    ubahAlat();
                    break;

                case 4:
                    hapusAlat();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Yang Anda masukkan tidak valid.");
            }

        } while (pilihan != 5);
    }

    static void tambahAlat() {

        System.out.println("\n===== TAMBAH ALAT MUSIK =====");

        String id = inputText("ID Alat: ");

        if (cariAlat(id) != null) {
            System.out.println("ID alat sudah digunakan.");
            return;
        }

        String nama = inputNama("Nama Alat: ");
        String jenis = inputText("Jenis Alat: ");

        double harga = inputDoublePositif("Harga Sewa per Hari: ");

        System.out.println("\nJenis Alat Musik:");
        System.out.println("1. Akustik");
        System.out.println("2. Elektrik");

        int jenisAlat = inputInt("Pilih jenis: ");

        while (jenisAlat != 1 && jenisAlat != 2) {
            System.out.println("Yang Anda masukkan tidak valid.");
            jenisAlat = inputInt("Pilih jenis: ");
        }

        String status = inputStatus();

        if (jenisAlat == 1) {

            String bahan = inputText("Bahan Alat: ");

            daftarAlat.add(
                new AlatMusikAkustik(
                    id,
                    nama,
                    jenis,
                    harga,
                    status,
                    bahan
                )
            );

        } else {

            int daya = inputIntPositif("Daya Alat (Watt): ");

            daftarAlat.add(
                new AlatMusikElektrik(
                    id,
                    nama,
                    jenis,
                    harga,
                    status,
                    daya
                )
            );
        }

        System.out.println("Data alat berhasil ditambahkan.");
    }
    
    static void lihatAlat() {

        System.out.println("\n===== DAFTAR ALAT MUSIK =====");

        if (daftarAlat.isEmpty()) {
            System.out.println("Belum ada data alat.");
            return;
        }

        for (int i = 0; i < daftarAlat.size(); i++) {

            System.out.println("\nData ke-" + (i + 1));

            AlatMusik alat = daftarAlat.get(i);

            // POLYMORPHISM
            alat.tampilkanData();

            System.out.println("-----------------------------");
        }
    }


    static void ubahAlat() {

        String id = inputText(
            "\nMasukkan ID alat yang ingin diubah: "
        );

        AlatMusik alat = cariAlat(id);

        if (alat == null) {
            System.out.println("Data alat tidak ditemukan.");
            return;
        }

        String nama = inputNama("Nama Alat baru: ");
        String jenis = inputText("Jenis Alat baru: ");
        double harga = inputDoublePositif("Harga Sewa baru: ");
        String status = inputStatus();

        alat.setNamaAlat(nama);
        alat.setJenisAlat(jenis);
        alat.setHargaSewa(harga);
        alat.setStatus(status);

        if (alat instanceof AlatMusikAkustik) {

            String bahan = inputText("Bahan baru: ");

            AlatMusikAkustik akustik =
                    (AlatMusikAkustik) alat;

            akustik.setBahan(bahan);

        } else if (alat instanceof AlatMusikElektrik) {

            int daya = inputIntPositif("Daya baru (Watt): ");

            AlatMusikElektrik elektrik =
                    (AlatMusikElektrik) alat;

            elektrik.setDaya(daya);
        }

        System.out.println("Data berhasil diubah.");
    }


    static void hapusAlat() {

        String id = inputText(
            "\nMasukkan ID alat yang ingin dihapus: "
        );

        AlatMusik alat = cariAlat(id);

        if (alat == null) {
            System.out.println("Data alat tidak ditemukan.");
            return;
        }

        daftarAlat.remove(alat);

        System.out.println("Data alat berhasil dihapus.");
    }


    static void menuPelanggan() {

        int pilihan;

        do {
            System.out.println("\n===== DATA PELANGGAN =====");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Ubah Pelanggan");
            System.out.println("4. Hapus Pelanggan");
            System.out.println("5. Kembali");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahPelanggan();
                    break;

                case 2:
                    lihatPelanggan();
                    break;

                case 3:
                    ubahPelanggan();
                    break;

                case 4:
                    hapusPelanggan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Yang Anda masukkan tidak valid.");
            }

        } while (pilihan != 5);
    }

    static void tambahPelanggan() {

        System.out.println("\n===== TAMBAH PELANGGAN =====");

        String id = inputText("ID Pelanggan: ");

        if (cariPelanggan(id) != null) {
            System.out.println("ID pelanggan sudah digunakan.");
            return;
        }

        String nama = inputNama("Nama Pelanggan: ");
        String telepon = inputTelepon("No. Telepon: ");
        String alamat = inputText("Alamat: ");

        daftarPelanggan.add(
            new Pelanggan(
                id,
                nama,
                telepon,
                alamat
            )
        );

        System.out.println("Data pelanggan berhasil ditambahkan.");
    }



    static void lihatPelanggan() {

        System.out.println("\n===== DAFTAR PELANGGAN =====");

        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }

        for (int i = 0; i < daftarPelanggan.size(); i++) {

            System.out.println("\nData ke-" + (i + 1));

            daftarPelanggan.get(i).tampilkanData();

            System.out.println("-----------------------------");
        }
    }


    static void ubahPelanggan() {

        String id = inputText(
            "\nMasukkan ID pelanggan yang ingin diubah: "
        );

        Pelanggan pelanggan = cariPelanggan(id);

        if (pelanggan == null) {
            System.out.println("Data pelanggan tidak ditemukan.");
            return;
        }

        String nama = inputNama("Nama baru: ");
        String telepon = inputTelepon("No. Telepon baru: ");
        String alamat = inputText("Alamat baru: ");

        pelanggan.setNamaPelanggan(nama);
        pelanggan.setNoTelepon(telepon);
        pelanggan.setAlamat(alamat);

        System.out.println("Data berhasil diubah.");
    }


    static void hapusPelanggan() {

        String id = inputText(
            "\nMasukkan ID pelanggan yang ingin dihapus: "
        );

        Pelanggan pelanggan = cariPelanggan(id);

        if (pelanggan == null) {
            System.out.println("Data pelanggan tidak ditemukan.");
            return;
        }

        daftarPelanggan.remove(pelanggan);

        System.out.println("Data pelanggan berhasil dihapus.");
    }


    static void menuPenyewaan() {

        int pilihan;

        do {
            System.out.println("\n===== DATA PENYEWAAN =====");
            System.out.println("1. Tambah Penyewaan");
            System.out.println("2. Lihat Penyewaan");
            System.out.println("3. Ubah Penyewaan");
            System.out.println("4. Hapus Penyewaan");
            System.out.println("5. Kembali");

            pilihan = inputInt("Pilih menu: ");

            switch (pilihan) {

                case 1:
                    tambahPenyewaan();
                    break;

                case 2:
                    lihatPenyewaan();
                    break;

                case 3:
                    ubahPenyewaan();
                    break;

                case 4:
                    hapusPenyewaan();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Yang Anda masukkan tidak valid.");
            }

        } while (pilihan != 5);
    }


    static void tambahPenyewaan() {

        System.out.println("\n===== TAMBAH PENYEWAAN =====");

        String id = inputText("ID Penyewaan: ");

        if (cariPenyewaan(id) != null) {
            System.out.println("ID penyewaan sudah digunakan.");
            return;
        }

        String idPelanggan = inputText("ID Pelanggan: ");

        if (cariPelanggan(idPelanggan) == null) {
            System.out.println("ID pelanggan tidak ditemukan.");
            return;
        }

        String idAlat = inputText("ID Alat: ");

        AlatMusik alat = cariAlat(idAlat);

        if (alat == null) {
            System.out.println("ID alat tidak ditemukan.");
            return;
        }

        if (!alat.getStatus().equalsIgnoreCase("Ready")) {
            System.out.println("Alat sedang tidak tersedia.");
            return;
        }

        int lamaSewa =
                inputIntPositif("Lama Sewa (hari): ");

        double totalHarga =
                alat.getHargaSewa() * lamaSewa;

        daftarPenyewaan.add(
            new Penyewaan(
                id,
                idPelanggan,
                idAlat,
                lamaSewa,
                totalHarga
            )
        );

        alat.setStatus("Disewa");

        System.out.println("Penyewaan berhasil ditambahkan.");
        System.out.println("Total Harga: Rp" + totalHarga);
    }


    static void lihatPenyewaan() {

        System.out.println("\n===== DAFTAR PENYEWAAN =====");

        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        for (int i = 0; i < daftarPenyewaan.size(); i++) {

            System.out.println("\nData ke-" + (i + 1));

            daftarPenyewaan.get(i).tampilkanData();

            System.out.println("-----------------------------");
        }
    }


    static void ubahPenyewaan() {

        String id = inputText(
            "\nMasukkan ID penyewaan yang ingin diubah: "
        );

        Penyewaan penyewaan = cariPenyewaan(id);

        if (penyewaan == null) {
            System.out.println("Data penyewaan tidak ditemukan.");
            return;
        }

        String idPelanggan =
                inputText("ID Pelanggan baru: ");

        if (cariPelanggan(idPelanggan) == null) {
            System.out.println("ID pelanggan tidak ditemukan.");
            return;
        }

        String idAlat =
                inputText("ID Alat baru: ");

        AlatMusik alatBaru = cariAlat(idAlat);

        if (alatBaru == null) {
            System.out.println("ID alat tidak ditemukan.");
            return;
        }

        int lamaSewa =
                inputIntPositif("Lama Sewa baru: ");

        double totalHarga =
                alatBaru.getHargaSewa() * lamaSewa;

        penyewaan.setIdPelanggan(idPelanggan);
        penyewaan.setIdAlat(idAlat);
        penyewaan.setLamaSewa(lamaSewa);
        penyewaan.setTotalHarga(totalHarga);

        System.out.println("Total Harga baru: Rp" + totalHarga);
        System.out.println("Data berhasil diubah.");
    }


    static void hapusPenyewaan() {

        String id = inputText(
            "\nMasukkan ID penyewaan yang ingin dihapus: "
        );

        Penyewaan penyewaan = cariPenyewaan(id);

        if (penyewaan == null) {
            System.out.println("Data penyewaan tidak ditemukan.");
            return;
        }

        AlatMusik alat =
                cariAlat(penyewaan.getIdAlat());

        if (alat != null) {
            alat.setStatus("Ready");
        }

        daftarPenyewaan.remove(penyewaan);

        System.out.println("Data penyewaan berhasil dihapus.");
    }


    static AlatMusik cariAlat(String id) {

        for (AlatMusik alat : daftarAlat) {

            if (alat.getIdAlat().equalsIgnoreCase(id)) {
                return alat;
            }
        }

        return null;
    }

    static Pelanggan cariPelanggan(String id) {

        for (Pelanggan pelanggan : daftarPelanggan) {

            if (pelanggan.getIdPelanggan().equalsIgnoreCase(id)) {
                return pelanggan;
            }
        }

        return null;
    }

    static Penyewaan cariPenyewaan(String id) {

        for (Penyewaan penyewaan : daftarPenyewaan) {

            if (penyewaan.getIdPenyewaan().equalsIgnoreCase(id)) {
                return penyewaan;
            }
        }

        return null;
    }

    static String inputText(String pesan) {

        while (true) {

            System.out.print(pesan);

            String data = input.nextLine().trim();

            if (!data.isEmpty()) {
                return data;
            }

            System.out.println(
                "Yang Anda masukkan tidak valid. " +
                "Input tidak boleh kosong."
            );
        }
    }

    static String inputNama(String pesan) {

        while (true) {

            String nama = inputText(pesan);

            if (nama.matches("[a-zA-Z ]+")) {
                return nama;
            }

            System.out.println(
                "Yang Anda masukkan tidak valid. " +
                "Nama hanya boleh berisi huruf."
            );
        }
    }

    static String inputTelepon(String pesan) {

        while (true) {

            String telepon = inputText(pesan);

            if (telepon.matches("[0-9]+")
                    && telepon.length() >= 10) {

                return telepon;
            }

            System.out.println(
                "Yang Anda masukkan tidak valid. " +
                "Nomor telepon harus berupa angka " +
                "dan minimal 10 digit."
            );
        }
    }

    static String inputStatus() {

        while (true) {

            String status =
                    inputText("Status (Ready/Disewa): ");

            if (status.equalsIgnoreCase("Ready")) {
                return "Ready";
            }

            if (status.equalsIgnoreCase("Disewa")) {
                return "Disewa";
            }

            System.out.println(
                "Yang Anda masukkan tidak valid. " +
                "Status hanya boleh Ready atau Disewa."
            );
        }
    }

    static int inputInt(String pesan) {

        while (true) {

            System.out.print(pesan);

            String data =
                    input.nextLine().trim();

            try {

                return Integer.parseInt(data);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Yang Anda masukkan tidak valid. " +
                    "Harus berupa angka."
                );
            }
        }
    }

    static int inputIntPositif(String pesan) {

        while (true) {

            int angka = inputInt(pesan);

            if (angka > 0) {
                return angka;
            }

            System.out.println(
                "Yang Anda masukkan tidak valid. " +
                "Angka harus lebih dari 0."
            );
        }
    }

    static double inputDoublePositif(String pesan) {

        while (true) {

            System.out.print(pesan);

            String data =
                    input.nextLine().trim();

            try {

                double angka =
                        Double.parseDouble(data);

                if (angka > 0) {
                    return angka;
                }

                System.out.println(
                    "Yang Anda masukkan tidak valid. " +
                    "Angka harus lebih dari 0."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Yang Anda masukkan tidak valid. " +
                    "Harus berupa angka."
                );
            }
        }
    }
}