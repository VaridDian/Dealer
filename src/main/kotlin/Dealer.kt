// Kelas Dealer untuk mengelola inventaris dan transaksi
class Dealer {
    private val inventaris = mutableListOf<Kendaraan>()
    private val penjualan = mutableListOf<Kendaraan>()

    fun tambahKendaraan(kendaraan: Kendaraan) {
        inventaris.add(kendaraan)
        println("Kendaraan berhasil ditambahkan:")
        kendaraan.tampilkanDetail()
    }

    fun jualKendaraan(id: Int) {
        if (inventaris.isEmpty()) {
            println("Belum ada kendaraan yang bisa dijual.")
            return
        }

        val kendaraan = inventaris.find { it.id == id }
        if (kendaraan != null) {
            println("Apakah Anda yakin ingin menjual kendaraan berikut? (y/n)")
            kendaraan.tampilkanDetail()
            val konfirmasi = readLine()
            if (konfirmasi.equals("y", ignoreCase = true)) {
                inventaris.remove(kendaraan)
                penjualan.add(kendaraan)
                println("Kendaraan terjual:")
                kendaraan.tampilkanDetail()
            } else {
                println("Penjualan dibatalkan.")
            }
        } else {
            println("Kendaraan dengan ID $id tidak ditemukan.")
        }
    }

    fun tampilkanInventaris() {
        if (inventaris.isEmpty()) {
            println("Tidak ada kendaraan dalam inventaris.")
        } else {
            println("Inventaris:")
            inventaris.forEach { it.tampilkanDetail(); println() }
        }
    }

    fun tampilkanPenjualan() {
        if (penjualan.isEmpty()) {
            println("Tidak ada penjualan yang tercatat.")
        } else {
            println("Penjualan:")
            penjualan.forEach { it.tampilkanDetail(); println() }
        }
    }

    fun inventarisKosong(): Boolean {
        return inventaris.isEmpty()
    }
}
