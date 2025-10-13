package com.example.basics
fun main(){
    println("Listas")
    val inmutable: List<Int> = list0f(1,2,3)
    println("Lista Inmutable ${inmutableLista}")

    val mutableLista: MutableList<Int> =mutableListof(4,5,6)
    println("Lista mutable ${mutableLista}")
    mutableLista.add(7)
    println("Lista Mutable ${mutableLista}")
    mutableLista.removeAt(index: 0)
    println ("Lista Mutable ${mutableLista}")

    for(mutable in mutableLista) println(mutable)

    println ("Operaciones con mutableList")
    var colores: MutableList<String> = mutableListOf<String>("rojo", "verde")
    colores.add("azul")
    colores +="amarillo"
    colores.add(1,"blanco")
    println(colores)
    colores.remove("verde")
    colores[0] = "negro"
    println(colores)
    colores.clear()
    println(colores.isEmpty())

    println("Busquedas con MutableList")
    val nombres = mutableList0f("roman", "Torres", "Jonathan")
    println(nombres.find {it.startsWith(prefix:"l")})
    println(nombres.firstNull  {it.lenght >4})
    println(nombres.any {it.contains(char:"j")})
    println(nombres.none {it == "X"})

    println("Ordenamiento con Mutable List")
    val numerosDesordenados = mutablelist0f(8,3,2,4,7,2,7,0,6)
    println(numerosDesordenados.sorted())
    println(numerosDesordenados.sortedDescending())
    println(numerosDesordenados.distinct())
}