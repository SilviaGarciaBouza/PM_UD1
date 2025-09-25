package practicas

class Novela(val titulo:String, val autor:String, val anoPublicacion:Int){

    operator fun component1():String= titulo
    operator fun component2()= autor
    operator fun component3()= anoPublicacion


}
fun main(){
    val biblioteca= listOf<Novela>(Novela("titulo1", "autor1",2000), Novela("titulo2", "autor2", 2001))
    for(elemento in biblioteca){
        var(titulo, autor, año)=elemento
        println("$titulo, $autor")

    }
    biblioteca.forEach { (titulo, autor, _) -> println("$titulo, $autor")

    }
}