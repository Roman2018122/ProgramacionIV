package com.example.basics.tarea

//Entrada: meta y ahorro inicial. Cada semana sumas +10 a la cantidad semanal
//que depositas (empieza en 5). Imprime semana a semana hasta alcanzar meta.
fun main() {
    print("Ingrese meta de ahorro: ")
    val meta = readln().toDouble()
    print("Ingrese ahorro inicial: ")
    var ahorro = readln().toDouble()

    var depositoSemanal = 5.0
    var semana = 1

    while (ahorro < meta) {
        ahorro += depositoSemanal
        println("Semana $semana: ahorro acumulado = $ahorro")
        depositoSemanal += 10
        semana++
    }
    println("Meta alcanzada!")
}