package ` id`.ac.polbeng.riska.test_kelas

open class Computer(val name: String,
                    val brand: String){}
class InheritanceA (name: String,
                    brand: String,
                    val batteryLife: Double) : Computer(name, brand) {
       fun info(){
           println("Name : $name")
           println("Brand : $brand")
           println("Battery Life : $batteryLife")
       }
}

fun main() {
    val laptop = InheritanceA("HP Terbaru", "HP", 2.88888)
    println(laptop.info())
}