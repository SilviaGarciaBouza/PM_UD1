package teoria.elementos_basicos

fun main(){
    var uno:Any=1
    var dos=2
    if(uno.equals(2) ){
        println("menor a 2")
    }

    when(dos){
        1-> println("uno")
        2-> println("dos")
        3-> println("tres")
    }

    when(uno){
        1..2 -> {
            println("entre uno y dos")
        }
        3..4-> println("entre 3 y 4")
        else -> {
            println("mayor a 4")
        }
    }

    when(uno){
        is Int-> println("Es una int")
        is String -> println("es una string")
        is Double -> println("Es un double")
    }
}