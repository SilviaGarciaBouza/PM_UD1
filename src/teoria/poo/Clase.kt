package teoria.poo

class Clase {
    var x:Int=0
        private set //solo se puede modificar dentro de la clase pero leer tb desde fuera
    var y:Int=0
        private set
    fun moverLeft(){
        x-=if(x==0) 0 else 1

    }
    fun moverRight(){
        x+=if(x==300)0 else 1
    }

}
fun main(){
    val plane= Clase()
    plane.moverLeft()

}