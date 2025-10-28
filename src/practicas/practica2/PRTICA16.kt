package practicas.practica2

fun obtenerCoordenadas(): Pair<Int, Int> {
    return Pair(1, 2)
}

fun main() {
    val (x, y) = obtenerCoordenadas()
    println("Coordenadas: $x, $y")

    val u = Usuario("Ana", 24, 170)
    val (name, _, hight) = u
    println("Usuario: $name, , $hight")

    val libro = Libro(1, 2, 3)

    val a = libro.component1()
}

data class Usuario(val name: String, val age: Int, val hight: Int)

class Libro(val a: Int, val b: Int, val c: Int) {
    operator fun component1() = a
    operator fun component2() = b
    operator fun component3() = c

}

