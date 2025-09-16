package practicas

import kotlin.math.pow

fun main(){


    var text: String? = "si"
    var notas= DoubleArray(4)
    var suma: Double=0.0
    var promedio:Double
    var recuperacion:Char='p'

    while(!text.equals("no")) {
        println("Quieres introducir las notas de un alumno??(si/no)")
        text= readLine()

        if(text.equals("si")) {
            for(i in 0 until notas.size) {
                println("intoduce una nota: ")
                notas[i]=readln().toDouble()
                suma+=notas[i]
            }

            promedio=suma/4
            when(promedio){
                in 0.00 .. 5.00 -> {
                    println("S/N")
                 //   while(!recuperacion.lowercase().equals('s')&& !recuperacion.lowercase().equals('n')){
                    println("Te has presentado a recuperación?(s/n)")
                        recuperacion= readln().get(0)
                    if(recuperacion.equals('s')) {
                        println("En recuperacion")
                    }else if(recuperacion.equals('n')) {
                        println("Suspenso")
                    }

                }//}
                in 5.01 .. 6.99 -> println("Aprobado")
                in 7.0.. 10.0 -> println("Notable")
            }
        }

        }
    }











