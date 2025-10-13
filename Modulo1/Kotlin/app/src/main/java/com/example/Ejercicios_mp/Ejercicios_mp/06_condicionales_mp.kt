package com.example.basics

// cotizar entradas para concierto en teatro

fun main(){
    println("Compra de entradas")
    var fila1 = 80
    var fila2 = 60
    var fila3 = 40
    var fila4a = 35

   //Fila elegida
    var numerofila = 2

    println("Fila elegida: ${numerofila} ")

    if (numerofila == 1) {
        println("el costo es: ${fila1}")
    }else if (numerofila == 2) {
        println("el costo es: ${fila2}")
    }else if (numerofila == 3) {
        println("el costo es: ${fila3}")
    }else{
        println("el costo es: ${fila4a}")
    }

}