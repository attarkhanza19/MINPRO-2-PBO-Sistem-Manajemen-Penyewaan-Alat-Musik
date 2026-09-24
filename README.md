# MINI PROJECT 1 PBO MUHAMMAD ATTAR KHANZA HABIBILLAH (2509116006)
## Sistem Manajemen Penyewaan Alat Musik
### Deskripsi singkat program
Program Sistem Penyewaan Alat Musik merupakan program berbasis Java yang digunakan untuk mengelola data alat musik, pelanggan, dan transaksi penyewaan. Program menyediakan fitur tambah, lihat, ubah, dan hapus (CRUD) pada setiap data. Program juga dapat menghitung total biaya penyewaan berdasarkan harga alat dan lama penyewaan. Implementasi program menggunakan class, object, constructor, ArrayList, percabangan, dan perulangan.
### Class apa aja yang ada di dalam program?
Didalam program **Sistem Manajemen Penyewaan Alat Musik**, ada 4 class:
1. Minpro2penyewaanalatmusik (main) adalah class entry point menjalankan program, menampilkan menu, menerima input, dan menjalankan proses CRUD.
2. AlatMusik sebagai penyimpan data alat musik yang disewakan, seperti ID, nama, jenis, harga sewa, dan status.
3. AlatMusikAkustik sebagai subclass dari AlatMusik yang menyimpan data tambahan alat musik akustik, yaitu bahan alat musik.
4. AlatMusikElektrik sebagai subclass dari AlatMusik yang menyimpan data tambahan alat musik elektrik, yaitu daya alat dalam Watt.
5. Pelanggan sebagai penyimpan data pelanggan yang melakukan penyewaan.
6. Penyewaan sebagai penyimpan data transaksi penyewaan, seperti ID penyewaan, pelanggan, alat, lama sewa, dan total harga.

### Alur Perencanaan Program
Alur program dimulai ketika program dijalankan melalui class Minpro2penyewaanalatmusik.java. Program akan menampilkan menu utama yang berisi beberapa pilihan, yaitu Kelola Data Alat Musik, Kelola Data Pelanggan, Kelola Data Penyewaan, dan Keluar.

Pengguna memilih menu dengan memasukkan angka sesuai pililhan Program kemudian menggunakan percabangan **switch** untuk menentukan proses yang akan dijalankan berdasarkan pilihan pengguna.

Alur setiap menu:

1. Kelola Data Alat Musik

    Pengguna dapat memilih untuk menambah, menampilkan, mengubah, atau menghapus data alat musik. Pada saat menambah data, pengguna memasukkan ID alat, nama alat, jenis alat, harga sewa, dan status. Data tersebut digunakan untuk membuat object AlatMusik menggunakan constructor, kemudian object dimasukkan ke dalam ArrayList daftarAlat menggunakan add().

2. Kelola Data Pelanggan

   Pengguna memasukkan data pelanggan seperti ID pelanggan, nama, nomor telepon, dan alamat. Data tersebut digunakan untuk membuat object Pelanggan, kemudian dimasukkan ke dalam ArrayList daftarPelanggan. Data pelanggan juga dapat ditampilkan, diubah, dan dihapus berdasarkan ID pelanggan.

3. Kelola Data Penyewaan

   Pengguna memasukkan data penyewaan seperti ID penyewaan, ID pelanggan, ID alat, dan lama sewa. Program mencari harga alat berdasarkan ID alat, kemudian menghitung total harga berdasarkan harga sewa dan lama sewa. Data tersebut digunakan untuk membuat object Penyewaan dan dimasukkan ke dalam ArrayList daftarPenyewaan.

4. Tampilkan Data

   Program memeriksa apakah ArrayList memiliki data. Jika belum ada data, program menampilkan pesan bahwa data belum tersedia. Jika terdapat data, program menggunakan perulangan for untuk mengambil setiap data menggunakan get(i), kemudian menampilkannya.

