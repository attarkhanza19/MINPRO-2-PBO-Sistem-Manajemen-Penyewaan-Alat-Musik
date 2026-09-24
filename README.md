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
