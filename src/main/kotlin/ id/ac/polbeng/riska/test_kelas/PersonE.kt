package ` id`.ac.polbeng.riska.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 20
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val riska = PersonE("Riska", "Ardila")
    riska.cetakInfo()
    println()
    val widia = PersonE("Widiasih", "Rambe", 21)
    widia.cetakInfo()
}