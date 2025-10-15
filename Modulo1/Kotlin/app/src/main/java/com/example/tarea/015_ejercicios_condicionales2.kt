package com.example.basics.tarea

//Entrada: distancia (km) y si llueve (sí/no).
//o Si distancia ≤ 5 → base 2.5
//o Si 6–15 → base 5
//o Si > 15 → base 8
//o Si llueve, sumar 1.5.
//Imprimir “Costo total: …”.

fun main() {
    print("Distancia (km): ")
    val distancia = readLine()?.toDouble() ?: 0.0

    print("¿Llueve? (si/no): ")
    val llueve = readLine()?.lowercase() ?: ""

    var costoBase = when {
        distancia <= 5 -> 2.5
        distancia in 6.0..15.0 -> 5.0
        else -> 8.0
    }
    if (llueve == "si") {
        costoBase += 1.5
    }

    println("Costo total: $costoBase")
}