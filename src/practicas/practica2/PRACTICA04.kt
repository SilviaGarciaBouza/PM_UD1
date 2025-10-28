package practicas.practica2

fun main() {
    val c= Calculadora()
    c.sum(1.1,2.2)
}

class Calculadora{
    fun sum(num:Double, num2:Double):Double{
        return num+num2
    }
}