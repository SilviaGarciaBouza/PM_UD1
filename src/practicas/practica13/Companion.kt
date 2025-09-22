package practicas.practica13

class Companion {
    companion object{
        var contador:Int=0
        fun imprimirValor(){
            println(contador)}
    }

    fun AumentarContador(){
        Companion.contador++}
}
fun main(){
    Companion.contador+=4

    Companion.imprimirValor()
    val c:Companion= Companion()
    c.AumentarContador()
    println(Companion.contador)



}