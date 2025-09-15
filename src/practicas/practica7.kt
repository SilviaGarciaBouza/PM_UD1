package practicas

fun main(){
    var notas= DoubleArray(4)
    var suma: Double=0.0
    var promedio:Double

    for(i in 0 until notas.size){
        println("Escribe la nota numero ${i+1}: ")
        notas[i]= readln()!!.toDouble()
        suma+=notas[i]
    }
    promedio=suma/4

   /*
    when(promedio){
        0.0 .. 4.9 -> println("S/N")
        5.0 .. 6.9 -> println("Aprobado")
        7
    }
    */

}