package practicas.practica22

class Inventario2 {
    // Diccionario que guarda los productos con su ID
  //  private val productos = mutableMapOf<String, Producto2>()

    val inventario = mutableMapOf<String, Producto2>()


    // Agregar un producto al inventario
    fun agregarProducto(id: String, producto: Producto2) {
        inventario.put(id, producto)
    }

    // Actualizar el precio de un producto existente
    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        inventario.filter { e -> e.key == id }.forEach { e -> e.value.precio = nuevoPrecio }
    }

    // Eliminar un producto por su ID
    fun eliminarProducto(id: String) {
        inventario.remove(id)
        if(id in inventario){
            println("Se ha eliminado el producto")
        }else{
            println("El producto no existe")
        }
    }

    // Mostrar todos los productos con su nombre y precio
    fun mostrarProductos() {
     //   inventario.values....
        inventario.forEach { e -> println("${e.value.nombre} ${e.value.precio}") }
    }

    // Buscar un producto por su ID
    fun buscarProductoPorId(id: String): Producto2? {
//        inventario.filter { e -> e.key == id }.forEach { e -> return e.value }
//        return null
        return inventario[id]

    }
}
