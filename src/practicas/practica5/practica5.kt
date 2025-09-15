package practicas.practica5

fun main(){
    val calculadora : CalculadoraConNull= CalculadoraConNull()
    calculadora.suma(1, null)
    calculadora.resta(null, 2)
}