package com.example.basics.tarea


//Pide un texto y recórrelo. Cuenta cuántas veces aparecen dos vocales seguidas
//(aeiou/AEIOU). Imprime el total.
fun main() {
    print("Ingrese un texto: ")
    val texto = readln().lowercase()
    val vocales = "aeiou"
    var contador = 0

    for (i in 0 until texto.length - 1) {
        if (texto[i] in vocales && texto[i+1] in vocales) {
            contador++
        }
    }
    println("Cantidad de vocales consecutivas: $contador")
}