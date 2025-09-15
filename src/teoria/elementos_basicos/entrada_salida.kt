package teoria.elementos_basicos

fun main(){
    val levelUpMessage = "¡Subiste de nivel"
    println(levelUpMessage)
    val newAbility = "Habilidad Tajo aprendida"
    print(levelUpMessage)
    print(newAbility)

    //control de nulos redline, con redln no
    print("Ponle un nombre a tu personaje:")
    val pjName = readLine()
    print("¡Bienvenido $pjName!")
    //con excepciones los nulos
    print("Ponle un nombre a tu personaje:")
    val pjName2 = readln()
    print("¡Bienvenido $pjName2!")

}
