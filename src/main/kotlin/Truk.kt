// Kelas turunan untuk jenis kendaraan tertentu
class Truk(id: Int, merek: String, model: String, tahun: Int, harga: Int, val kapasitas: Double) :
    Kendaraan(id, merek, model, tahun, harga) {
    override fun tampilkanDetail() {
        super.tampilkanDetail()
        println("Kapasitas: $kapasitas ton")
    }
}
