package practicas
data class Usuario1(val username: String, val email: String)

class GestorUsuarios {
    private val usuarios: MutableList<Usuario1> = mutableListOf()

    fun agregarUsuario(usuario: Usuario1): Boolean {
        //any mira si machea
        if(usuarios.any(){it.email == usuario.email}){
            return false
        }else{
            usuarios.add(usuario)
            return true
        }

    }
    fun mostrarUsuarios() {
        if(usuarios.isEmpty()){
            println("No hay usuarios")
        }else{
            usuarios.forEach { u-> println(u.toString()) }
        }

    }
    //mejor usar find pq te devuelve u o null si no lo encuentra
    fun buscarUsuarioPorEmail(email: String): Usuario1? {
        if (usuarios.any() { it.email == email }) {
            usuarios.filter { u -> u.email == email }
                .forEach { u ->
                    println("Se encontró el usuario ")
                    return u
                }

        } else {
            println("no se encontro")

        }
        return null
    }
}
fun main() {
    val gestor = GestorUsuarios()

    val u1 = Usuario1("juan123", "juan@mail.com")
    val u2 = Usuario1("ana89", "ana@mail.com")
    val u3 = Usuario1("pepe77", "juan@mail.com") // mismo email que u1

    gestor.agregarUsuario(u1)
    gestor.agregarUsuario(u2)
    gestor.agregarUsuario(u3) // rechazado por duplicado

    gestor.mostrarUsuarios()

    gestor.buscarUsuarioPorEmail("ana@mail.com")
    gestor.buscarUsuarioPorEmail("noexiste@mail.com")
}
