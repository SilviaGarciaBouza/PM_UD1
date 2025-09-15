package practicas

fun main(){
    println("Escribe tu nombre: ")
    val nombre= readLine()
    println("Escribe tu edad acual: ")
    val edad= readLine()!!.toInt()
    val edadEnCincoaños= edad+5
    println("La edad en 5 años será de $edadEnCincoaños")


    println("Escribe tu nombre: ")
    val nombre2= readLine()
    println("Escribe tu edad acual: ")
    val edad2= readln().toInt()
    val edadEnCincoaños2= edad+5
    println("La edad en 5 años será de $edadEnCincoaños2")


    println("Escribe tu nombre: ")
    val nombre3= readLine()
    println("Escribe tu edad acual: ")
    val edadInput3= readLine() ?: "0"
    val edad3=edadInput3.toInt()
    val edadEnCincoaños3= edad+5
    println("La edad en 5 años será de $edadEnCincoaños3")
}