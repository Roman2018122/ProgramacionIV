package com.example.basics.tarea


//Cola de supermercado
//En un while pide “nuevo cliente (total) o fin”. Si total > 100 aplica 5% desc.; si
//lleva más de 10 ítems, mensaje “Caja rápida no disponible”. Acumula venta del
//día y al final muestra total y cantidad de clientes.
fun main() {
    var totalDia = 0.0
    var cantidadClientes = 0

    while (true) {
        print("Ingrese total del cliente o 'fin' para terminar: ")
        val entrada = readln()
        if (entrada.lowercase() == "fin") break

        val totalCliente = entrada.toDoubleOrNull() ?: continue
        print("Ingrese cantidad de items: ")
        val items = readln().toIntOrNull() ?: continue

        var totalFinal = totalCliente
        if (totalCliente > 100) {
            totalFinal *= 0.95
        }
        if (items > 10) {
            println("Caja rapida no disponible")
        }

        totalDia += totalFinal
        cantidadClientes++
    }

    println("Total del día: $totalDia")
    println("Cantidad de clientes atendidos: $cantidadClientes")
}