package ` id`.ac.polbeng.riska.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Riska")
    greeter.greet("Widia")
    greeter.text = "Swag Biawak"
    println(greeter.with_ret_val("wow"))
}