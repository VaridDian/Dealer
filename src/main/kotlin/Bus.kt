// Kelas turunan untuk jenis kendaraan tertentu
class Bus(id: Int, merek: String, model: String, tahun: Int, harga: Int, val kapasitas: Int) :
    Kendaraan(id, merek, model, tahun, harga) {
    override fun tampilkanDetail() {
        super.tampilkanDetail()
        println("Kapasitas: $kapasitas penumpang")
    }
}
