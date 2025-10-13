package com.example.basics

//lista de eventos disponibles
fun main() {

    val eventos = listOf(
        "Conferencia Kotlin",
        "Taller Android",
        "Taller java  2025",
        "Conferencia AI",
        "Flisol 2026 "
    )

    // Imprimir los eventos
    println("Eventos disponibles:")
    for (evento in eventos) {
        println("- $evento")

    }
}

