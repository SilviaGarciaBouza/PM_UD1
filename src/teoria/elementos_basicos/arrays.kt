package teoria.elementos_basicos

class arrays {
    fun main(){
        val numbers = arrayOfNulls<Int>(8)
        for(i in 0 until numbers.size){
            numbers[i]=i
        }

        val planets= arrayOfNulls<String>(3)
        planets[0]="Mercurio"
        planets[1]="Marte"
        planets[2]="Tierra"

    }



}