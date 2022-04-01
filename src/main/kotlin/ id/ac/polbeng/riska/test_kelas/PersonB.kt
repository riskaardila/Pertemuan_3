package ` id`.ac.polbeng.riska.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

fun main() {
    val riska = PersonB("Riska", "Ardila", 21)
    println("Name : ${riska.firstName} ${riska.lastName}")
    println("Age : ${riska.age}")
}