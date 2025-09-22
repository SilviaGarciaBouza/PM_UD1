package teoria.poo

class Animal (
    val name: String,
    var age: Int

) {

    val isOlderThanOne
        get()=this.age >1

    var overweight=false
    var weight=0.0
        set(value){
            field=value//es el valor real de ahora de weight
            overweight= value >100
        }
}
