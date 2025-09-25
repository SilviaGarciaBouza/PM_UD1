package practicas.practica22

fun main(){
    val tasks = listOf(
        Task("Comprar pan"),
        Task("Estudiar lambdas"),
        Task("Practicar infix"),
        Task("Estudiar funciones de extensión", completed = true),
        Task("Ver Kotlin en YouTube", completed = true)
    )



    println("Todas las tareas:")
    tasks.printTasks(tasks)

    println("\nTareas pendientes:")
    val pending = filterTask(tasks) { !it.completed }
    pending.printTasks(pending)

    println("\nTareas completadas:")
    val finished = filterTask(tasks) { it.completed }
    finished.printTasks(finished)

    println("\nComparación de títulos:")
    val t1 = tasks[0]
    val t2 = tasks[3]
    println("¿'${t1.title}' y '${t2.title}' tienen el mismo título? -> ${t1 sameTitleAs t2}")
}

data class Task(var title:String, var completed:Boolean = false)

fun filterTask( lista:List<Task>, criterio:(Task)->Boolean): List<Task>{
    return lista.filter (criterio )
}

fun List<Task>.printTasks(lista:List<Task>){
    lista.forEach { e-> if(e.completed) println("${e.title} [x]") else println("${e.title} [ ]") }
}
 infix fun Task.sameTitleAs(task:Task): Boolean{
    return (task.title==this.title)//no hace falta el this
}