5. Update Data

   Pengguna memasukkan ID data yang ingin diubah. Program melakukan pencarian menggunakan perulangan. Jika ID ditemukan, pengguna dapat memasukkan data baru dan data tersebut akan diperbarui.

6. Hapus Data

   Pengguna memasukkan ID data yang ingin dihapus. Program mencari ID tersebut di dalam ArrayList. Jika ditemukan, data dihapus menggunakan remove(i). Jika tidak ditemukan, program menampilkan pesan bahwa data tidak ditemukan.

7. Keluar

   Jika pengguna memilih menu keluar, kondisi pada perulangan utama terpenuhi sehingga perulangan berhenti dan program selesai.

8. Validasi Input

   Program memiliki validasi untuk memastikan data yang dimasukkan sesuai dengan ketentuan. Contohnya, input nama hanya dapat berisi huruf, nomor telepon harus berupa angka dengan minimal 10 digit, sedangkan harga, lama sewa, dan daya harus berupa angka positif.

   Jika pengguna memasukkan data yang tidak sesuai, program menampilkan pesan "Yang Anda masukkan tidak valid" dan meminta pengguna memasukkan data kembali.

9. Dummy Data

    Program menyediakan beberapa dummy data pada saat pertama kali dijalankan. Dummy data digunakan agar pengguna dapat langsung melihat isi data tanpa harus
    melakukan input terlebih dahulu.

    Dummy data terdapat pada daftarAlat, daftarPelanggan, dan daftarPenyewaan.

11. Inheritance dan Polymorphism

    Program menerapkan inheritance dengan menggunakan AlatMusik sebagai superclass dan AlatMusikAkustik serta AlatMusikElektrik sebagai subclass.

    Program juga menerapkan polymorphism melalui method tampilkanData() yang dioverride pada kedua subclass. Object dari subclass dapat disimpan dalam
    ArrayList<AlatMusik> dan method tampilkanData() akan dijalankan sesuai dengan jenis object tersebut.

12. Encapsulation

    Data pada setiap class menggunakan access modifier private sehingga tidak dapat diakses secara langsung dari luar class. Untuk mengakses dan mengubah data,        program menggunakan getter dan setter.

### Dokumentasi Alur Program
1. Tampilan Menu Utama
```
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu:
```

Menu utama berfungsi sebagai halaman awal untuk mengakses fitur-fitur dalam sistem penyewaan alat musik. Kelola Data Alat Musik digunakan untuk menambah, melihat, mengubah, dan menghapus data alat musik yang tersedia untuk disewa. Kelola Data Pelanggan digunakan untuk mengelola data pelanggan yang melakukan penyewaan, seperti ID, nama, nomor telepon, dan alamat. Kelola Data Penyewaan digunakan untuk mencatat dan mengelola transaksi penyewaan dengan memasukkan data pelanggan, alat musik, serta lama penyewaan dan menghitung total harga. Sedangkan Keluar digunakan untuk mengakhiri program setelah pengguna selesai menggunakan sistem.

2. Kelola Data Alat Musik
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu:
```
Bagian ini merupakan submenu untuk mengelola data alat musik. Pengguna dapat memilih operasi yang ingin dilakukan terhadap data alat musik, yaitu Tambah Alat untuk memasukkan data alat musik baru, Lihat Alat untuk menampilkan data yang tersimpan, Ubah Alat untuk memperbarui data berdasarkan ID alat, dan Hapus Alat untuk menghapus data alat dari sistem. Sementara itu, pilihan Kembali digunakan untuk kembali ke menu utama sistem penyewaan alat musik.

3. Tambah Alat
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 1

===== TAMBAH ALAT MUSIK =====
ID Alat: GTR-002
Nama Alat: Gitar Spanyol Rata kanan
Jenis Alat: Gitar
Harga Sewa per Hari: 120000

Jenis Alat Musik:
1. Akustik
2. Elektrik
Pilih jenis: 1
Status (Ready/Disewa): Ready
Bahan Alat: Kayu Jati
Data alat berhasil ditambahkan.
```
Menu Tambah Alat digunakan untuk menambahkan data alat musik baru ke dalam sistem penyewaan. Pengguna memasukkan ID alat, nama alat, jenis alat, harga sewa, serta memilih jenis alat musik apakah Akustik atau Elektrik. Pengguna juga memasukkan status dan data tambahan sesuai jenis alat. Pada contoh ini, pengguna menambahkan Gitar Spanyol Rata kanan dengan ID GTR-002, harga sewa Rp120.000 per hari, berjenis akustik, berstatus Ready, dan berbahan Kayu Jati. Setelah data valid, program membuat object AlatMusikAkustik dan menyimpannya ke dalam ArrayList daftarAlat, kemudian menampilkan pesan bahwa data berhasil ditambahkan.

