package practicas


    fun main(){

        val notes= arrayOfNulls<Double>(5)
        val notas2= DoubleArray(5)
        var suma=0.0
        var promedio: Double=1.0
        var notaMasAlta: Double=0.0

        for(i in 0 until notes.size){
            println("Introduce una nota:")
            var nota=readLine()!!.toDouble()
            notes[i]=nota
            suma+=nota
            promedio=suma/5
            if(nota>notaMasAlta){
                notaMasAlta=nota
            }
        }
        println("---------------------------------")
        println("Las notas introducidas son:")
        for(i in 0 until notes.size){
            println(notes[i])
        }
        notes.forEachIndexed { i,element -> println("Nota ${i+1}: "+element) }
        println("---------------------------------")
        println(suma)
        println(promedio)
        println(notaMasAlta)

    }


