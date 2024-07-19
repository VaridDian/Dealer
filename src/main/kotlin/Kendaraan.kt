// Kelas dasar untuk Kendaraan
open class Kendaraan(val id: Int, val merek: String, val model: String, val tahun: Int, val harga: Int) {
    open fun tampilkanDetail() {
        println("ID: $id")
        println("Merek: $merek")
        println("Model: $model")
        println("Tahun: $tahun")
        println("Harga: $harga")
    }
}
