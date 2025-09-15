package teoria.elementos_basicos

fun main() {
    val customerName: String = "Claudia Martinez"
    val customerName2 = "Claudia Martinez"

    println(customerName)
    println(customerName[2])
    println(customerName.get(2))
    println(customerName.length)
    for(char in customerName){
        print(char)
    }
    for(index in customerName.indices){
        println(customerName[index])
    }

    val a = "José" + " Monteria"
    val b = "Cantidad de ahorros: " + 536.4
    val c = "Resultado: " + (2 + 4)
    println(a)
    println(b)
    println(c)

    var d = "Nueva concatenación"
    d += '!'// "Nueva concatenación!"

    val welcomeText = """
        ¡Bienvenido a la guía de Kotlin de develou.com!
        En esta serie de tutoriales aprenderás 
        los conceptos básicos sobre el lenguaje
        y las herramientas necesarias para probarlo
    """
    println(welcomeText)

    val welcomeText2 = """
        |¡Bienvenido a la guía de Kotlin de develou.com!
        |En esta serie de tutoriales aprenderás 
        |los conceptos básicos sobre el lenguaje
        |y las herramientas necesarias para probarlo
    """.trimMargin()
    println(welcomeText)

    val playerName = "NKiller"
    println("Tu nuevo nombre es $playerName")
    println("Tu nuevo tamaño de nombre es ${playerName.length}")

}