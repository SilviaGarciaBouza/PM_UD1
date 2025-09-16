package practicas

fun main(){
    var array1= arrayOf(1,2,3,4)
    var array2= arrayOf(5,6,7,8)

   loop@ for(i in 0 until array1.size){
       println("Se esta evaluando el numero ${array1[i]}")
        for(z in 0 until array2.size){
            if(array1[i]+array2[z]>10){
                continue@loop
            }else{
                var suma=array1[i]+array2[z]
                println("Los numero ${array1[i]} y ${array2[z]} cumplen la condición, suma=${suma}")
            }
        }
    }
}