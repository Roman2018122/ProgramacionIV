package com.example.basics

//eventos programados y busqueda de un evento por indice
fun main(){
    println("listas")

    val inmutableLista = listOf("conferencia Kotlin", "Taller programacion", "conferenciaIA")
    println("Eventos programados: ${inmutableLista}")

    // busqueda de un evento por indice
    println("Primer evento: ${inmutableLista[0]}")
    println("segundo evento: ${inmutableLista[1]}")
    println("Tercer evento: ${inmutableLista[2]}")

    val mutableLista = mutableListOf("conferencia Kotlin", "Taller programacion", "conferenciaIA")
    println("Eventos Programados ${mutableLista}")
    //añadir eventos
    mutableLista.add("Flisol 2026")
    mutableLista.add("Taller Android")
    println("Lista actualizada con eventos aniadidos: ${mutableLista}")

    //remover eventos
    mutableLista.remove("conferencia Kotlin")

    println("Lista actualizada de eventos: ")
    for (evento in mutableLista) {
        println(evento)
    }

}