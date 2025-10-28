package practicas.practica2

interface Figura{
    val a:Int
    fun calcularArea():Double
    fun calcularPerimetro():Double {return 0.0}
}
class Cuadrado(override val a: Int) :Figura{
    override fun calcularArea(): Double {
        TODO("Not yet implemented")
    }


}
fun main(){
    val c:Cuadrado= Cuadrado(8)
    c.calcularPerimetro()
    c.calcularArea()
}