package practicas
//con ineterface no se pueden inicializar las variables
//no permite constructores
//con override se pueden sobreescribir propis y fun sin ter q ser marcados como open

interface  Practica15 {
    fun calcularSuperficie():Double
    fun calcularperimetro():Double
    fun tituloresult(){
        println(calcularperimetro())
        println(calcularSuperficie())}
}
class Cuadrado(a:Double): Practica15{

    var a: Double

    init {
        this.a=a

    }

    override fun calcularSuperficie(): Double =a*a

    override fun calcularperimetro(): Double =a*4

}

class Rectangulo(a:Double,b:Double): Practica15{

    var a: Double
    var b:Double

    init {
        this.a=a
        this.b=b

    }

    override fun calcularSuperficie(): Double =a*b

    override fun calcularperimetro(): Double =a+a+b+b

}
class Circulo(a:Double): Practica15{

    var a: Double

    init {
        this.a=a

    }
    override fun calcularSuperficie(): Double = Math.PI* Math.pow(a,2.0)
    override fun calcularperimetro(): Double = 2* Math.PI* a

}
fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloresult()
    println("Perímetro del cuadrado : ${cuadrado1.calcularperimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")

    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloresult()
    println("Perímetro del rectángulo : ${rectangulo1.calcularperimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")

    val circulo1 = Circulo(5.0)
    circulo1.tituloresult()
    println("Perímetro del circulo: ${circulo1.calcularperimetro()}")
    println("Superficie del circulo : ${circulo1.calcularSuperficie()}")}