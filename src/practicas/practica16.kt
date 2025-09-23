package practicas

fun obternerCoordenadas():Pair<Double,Double> = Pair(1.1,2.2)
fun obtenerColorRGB():Triple<Int,Int,Int> = Triple(1,2,3)


fun main(){
    val(x, y)= obternerCoordenadas()
    println("Coordenadas: $x, $y")
    var(r,g,b)=obtenerColorRGB()
    println("Color: $r, $g, $b")

}