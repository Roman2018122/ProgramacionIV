package com.example.basics.tarea


//ATM simplificado
//Saldo inicial. En bucle muestra menú: 1) Depositar 2) Retirar 3) Salir.
//o Retiro no puede dejar saldo negativo.
//o Cada operación imprime saldo actual.
//Finaliza con “Sesión terminada”.
fun main() {
    var saldo = 1000.0
    while (true) {
        println("Menú:\n1) Depositar\n2) Retirar\n3) Salir")
        when (readln()) {
            "1" -> {
                print("Ingrese monto a depositar: ")
                val deposito = readln().toDoubleOrNull() ?: 0.0
                saldo += deposito
                println("Saldo actual: $saldo")
            }
            "2" -> {
                print("Ingrese monto a retirar: ")
                val retiro = readln().toDoubleOrNull() ?: 0.0
                if (retiro > saldo) {
                    println("No puede retirar más del saldo disponible")
                } else {
                    saldo -= retiro
                    println("Saldo actual: $saldo")
                }
            }
            "3" -> {
                println("Sesión terminada")
                break
            }
            else -> println("Opción inválida")
        }
    }
}