4. Lihat Alat
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 2

===== DAFTAR ALAT MUSIK =====

Data ke-1
ID Alat       : GTR-001
Nama Alat     : Gitar Akustik
Jenis Alat    : Gitar
Harga Sewa    : Rp100000.0
Status        : Ready
Bahan         : Kayu
-----------------------------

Data ke-2
ID Alat       : KBD-001
Nama Alat     : Keyboard
Jenis Alat    : Keyboard
Harga Sewa    : Rp150000.0
Status        : Ready
Daya          : 220 Watt
-----------------------------

Data ke-3
ID Alat       : GTR-002
Nama Alat     : Gitar Spanyol Rata kanan
Jenis Alat    : Gitar
Harga Sewa    : Rp120000.0
Status        : Ready
Bahan         : Kayu Jati
-----------------------------
```
Menu Lihat Alat digunakan untuk menampilkan seluruh data alat musik yang tersimpan di dalam sistem. Pada tampilan tersebut terdapat tiga data alat, yaitu Gitar Akustik, Keyboard, dan Gitar Spanyol Rata kanan. Setiap data menampilkan informasi seperti ID, nama, jenis, harga sewa, dan status.

Selain data umum, program juga menampilkan atribut tambahan berdasarkan jenis alat. Pada alat musik akustik ditampilkan bahan, sedangkan pada alat musik elektrik ditampilkan daya dalam Watt. Data tersebut ditampilkan menggunakan perulangan sehingga seluruh isi ArrayList daftarAlat dapat ditampilkan secara berurutan.

5. Ubah Alat
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 3

Masukkan ID alat yang ingin diubah: GTR-002
Nama Alat baru: Gitar Spanyol Rata kanan
Jenis Alat baru: Gitar
Harga Sewa baru: 120000
Status (Ready/Disewa): Disewa
Bahan baru: Kayu Jati
Data berhasil diubah.
```
Menu Ubah Alat digunakan untuk memperbarui data alat musik yang sudah tersimpan berdasarkan ID alat. Pada contoh ini, pengguna memilih ID GTR-002, kemudian memasukkan data baru berupa nama alat, jenis alat, harga sewa, status, dan bahan. Status alat diubah dari Ready menjadi Disewa. Setelah seluruh data berhasil diperbarui, program menampilkan pesan "Data berhasil diubah."

6. Hapus Alat
```
===== DATA ALAT MUSIK =====
1. Tambah Alat
2. Lihat Alat
3. Ubah Alat
4. Hapus Alat
5. Kembali
Pilih menu: 4

Masukkan ID alat yang ingin dihapus: GTR-002
Data alat berhasil dihapus.
```
Menu Hapus Alat digunakan untuk menghapus data alat musik yang sudah tersimpan berdasarkan ID alat. Pada contoh ini, pengguna memasukkan ID GTR-002 untuk memilih data Gitar Spanyol Rata kanan yang akan dihapus. Setelah ID ditemukan, program menghapus data tersebut dari ArrayList daftarAlat dan menampilkan pesan "Data alat berhasil dihapus."

