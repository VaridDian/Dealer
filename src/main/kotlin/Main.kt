import java.util.Scanner


fun main() {
    val dealer = Dealer()
    val scanner = Scanner(System.`in`)



    while (true) {
        println("=== Aplikasi Dealer Kendaraan ===")
        println("1. Tambah Kendaraan")
        println("2. Jual Kendaraan")
        println("3. Tampilkan Inventaris")
        println("4. Tampilkan Penjualan")
        println("5. Keluar")
        print("Pilih opsi (1-5): ")
        val opsi = scanner.nextInt()
        when (opsi) {
            1 -> {
                println("Pilih jenis kendaraan:")
                println("1. Sepeda Motor")
                println("2. Mobil")
                println("3. Truk")
                println("4. Bus")
                print("Pilih opsi (1-4): ")
                val jenis = scanner.nextInt()
                print("Masukkan ID: ")
                val id = scanner.nextInt()
                print("Masukkan Merek: ")
                val merek = scanner.next()
                print("Masukkan Model: ")
                val model = scanner.next()
                print("Masukkan Tahun: ")
                val tahun = scanner.nextInt()
                print("Masukkan Harga: ")
                val harga = scanner.nextInt()

                when (jenis) {
                    1 -> {
                        dealer.tambahKendaraan(SepedaMotor(id, merek, model, tahun, harga))
                    }
                    2 -> {
                        print("Masukkan Jumlah Kursi: ")
                        val jumlahKursi = scanner.nextInt()
                        dealer.tambahKendaraan(Mobil(id, merek, model, tahun, harga, jumlahKursi))
                    }
                    3 -> {
                        print("Masukkan Kapasitas Truk (ton): ")
                        val kapasitas = scanner.nextDouble()
                        dealer.tambahKendaraan(Truk(id, merek, model, tahun, harga, kapasitas))
                    }
                    4 -> {
                        print("Masukkan Kapasitas Bus (penumpang): ")
                        val kapasitas = scanner.nextInt()
                        dealer.tambahKendaraan(Bus(id, merek, model, tahun, harga, kapasitas))
                    }
                    else -> println("Opsi tidak valid.")
                }
            }
            2 -> {
                if (dealer.inventarisKosong()) {
                    println("Belum ada kendaraan yang bisa dijual.")
                } else {
                    print("Masukkan ID kendaraan yang ingin dijual: ")
                    val id = scanner.nextInt()
                    dealer.jualKendaraan(id)
                }
            }
            3 -> dealer.tampilkanInventaris()
            4 -> dealer.tampilkanPenjualan()
            5 -> break
            else -> println("Opsi tidak valid.")
        }
    }
    scanner.close()
}
