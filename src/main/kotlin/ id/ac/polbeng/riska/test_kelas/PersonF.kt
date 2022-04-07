package ` id`.ac.polbeng.riska.test_kelas

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi woi!!")
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        println("Name : ${_firstName} $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName: String, _country: String): this(_firstName, _lastName){
        println("Name : ${_firstName} $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName: String, _age: Int, _country: String): this(_firstName, _lastName, _age){
        println("Name : ${_firstName} $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}

fun main() {
    val riska = PersonF("Riska", "Ardila", 21)
    val widia = PersonF("Widiasih", "Rambe", 21)
    val aa = PersonF("AA", "Joko", "Indonesia kucing")
    val husain = PersonF("Husain", "aja", 20, "Indonesia")
}