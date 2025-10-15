package com.example.basics.tarea
import kotlin.random.Random

//. Rally de resistencia
//Empiezas con 100 de “energía”. En cada etapa (1..N), un número aleatorio 1–3
//indica el terreno:
//o 1 asfalto: −5
//o 2 tierra: −10
//o 3 barro: −15
//Si energía ≤ 0 → “Abandona en etapa X”. Si termina, “Rally completado
//con energía Y”.

fun main() {
    var energia = 100
    print("Ingrese número de etapas: ")
    val etapas = readln().toInt()

    for (i in 1..etapas) {
        val terreno = Random.nextInt(1, 4)
        energia -= when (terreno) {
            1 -> 5   // asfalto
            2 -> 10  // tierra
            3 -> 15  // barro
            else -> 0
        }
        if (energia <= 0) {
            println("Abandona en etapa $i")
            return
        }
    }
    println("Rally completado con energía $energia")
}