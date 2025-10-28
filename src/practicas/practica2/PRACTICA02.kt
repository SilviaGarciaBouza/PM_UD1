package practicas.practica2

fun main() {
    val myString: String
    val num:Int
    println("Escribe una String: ")
    myString= readLine()!!
    println("Escribe un numero: ")
    num= readLine()!!.toInt()
    println("${myString[num]}")
    if(num>0) println("${myString.get(num-1)}")
    if(num <myString.length-1) println("${myString.get(num+1)}")



}