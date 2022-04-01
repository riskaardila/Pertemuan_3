package ` id`.ac.polbeng.riska.test_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val riska = PersonD("Riska", "Ardila", 21)
    println("Name : ${riska.firstName} ${riska.lastName}")
    println("Age : ${riska.age}")
}