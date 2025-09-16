package practicas

import kotlin.math.pow

fun main(){
    var text: String? = "si"
    var imc: Double =0.0
    var peso=0.0
    var altura=0.0
    while(!text.equals("no")) {
        println("Quieres calcular tu índice de masa muscular?")
        text= readLine()
        if(text.equals("si")) {
            println("¿Cuánto pesas? ")
           peso= readLine()!!.toDouble()
            println("¿Cuánto mides en metros? ")
             altura = readLine()!!.toDouble()
            imc=  peso/ altura.pow(2)
            when(imc){
                in 0.0..18.4 -> println("Bajo peso")
                in 18.5..24.9 -> println("Bajo peso")
                in  25.0..29.9 -> println("Bajo peso")
                in 30.0..300.0 -> println("Bajo peso")
        }

        }
    }
}