package practicas.practica2

import kotlin.random.Random

fun main() {
    val num: Int
    num= Random.nextInt(0,100)
    when(num){
        in 0..10 -> println("")
        in 11..20 -> println("")
        in 21..30 -> println("")
        in 31..40 -> println("")
        in 41..50 -> println("")
        in 51..60 -> println("")
        in 61..70 -> println("")
        in 71..80 -> println("")
        in 81..90 -> println("")
        in 91..100 -> println("")
        else -> println("")
    }
    when(num){
        0 -> println("0")
        in 1..10 -> println("")
    }
}