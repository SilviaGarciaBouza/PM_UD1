package practicas
data class Producto(val nombre:String, val codigo:String){

}
//en java record en lugar de data
class Inventario {
    private val productos: MutableSet<Producto> = mutableSetOf()
    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }
    fun mostrarProductos() {
        productos.forEach { (nombre, codigo)-> println("$nombre , $codigo")
        }
    }
}
fun main() {
    val inventario = Inventario()
    val p1 = Producto("Teclado", "P001")
    val p2 = Producto("Ratón", "P002")
    val p3 = Producto("Teclado", "P001") // Duplicado
    inventario.agregarProducto(p1)
    inventario.agregarProducto(p2)
    inventario.agregarProducto(p3)
    inventario.mostrarProductos()
}
