package practicas.practica5

class CalculadoraConNull {
    fun suma(a:Int?, b:Int?): Int{
        return((a ?: 0)+(b ?: 0))
    }

    fun resta(a:Int?, b:Int?): Int{
        return((a ?: 0)+(b ?: 0))
    }
}