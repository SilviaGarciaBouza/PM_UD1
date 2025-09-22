package practicas

fun obtenerCoordenadas():Pair<Double, Double> = 1.1 to 2.2
fun obtenerColorRGB():Triple<Int,Int,Int> = Triple(1,2,3)

fun main(){
    println(obtenerCoordenadas())
    println(obtenerColorRGB())
}