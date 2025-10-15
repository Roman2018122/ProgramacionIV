package com.example.basics.tarea


//Generador de usuario
//Pide nombre y apellido. Con un bucle recorre ambos y construye un username
//alternando 2 letras del nombre y 2 del apellido.
//o Si uno se acaba, sigue con el otro.
//o Al final, si longitud < 6, agrega números consecutivos hasta 6.
fun main() {
    print("Ingrese nombre: ")
    val nombre = readln()
    print("Ingrese apellido: ")
    val apellido = readln()

    var usuario = ""
    var i = 0
    while (i < nombre.length || i < apellido.length) {
        if (i + 1 < nombre.length) usuario += nombre[i] + nombre[i+1].toString()
        else if (i < nombre.length) usuario += nombre[i]

        if (i + 1 < apellido.length) usuario += apellido[i] + apellido[i+1].toString()
        else if (i < apellido.length) usuario += apellido[i]

        i += 2
    }

    while (usuario.length < 6) {
        usuario += (usuario.length + 1)
    }

    println("Usuario generado: $usuario")
}