package ` id`.ac.polbeng.riska.test_kelas

open class Mahasiswaa(var nama: String, var nim: Int){
    open fun info() {
        println(nama +'\n'+ nim);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nim= $nim}"
    }
}

class KetuaHima(nama: String, nim: Int, val jurusan: String) : Mahasiswaa(nama, nim) {
    @Override
    override fun info(){
        println(nama +'\n'+ nim +'\n'+ jurusan);
    }
}

fun main() {
    val riska = Mahasiswaa("Riska Ardila", 1223)
    val anton = KetuaHima("Anton", 1223, "rekayasa perangkat lunak")
    println(anton.toString())

    println()
    anton.info()
    println("Jenis Kelas = " + riska.javaClass.simpleName)

    val  widia = KetuaHima("Widiasih Rambe", 1208, "Rekayasa Perangkat Lunak")
    println()
    widia.info()
    println("Jenis Kelas = " + widia.javaClass.simpleName)
}