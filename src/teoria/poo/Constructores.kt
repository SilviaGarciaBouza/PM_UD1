package teoria.poo

import java.util.UUID

class Constructores(var name:String) {
    var id: String

    init{
       id= UUID.randomUUID().toString()
    }

    constructor( id:String,name:String):this(name){
        this.id=id
    }
    constructor(id:String, name:String, edad:Int):this(name){
        this.id=id
        var edad= edad
        println(edad)

    }

}

fun main(){
    var c: Constructores= Constructores(id="jkij", name="hikj", edad=12)

}