package practicas.practica2

fun main(){
    val c: CalculadoraNulable= CalculadoraNulable()
    c.sum(1,2)
}

class CalculadoraNulable{
    fun sum(num:Int?, num2:Int?): Int{
        return (num ?: 0 )+ (num2 ?: 0)
    }
}