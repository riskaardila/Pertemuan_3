package ` id`.ac.polbeng.riska.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val riska = PersonA("Riska", "Ardila", 21)
    println("Name : ${riska.firstName} ${riska.lastName}")
    println("Age : ${riska.age}")
}