7. Kelola Data Pelanggan
```
===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu:
```
Menu Data Pelanggan digunakan untuk mengelola data pelanggan yang menggunakan layanan penyewaan alat musik. Pengguna dapat memilih Tambah Pelanggan untuk memasukkan data pelanggan baru, Lihat Pelanggan untuk menampilkan data yang tersimpan, Ubah Pelanggan untuk memperbarui data pelanggan berdasarkan ID, dan Hapus Pelanggan untuk menghapus data pelanggan. Pilihan Kembali digunakan untuk kembali ke menu utama.

8. Tambah Pelanggan
```
===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 1

===== TAMBAH PELANGGAN =====
ID Pelanggan: PLN-002
Nama Pelanggan: Ibrah
No. Telepon: 0831231941
Alamat: Samarinda Seberang
Data pelanggan berhasil ditambahkan.
```
Menu Tambah Pelanggan digunakan untuk menambahkan data pelanggan baru ke dalam sistem. Pada contoh ini, pengguna memasukkan ID pelanggan PLN-002, nama Ibrah, nomor telepon, dan alamat Samarinda Seberang. Setelah data dinyatakan valid, program membuat object Pelanggan dan menyimpannya ke dalam ArrayList daftarPelanggan. Program kemudian menampilkan pesan "Data pelanggan berhasil ditambahkan."

9. Lihat Pelanggan
```
===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 2

===== DAFTAR PELANGGAN =====

Data ke-1
ID Pelanggan : PLN-001
Nama         : Dilan
No. Telepon  : 08882293918
Alamat       : Samarinda
-----------------------------

Data ke-2
ID Pelanggan : PLN-002
Nama         : Ibrah
No. Telepon  : 0831231941
Alamat       : Samarinda Seberang
-----------------------------
```
Menu Lihat Pelanggan digunakan untuk menampilkan seluruh data pelanggan yang tersimpan dalam sistem. Pada contoh ini terdapat dua data pelanggan, yaitu PLN-001 dengan nama Dilan dan PLN-002 dengan nama Ibrah. Setiap data menampilkan ID pelanggan, nama, nomor telepon, dan alamat. Data ditampilkan menggunakan perulangan sehingga seluruh isi ArrayList daftarPelanggan dapat ditampilkan secara berurutan.

10. Ubah Pelanggan
```
===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 3

Masukkan ID pelanggan yang ingin diubah: PLN-002
Nama baru: Ibrah Baswedan
No. Telepon baru: 0831231941
Alamat baru: Samarinda Seberang
Data berhasil diubah.
```
Menu Ubah Pelanggan digunakan untuk memperbarui data pelanggan yang sudah tersimpan berdasarkan ID pelanggan. Pada contoh ini, pengguna memilih ID PLN-002, kemudian mengubah nama pelanggan menjadi Ibrah Baswedan serta memasukkan kembali nomor telepon dan alamat. Setelah data berhasil diperbarui, program menampilkan pesan "Data berhasil diubah."

11. Hapus Pelanggan
```
===== DATA PELANGGAN =====
1. Tambah Pelanggan
2. Lihat Pelanggan
3. Ubah Pelanggan
4. Hapus Pelanggan
5. Kembali
Pilih menu: 4

Masukkan ID pelanggan yang ingin dihapus: PLN-003
Data pelanggan berhasil dihapus.
```
Menu Ubah Pelanggan digunakan untuk memperbarui data pelanggan yang sudah tersimpan berdasarkan ID pelanggan. Pada contoh ini, pengguna memilih ID PLN-002, kemudian mengubah nama pelanggan menjadi Ibrah Baswedan serta memasukkan kembali nomor telepon dan alamat. Setelah data berhasil diperbarui menggunakan setter, program menampilkan pesan "Data berhasil diubah."

12. Kelola Data Penyewaan
```
===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu:
```
Menu Data Penyewaan digunakan untuk mengelola transaksi penyewaan alat musik. Pengguna dapat memilih Tambah Penyewaan untuk membuat transaksi baru, Lihat Penyewaan untuk menampilkan transaksi yang tersimpan, Ubah Penyewaan untuk memperbarui data transaksi, dan Hapus Penyewaan untuk menghapus transaksi. Pilihan Kembali digunakan untuk kembali ke menu utama.

