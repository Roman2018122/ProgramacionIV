package com.example.basics

fun main() {
    data class Evento(
        val nombre: String,
        val lugar: String,
        val fecha: String,
        val asistentes: Int = 0,
        val cuposTotales: Int,
        val ponente: String? = null
    ) {
        val estado: String
            get() = when {
                asistentes >= cuposTotales -> "Lleno"
                asistentes >= cuposTotales / 2 -> "Casi lleno"
                else -> "Disponible"
            }

        fun puedeIngresar(): Boolean = asistentes < cuposTotales
    }

    // Creamos un evento
    val taller = Evento(
        nombre = "Taller de Kotlin Básico",
        lugar = "Sala 101",
        fecha = "2025-10-15",
        cuposTotales = 30
    )

    println(taller)

    val (nombre, lugar, fecha, asistentes, cuposTotales) = taller
    println("Evento: $nombre, Lugar: $lugar, Fecha: $fecha, Cupos: $cuposTotales")
    println("Estado del evento: ${taller.estado}")
    println("¿Se puede ingresar? ${taller.puedeIngresar()}")
}
