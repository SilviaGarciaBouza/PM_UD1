package practicas.practica2.act2

fun main() {
    //Array tamaño fijo
    val planets =arrayOfNulls<String>(8)
    planets[0]="Mercurio"
    val inCome =arrayOf<Double>(1000.0,2000.0,3000.0)
    //inCome=Array(5){0.0}
    val inComeString= inCome.joinToString()
    println(inComeString)
    val arrayDouble= DoubleArray(6){0.0}
    arrayDouble[0]=1000.0
    arrayDouble[1]=2000.0
    arrayDouble[2]=3000.0
    arrayDouble[3]=4000.0
    arrayDouble[4]=5000.0
    arrayDouble[5]=6000.0
    println(arrayDouble.joinToString())
}