package practicas

data class Usuario(val nombre:String, val edad:Int, val email:String){
    var datos= Triple<String,Int,String>(nombre,edad,email)
}
fun main(){
    var user= Usuario("Ana", 24, "ana@gmail.com")
    println(user.datos)
    //todo desestructurar


}