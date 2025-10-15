package com.example.basics

//Busqueda de un evcnto especifico y mostrar la fecha
fun main() {
    val eventos = mapOf(
        "Conferencia Kotlin" to "12/11/2025",
        "Taller Android" to "15/11/2025",
        "Conferencia AI" to "20/11/2025"
    )
    //busqueda de evento
    val eventoBuscado = "Reunion"

    val fecha = eventos[eventoBuscado]

    if (fecha != null){
        println("Evento buscado:${eventoBuscado} con fecha: ${fecha}")
    }
    else{
        println("Evento: ${eventoBuscado}, no encontrado")
    }
}