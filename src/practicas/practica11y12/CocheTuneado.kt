package practicas.practica11y12

class CocheTuneado (marca:String, modelo:String):Coche(marca,modelo){
    override val marca:String
        get()=super.marca.uppercase()



}