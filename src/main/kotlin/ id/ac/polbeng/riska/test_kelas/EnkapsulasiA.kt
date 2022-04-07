package ` id`.ac.polbeng.riska.test_kelas

class EnkapsulasiA (_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val riska = EnkapsulasiA(11011, "Riska", 21)
    println("id : ${riska.id}, Nama : ${riska.name}, Umur : ${riska.age}")
}