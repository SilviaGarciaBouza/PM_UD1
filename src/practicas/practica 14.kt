package practicas
import kotlin.math.*
class `practica 14` {



}
//open a la class padre para hacer overide en las hijas,
open class CalculadoraBase(a:Double, b:Double){
    var a: Double
    var b:Double
    init {
        this.a=a
        this.b=b
    }
    fun sumar():Double= a+b


}

class CalculadoraCientifica(a:Double, b:Double): CalculadoraBase(a, b){
    fun cuadrado():Double=a.pow(2)
    fun raizCuadrada():Double= kotlin.math.sqrt(this.a)

}





fun main() {
    println("Prueba de la clase CalculadoraBase")
    val calculadora1 = CalculadoraBase(10.0, 2.0)
    println("Resultado suma:" + calculadora1.sumar())

    println("Prueba de la clase CalculadoraCientifica (suma de dos números y el cuadrado y la raíz del primero)")
    val calculadoraCientifica1 = CalculadoraCientifica(10.0, 2.0)
    println("Resultado suma científica:" + calculadoraCientifica1.sumar())
    println("Resultado cuadrado:" + calculadoraCientifica1.cuadrado())
    println("Resultado raíz:" + calculadoraCientifica1.raizCuadrada())}