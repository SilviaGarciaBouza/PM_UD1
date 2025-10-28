package practicas.practica2

open class CalculadoraBase(val a:Int , val b:Int) {
    fun sumar():Int{
        return a+b
    }
}
class CalculadoraAvanzada( val aa:Int, val bb:Int) : CalculadoraBase(aa,bb){
    fun cuadrado():Int{
        return Math.pow(aa.toDouble(), 2.0).toInt()
    }
    fun raizCuadrada():Double{
        return Math.sqrt(aa.toDouble())
    }
}