package practicas

data class Empleado(val nombre:String, val salario:Double, val departamento: String)

fun main(){
    val listaEmpleados= listOf<Empleado>(
        Empleado("Fernando", 3000.00, "Dirección"),
        Empleado("Alfonso", 2000.00, "Ventas"),
        Empleado("Nuria", 1000.00, "Programación"),
        Empleado("Alex", 3500.00, "Ventas"),
        Empleado("Martin", 3050.00, "Dirección"),
        Empleado("Angel", 2000.00, "Programación"),
        Empleado("Pablo", 2000.00, "Ventas"),
        Empleado("Leo", 3070.00, "Dirección"),
        Empleado("Sonia", 1070.00, "Programación"),
        Empleado("Ana", 5090.00, "Dirección"),
    )
    //mas soluciones en sus ejemplos
//1. Obtener el nombre del de mas dinero
    val empSalarioALto= (procesarEmpleados(listaEmpleados, { listaEmpleados.filter{e->e.salario== listaEmpleados.maxOf { empleado -> empleado.salario }}.get(0).nombre}))
    println("Empleado con salario más alto: $empSalarioALto")

    //2. Cálculo del Promedio de Salario en Ventas
    val promedioVentasSalario= procesarEmpleados(listaEmpleados,{listaEmpleados.filter { e->e.departamento=="Ventas" }.map { e->e.salario }.average()})
    println("Promedio de salario en Ventas: $promedioVentasSalario")

    //3. Lista de Nombres con Salario Mayor a 2500
    val listaSalariomasDe2500= procesarEmpleados(listaEmpleados, {listaEmpleados.filter { e->e.salario>=2500}.map{e->e.nombre}})
    println("Nombres con salario >= 2500: $listaSalariomasDe2500")

    //4. Agrupar por departamento
    val empleadosPorDep=procesarEmpleados(listaEmpleados, {listaEmpleados.groupBy { it.departamento }.mapValues { e->e.value.map{e->e.nombre} }})
    println("Empleados por departamento: $empleadosPorDep")

}

fun procesarEmpleados(empleados:List<Empleado>, operacion:(List<Empleado>)->Any):Any{
    return operacion(empleados)
}