13. Tambah Penyewaan
```
===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 1

===== TAMBAH PENYEWAAN =====
ID Penyewaan: SW-002
ID Pelanggan: PLN-002
ID Alat: GTR-001
Lama Sewa (hari): 2
Penyewaan berhasil ditambahkan.
Total Harga: Rp200000.0
```
Menu Tambah Penyewaan digunakan untuk menambahkan transaksi penyewaan alat musik baru ke dalam sistem. Pada contoh ini, pengguna memasukkan ID penyewaan SW-002, ID pelanggan PLN-002, ID alat GTR-001, dan lama sewa selama 2 hari. Program kemudian mengecek data pelanggan dan alat berdasarkan ID, mengambil harga sewa alat sebesar Rp100.000 per hari, lalu menghitung total harga menjadi Rp200.000. Setelah transaksi berhasil ditambahkan, status alat GTR-001 juga berubah menjadi Disewa.

14. Lihat Penyewaan
```
===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 2

===== DAFTAR PENYEWAAN =====

Data ke-1
ID Penyewaan : SW-001
ID Pelanggan : PLN-001
ID Alat      : GTR-001
Lama Sewa    : 2 hari
Total Harga  : Rp200000.0
-----------------------------

Data ke-2
ID Penyewaan : SW-002
ID Pelanggan : PLN-002
ID Alat      : GTR-002
Lama Sewa    : 1 hari
Total Harga  : Rp120000.0
-----------------------------
```
Menu Lihat Penyewaan digunakan untuk menampilkan seluruh transaksi penyewaan yang tersimpan dalam sistem. Pada contoh ini terdapat dua transaksi, yaitu SW-001 dan SW-002. Transaksi SW-001 menggunakan alat GTR-001 selama 2 hari dengan total harga Rp200.000, sedangkan transaksi SW-002 menggunakan alat GTR-002 selama 1 hari dengan total harga Rp120.000. Setiap transaksi menampilkan ID penyewaan, ID pelanggan, ID alat, lama sewa, dan total harga. Data ditampilkan menggunakan perulangan sehingga seluruh isi ArrayList daftarPenyewaan dapat ditampilkan secara berurutan.

15. Ubah Penyewaan
```
===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 3

Masukkan ID penyewaan yang ingin diubah: SW-002
ID Pelanggan baru: PLN-002
ID Alat baru: GTR-001
Lama Sewa baru: 3
Total Harga baru: Rp300000.0
Data berhasil diubah.
```
Menu Ubah Penyewaan digunakan untuk memperbarui data transaksi penyewaan yang sudah tersimpan berdasarkan ID penyewaan. Pada contoh ini, pengguna memilih ID SW-002, kemudian memasukkan ID pelanggan PLN-002, mengganti ID alat menjadi GTR-001, dan mengubah lama sewa menjadi 3 hari. Program kemudian menghitung kembali total harga berdasarkan harga sewa alat GTR-001, yaitu Rp100.000 per hari, sehingga total harga menjadi Rp300.000. Setelah data berhasil diperbarui, program menampilkan pesan "Data berhasil diubah."

16. Hapus Penyewaan
```
===== DATA PENYEWAAN =====
1. Tambah Penyewaan
2. Lihat Penyewaan
3. Ubah Penyewaan
4. Hapus Penyewaan
5. Kembali
Pilih menu: 4

Masukkan ID penyewaan yang ingin dihapus: SW-002
Data penyewaan berhasil dihapus.
```
Menu Hapus Penyewaan digunakan untuk menghapus transaksi penyewaan yang sudah tersimpan berdasarkan ID penyewaan. Pada contoh ini, pengguna memasukkan ID SW-002 untuk memilih transaksi yang akan dihapus. Setelah ID ditemukan, program menghapus data penyewaan dari ArrayList daftarPenyewaan dan menampilkan pesan "Data penyewaan berhasil dihapus." Selain itu, status alat yang terkait dengan transaksi tersebut dikembalikan menjadi Ready sehingga dapat disewakan kembali.

