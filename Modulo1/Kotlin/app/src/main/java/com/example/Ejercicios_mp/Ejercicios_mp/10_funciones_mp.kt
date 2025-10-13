package com.example.basics

fun saludar(){
    println("Bienvenido al gestor de eventos y conferencias")
}

fun sumarAsistentes(evento1: Int, evento2: Int): Int{
    return evento1 + evento2
}
fun cuadrado(cupos: Int) = cupos * 2

fun resumenEvento(asistentes: Int, cuposTotales: Int): Pair<Int, Int> {
    val cuposRestantes = cuposTotales - asistentes
    return Pair(asistentes, cuposRestantes)
}

fun main() {
    saludar()
    println("Total Asitentes: ${sumarAsistentes(5, 6)}")
    println("Cupos duplicados: ${cuadrado(50)}")
    val resumen = resumenEvento(150, 200)
    println("📊 Asistentes: ${resumen.first}, Cupos restantes: ${resumen.second}")
}