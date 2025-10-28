package practicas.practica2

fun main() {
    val name: String
    val age: Int
    val ageMore5:Int
    println("Escribe tu nombre: ")
    name= readLine()!!
    println("Escribe tu edad: ")
    age= readLine()!!.toInt()
    println("Hola $name, tienes $age años")
    ageMore5= age+5
    println("$ageMore5")

}