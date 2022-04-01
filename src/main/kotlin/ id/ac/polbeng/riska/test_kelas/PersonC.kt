package ` id`.ac.polbeng.riska.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val riska = PersonC("Riska", "Ardila", 21)
    println("Name : ${riska.firstName} ${riska.lastName}")
    println("Age : ${riska.age}")
}