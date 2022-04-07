package ` id`.ac.polbeng.riska.test_kelas

fun main() {
    val meri = Student("Riska", 21)
    // Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}
