package com.example

fun main(){
    println("Extructuras de control !!!")
    println("condicionales")
    val value1 = 10
    val value2 = 15

    if (value1>value2){
        println(" el mayor es  ${value1}")
    } else {
        println(" el mayor es  ${value2}")
    }
    println("Rango segun nivel de la fuerza")
    var fuerza: Int = 10
    if (fuerza > 10){
        println("Maestro")
    } else if (fuerza > 5){
        println(" caballo Jedi")
    } else{
        println("Padawan")
    }
}