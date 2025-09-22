package teoria.elementos_basicos

fun main(){
    //vararg es una palabra clave que permite a una función aceptar un número variable de argumentos del mismo tipo.
    fun sum(vararg n: Int): IntArray {
        return n+n
    }
}