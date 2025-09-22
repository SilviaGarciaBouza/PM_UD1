package teoria.poo

import java.util.UUID

//constructor primario ya desde la firma
//los get y set los genera automatico y publico si quieres cambiar tnes q ponerlo
class NaveEspacial(var nombre:String?="sfa", var tamaño:Int) {
    var velocidad:Int=0
    fun volar(){
        velocidad=100
    }
    fun estaVolando():Boolean{
        return velocidad>0
    }
    companion object{//igual q estatico
    fun nuevaNave(): NaveEspacial{
        return NaveEspacial("Falcon", 25)
    }
    }
}
fun main(){
    val miNave= NaveEspacial(tamaño = 8)
    val nuevaNave= NaveEspacial.nuevaNave()
    var nombre= nuevaNave.nombre
    println("${nombre}")
}
class Weapon(attack:Int, speed: Double){
    val attack: Int
    val speed : Double
    init{//solo se ejecuta cuando se instancia con el primero
        this.attack= attack
        this.speed=speed
    }
}
//se puede cambiar la visibilidad del constructor:public, internal, protected y private
class Contact(var name: String) {
    var id: String

    init {
        id = UUID.randomUUID().toString()
    }

    constructor(id:String, name: String) : this(name){//al instanciar con el secunadario smpre hay q llamar al primario
        //primero llama al id del init y luego lo reasigna con el q se le pasa
        this.id = id
    }
}

class Contact2{
    var id: String
    var name: String

    constructor(name:String){
        this.name= name
        id= UUID.randomUUID().toString()
    }
}
//open habilita para poder hacer un override