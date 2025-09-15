package practicas

import teoria.elementos_basicos.main

fun main(){
    var caracter: Char
    var caracterAnterior: Char
    var caracterSiguiente: Char
    var cadena:String


    println("Escribe una cadena de texto: ")
    cadena = readln()
    println("Escribe un numero entero que represente una posicion dentro de esa cadena: ")
    val num = readln()!!.toInt()

    if (num < cadena.length && num >= 0) {
        caracter = cadena.get(num)
        println(caracter)
        if (num != 0) {
            caracterAnterior = cadena.get(num - 1)
            println(caracterAnterior)
        }
        if (num < cadena.length - 1) {
            caracterSiguiente = cadena.get(num + 1)
            println(caracterSiguiente)
        }

    }




}