package practicas

fun main() {
    println("Escribe un numero")
    val num : Int = readLine()?.toInt() ?: 0
    val name: String = "12345678"
   3

    val double = doubleArrayOf(1.2, 2.2)
    val uno = arrayOf("s", "ed")
    //array inicializado sin valores y sin saber cuantas posiciones
    val nose:Array<Int>
    for (i in 0.. uno.size-1){
        println("${uno[i]}")
    }


    println("array: $uno")
    val myList : List<Int>
    val myList2 : List<Int> = emptyList()
    val myList3 : List<Int> = listOf(1,2,3)
    val myList4 : List<Int> = List(5){0}
    myList4[1]
    println("myList4: $myList4")



    for((i , v)in    myList3.withIndex()){

    }
}