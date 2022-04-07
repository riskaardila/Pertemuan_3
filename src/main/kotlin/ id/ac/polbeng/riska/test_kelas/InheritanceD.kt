package ` id`.ac.polbeng.riska.test_kelas

import java.text.NumberFormat
import java.util.*

open class Employeee{
    open val baseSalary: Int = 3000000
}

class Programmer : Employeee() {
    override val baseSalary: Int = 5000000
}

class SoftwareEnginnering :Employeee() {
    override val baseSalary: Int = 6000000
}

class ProjectManager : Employeee() {
    override val baseSalary: Int = 8000000
}

fun toRupiahFormat(baseSalary: Int) : String {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}

fun main() {
    val employe = Employeee()
    println("Rata-rata gaji ${employe.javaClass.simpleName} = ${toRupiahFormat(employe.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")

    val softwareEnginner = SoftwareEnginnering()
    println("Rata-rata gaji ${softwareEnginner.javaClass.simpleName} = ${toRupiahFormat(softwareEnginner.baseSalary)}")

    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} = ${toRupiahFormat(projectManager.baseSalary)}")
}
