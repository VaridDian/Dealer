// Kelas turunan untuk jenis kendaraan tertentu
class Mobil(id: Int, merek: String, model: String, tahun: Int, harga: Int, val jumlahKursi: Int) :
    Kendaraan(id, merek, model, tahun, harga) {
    override fun tampilkanDetail() {
        super.tampilkanDetail()
        println("Jumlah Kursi: $jumlahKursi")
    }
}
