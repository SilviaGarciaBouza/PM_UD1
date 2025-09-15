package teoria.elementos_basicos

fun main(){
    //1-Tipos enteros maxValue minValue
    val level: Byte =50
    val level2: Short =500
    val level3: Int =500000
    val level4: Long =50000000
    val level5Byte =5000000000L

    //2literales binarios y hexadecimales
    val bitmapLocation =0b0010001//antes del numero 0b para binario
    println(bitmapLocation::class)
    println(bitmapLocation)//transforma a decimal para imprimirlo
    val chestColor = 0xCCC //antes del numero 0x para hexadecimal
    println(chestColor::class)
    println(chestColor)//transforma a decimal para imprimirlo

    //Numeros reales
    val attackSpeed:Float = 0.5f
    //val attackSpeed3:Float = 0.5 error
    val attackSpeed4 = 0.5f
    val dodgeChange: Double=0.2
    val dodgeChange2 =0.2//por defecto infiere double

    //Literales reales
    val exp1 = 3.211e2
    val exp2 = .0001e10
    val exp3 = 48e5
    val exp4 = 10e-4
    println(exp1)
    println(exp2)
    println(exp3)
    println(exp4)

    //caracteres
    val response:Char='Y'
    println(response)

    /*
    \t: Tabulación
\b: Retroceso
\r: Retorno de carro
\n: Salto de línea
\': Apostrofe
\": Comilla doble
\\: Backslash
\$: Símbolo de dólar
\u+XXXX: Símbolo Unicode con 4 dígitos hexadecimales
    * */
    println("silvia \r ")

    println("""hejqweop\njnhoifj
        | 
        | 
    """.trimMargin())

    //Conversion explicita
   /* val level: Short=75
    val first:Int= level*/
    val level90: Short=75
    val first90:Int= level90.toInt()


}