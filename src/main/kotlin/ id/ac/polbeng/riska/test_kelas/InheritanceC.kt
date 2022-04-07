package ` id`.ac.polbeng.riska.test_kelas

open class Mahasiswa{
    open fun mahasiswi(){
        println("Mahasiswa....")
    }
    fun info(){
        println("Saya Adalah Mahasiswa")
    }
}

class InheritanceC : Mahasiswa() {
    override fun mahasiswi() {
        println("Mahasiswa RPL")
    }
}

fun main() {
    val mhs = Mahasiswa()
    val mahasiswaRpl = InheritanceC()
    mahasiswaRpl.info()
    mhs.mahasiswi()
    mahasiswaRpl.mahasiswi()
}