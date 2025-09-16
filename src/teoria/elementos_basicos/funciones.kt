package teoria.elementos_basicos

fun square(x: Double):Double{
    return x*x
}
fun sum(a: Int, b: Int): Int= a+b

//Unit es como el void de java
fun square2(x: Double): Unit{
    println(x*x)
}
fun squarykue3(x: Double=1.0, y:Int): Unit{
    println(x*y)
}
fun main(){

    squarykue3(y=9)
}