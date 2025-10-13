package com.example.basics

// Verificar si un  evento esta lleno
fun main() {
    var capacidadEvento = 200
    var inscritos = 200

    val eventoLleno = inscritos == capacidadEvento

    println("El evento esta lleno ?: $eventoLleno")
}
