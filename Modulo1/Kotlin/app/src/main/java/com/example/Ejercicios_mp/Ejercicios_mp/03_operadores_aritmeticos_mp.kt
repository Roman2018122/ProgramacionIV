package  com.example.basics

//Factura de calculo de asistentes y entradas

fun main(){
    println("Operadores aritmeticos")
    val entradasAdultos: Double = 10.0
    var entradaAdultosMayores: Double = 4.50

    //numero de adultos
    var adultos = 3
    //numero de adultos mayores
    var adultosMayores = 2

    println("Total asistentes: ${adultos + adultosMayores} ")
    println("Total adultos: ${adultos * entradasAdultos}")
    println("Total adultos mayores: ${adultosMayores * entradaAdultosMayores}")
}