package practicas.practica11y12

open class Coche(open val marca:String, open val modelo:String){
    var velocidad:Double=0.0
    private set
    constructor(marca: String, modelo: String, velovidad:Double):this(marca,modelo){
        this.velocidad=velovidad
        if (velovidad<0.0){
            this.velocidad=0.0
        }
    }
    fun acelerar(cantidad:Int){
        this.velocidad+=cantidad
        if (this.velocidad<0.0){
            this.velocidad=0.0
        }
    }
    fun frenar(cantidad:Int){
        this.velocidad-=cantidad
        if (this.velocidad<0.0){
            this.velocidad=0.0
        }
    }
    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', velocidad=$velocidad)"
    }
}

fun main(){
    var coche1:Coche= Coche("marca1", "modelo1")
    var coche2:Coche= Coche("marca2", "modelo2", 10.0)
    var coche3:Coche= Coche("marca3", "modelo3", -10.0)
    println("--------------------------------------")
    println(coche1.toString()+"\n"+coche2.toString()+"\n"+coche3.toString())
    println("--------------------------------------")
    println("Aceleramos 30")
    coche1.acelerar(30)
    coche2.acelerar(30)
    coche3.acelerar(30)
    println(coche1.toString()+"\n"+coche2.toString()+"\n"+coche3.toString())
    println("--------------------------------------")
    println("Frenamos 10")
    coche1.frenar(10)
    coche2.frenar(10)
    coche3.frenar(10)
    println(coche1.toString()+"\n"+coche2.toString()+"\n"+coche3.toString())
    println("--------------------------------------")

}
































/*
class Coche(marca:String, modelo:String) {
    var marca: String
        private set
    var modelo: String
        private set
    var velocidad: Int=0
        private set(vel) {//vel es la velocidad actual
            if(vel>=0){
                field=vel
            }else{
                field=0

            }
        }

    init {
        this.marca=marca
        this.modelo=modelo

    }

    constructor(marca:String, modelo:String, velocidad: Int): this(marca,modelo){
        this.marca=marca
        this.modelo=modelo
        //if(velocidad>0){
        this.velocidad=velocidad//}else{this.velocidad=0}
    }
    fun acelerar(cantidad:Int){
        this.velocidad+=cantidad
    }
    fun frenar(cantidad:Int){
        this.velocidad-=cantidad
    }

    override fun toString(): String {
        return "Coche(marca='$marca', modelo='$modelo', velocidad=$velocidad)"
    }

}


fun main(){
    var coche: Coche= Coche("marca1", "modelo1")
    var coche2: Coche= Coche("marca2", "modelo2", velocidad = 10)
    var coche3: Coche= Coche("marca3", "modelo3", velocidad = -10)
    println("--------------------------------------")
    println(coche.toString())
    println("--------------------------------------")
    println(coche2.toString())
    println("--------------------------------------")
    println(coche3.toString())
    println("--------------------------------------")
    println("Aceleramos 30")
    coche.acelerar(30)
    println(coche.toString())
    println("--------------------------------------")
    coche2.acelerar(30)
    println(coche2.toString())
    println("--------------------------------------")
    coche3.acelerar(30)
    println(coche3.toString())
    println("--------------------------------------")
    println("Frenamos 10")
    coche.frenar(10)
    println(coche.toString())
    println("--------------------------------------")
    coche2.frenar(10)
    println(coche2.toString())
    println("--------------------------------------")
    coche3.frenar(10)
    println(coche3.toString())
    println("--------------------------------------")
}*/