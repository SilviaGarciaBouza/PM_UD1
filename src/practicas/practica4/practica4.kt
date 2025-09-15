package practicas.practica4

fun main(){
    val miCalculadora: Calculadora = Calculadora()
    var resultado: Int
    var texto:String="si"
    var cuenta:Int

    while(!texto.equals("no")){
        println("Quieres hacer una cuenta?")
        texto=readln()
        println("Que cuenta quieres hacer?1-suma, 2-resta, 3-multiplicar, 4-dividir")
        cuenta=readln()!!.toInt()
        println("Escribe un número: ")
        var numero= readln()!!.toInt()
        println("Escribe otro número: ")
        var numero2= readln()!!.toInt()
        when(cuenta){
            1-> println(numero+numero2)
            2-> println(numero-numero2)
            3-> println(numero*numero2)
            4-> println(numero/numero2)

        }
    }
}