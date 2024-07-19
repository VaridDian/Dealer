// Kelas turunan untuk jenis kendaraan tertentu
class SepedaMotor(id: Int, merek: String, model: String, tahun: Int, harga: Int) :
    Kendaraan(id, merek, model, tahun, harga) {

    override fun tampilkanDetail() {
        super.tampilkanDetail()
        // Tidak ada tipe motor yang ditampilkan karena tidak dimasukkan dalam input
    }
}
