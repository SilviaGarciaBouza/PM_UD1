package practicas.practica2

fun main() {
    var mydoubleArray=DoubleArray(5)
    var sum:Double=0.0
    var average: Double=0.0
    var notaMasAlta:Double
    for(i in 0 .. 4){
        println("Introduce un numero: ")
        mydoubleArray[i]=readLine()!!.toDouble()
        sum += mydoubleArray[i]
    }
    average= sum/5

    notaMasAlta=mydoubleArray[0]
    for(i in 1..4){
        if (notaMasAlta<mydoubleArray[i]){
            notaMasAlta=mydoubleArray[i]
        }
    }
    println("La suma es: $sum")
    println("El promedio es: $average")
    println("La nota mas alta es: $notaMasAlta")
}