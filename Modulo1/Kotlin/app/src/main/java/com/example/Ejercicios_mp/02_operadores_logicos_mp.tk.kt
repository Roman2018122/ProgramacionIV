package com.example.basics.Ejercicios_mp

//verificar cupos de asistencia disponibles
fun main(){
    println("operadores_logicos")
    var asistenteEvento: Int = 200
    val mayorEdad: Boolean = true
    val disponibilidad = asistenteEvento < 200 && mayorEdad

    println("numero de asistentes: $asistenteEvento")
    println("edad del asistente: $mayorEdad")
    println("lugares disponibles: $disponibilidad")
}
