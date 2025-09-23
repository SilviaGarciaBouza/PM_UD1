package practicas

data class Usuario (val nombre: String, val edad: Int, val email: String)
data class Coche(val marca:String, val año:Int, val velocidad:Double)
fun main(){
    var user= Usuario("Ana", 24, "ana@gmail.com")
    val (nombre, edad,_)= user
    println("Usuario: $nombre, $edad")

    var coche= Coche("MArca", 2000, 120.0)
    val(marca,_,velocidad)=coche
    println("Marca: $marca, Velocidad: $velocidad")




}