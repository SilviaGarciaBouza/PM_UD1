package teoria.elementos_basicos

fun main(){
    //variables de solo lectura
    val xPos: Int =1
    //val ypos: IntyPos=5 error
    val enemyHealt: Int=2
    println(enemyHealt)

    //variables mutables
    var xPos2:Int=1
    val yPos2:Int=5
    xPos2=3
    println("Coordenadas actuales: $xPos2, $yPos2")

    //Inferencia de tipos
    val playerName="Oliver"//se infiere  :String
    val playerHealth =2//se infiere  :Int
    val playerLucky =0.2//se infiere  :Double
    var speed= 12
   // speed="lento" error



}