17. Validasi Input
```
=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu: 6
Yang Anda masukkan tidak valid.

=================================
 SISTEM PENYEWAAN ALAT MUSIK
=================================
1. Kelola Data Alat Musik
2. Kelola Data Pelanggan
3. Kelola Data Penyewaan
4. Keluar
=================================
Pilih menu: abc
Yang Anda masukkan tidak valid. Harus berupa angka.
```
Bagian ini menunjukkan fitur validasi input pada menu utama. Program akan memeriksa input yang diberikan pengguna sebelum menjalankan pilihan menu.

Pada percobaan pertama, pengguna memasukkan angka 6, sedangkan pilihan yang tersedia hanya 1–4. Program kemudian menampilkan pesan "Yang Anda masukkan tidak valid." dan kembali menampilkan menu utama.

Pada percobaan kedua, pengguna memasukkan abc. Karena input menu harus berupa angka, program menangkap kesalahan tersebut dan menampilkan pesan "Yang Anda masukkan tidak valid. Harus berupa angka." Program kemudian meminta input kembali.

Fitur ini dibuat menggunakan perulangan sehingga program tidak langsung berhenti ketika pengguna memasukkan input yang salah.

```
===== TAMBAH ALAT MUSIK =====
ID Alat: -12
Nama Alat: Gtr
Jenis Alat: gtr
Harga Sewa per Hari: 3123

Jenis Alat Musik:
1. Akustik
2. Elektrik
Pilih jenis: 2
Status (Ready/Disewa): redi
Yang Anda masukkan tidak valid. Status hanya boleh Ready atau Disewa.
```
Bagian ini menunjukkan fitur validasi input pada saat pengguna menambahkan alat musik. Pengguna memasukkan status redi, tetapi program hanya menerima status Ready atau Disewa.

Karena input tidak sesuai dengan pilihan yang tersedia, program menampilkan pesan "Yang Anda masukkan tidak valid. Status hanya boleh Ready atau Disewa." dan meminta pengguna memasukkan status kembali.

Validasi ini digunakan agar data yang disimpan dalam program tetap sesuai dengan ketentuan yang telah ditentukan.

```
Status (Ready/Disewa): disewa
Daya Alat (Watt): -12
Yang Anda masukkan tidak valid. Angka harus lebih dari 0.
```
Bagian ini menunjukkan fitur validasi input angka positif pada saat menambahkan alat musik elektrik. Pengguna memasukkan nilai daya sebesar -12 Watt, tetapi program hanya menerima angka yang lebih besar dari 0.

Karena nilai yang dimasukkan tidak memenuhi ketentuan, program menampilkan pesan "Yang Anda masukkan tidak valid. Angka harus lebih dari 0." dan meminta pengguna memasukkan nilai daya kembali.

### Penjelasan Penerapan Encapsulation dan Inheritance

#### 1. Encapsulation
Encapsulation diterapkan dengan membatasi akses langsung terhadap atribut pada setiap class menggunakan access modifier private. Data tersebut kemudian dapat diakses dan diubah melalui method getter dan setter.

Contohnya pada class AlatMusik
```
private String idAlat;
private String namaAlat;
private String jenisAlat;
private double hargaSewa;
private String status;
```
Atribut tersebut tidak dapat diakses secara langsung dari class lain. Untuk mengambil nilai atribut digunakan getter, misalnya
```
public String getNamaAlat() {
    return namaAlat;
}
```
Sedangkan untuk mengubah nilai atribut digunakan setter
```
public void setNamaAlat(String namaAlat) {
    this.namaAlat = namaAlat;
}
```
Penerapan encapsulation juga terdapat pada class Pelanggan, Penyewaan, AlatMusikAkustik, dan AlatMusikElektrik. Dengan penerapan ini, data dalam object dapat dikontrol melalui method yang telah disediakan.
