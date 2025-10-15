package com.example.basics.tarea


//Desde 30 hasta 0:
//o 20 → “Chequeo de sistemas”
//o 10 → “Últimos ajustes”
//o 0 → “Despegue”
//En los demás números solo imprime el número

fun main() {
    for (i in 30 downTo 0) {
        when (i) {
            20 -> println("20 → Chequeo de sistemas")
            10 -> println("10 → Últimos ajustes")
            0 -> println("0 → Despegue")
            else -> println(i)
        }
    }
}