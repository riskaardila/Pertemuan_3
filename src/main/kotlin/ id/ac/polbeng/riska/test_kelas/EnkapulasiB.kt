package ` id`.ac.polbeng.riska.test_kelas

class EnkapulasiB (_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field - if (value > 0) value else throw IllegalArgumentException("Age must be greater than kosong")
        }
}

fun main() {
    val riska = EnkapulasiB(221101, "Riska Ardila", 21)
    println("Id : ${riska.id}, Nama : ${riska.name}, Umur : ${riska.age}")
    riska.age = -1
}