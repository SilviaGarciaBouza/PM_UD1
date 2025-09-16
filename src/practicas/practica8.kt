package practicas

fun main() {
    println("Escribe un numero positivo: ")
    var num = readln().toInt()
    for (i in 1..num) {
        if (num % 3 == 0) {
            continue
        } else if (num >= 20) {
            break
        } else {
            println(i)
        }
    }
}