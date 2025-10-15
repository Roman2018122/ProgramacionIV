package com.example.basics.tarea

//Control de acceso por horario
//Entrada: hora (0–23) y rol (“admin”, “invitado”, “empleado”).
//o Invitado solo entre 9–17 → “Permitido/Denegado”.
//o Empleado entre 6–20.
//o Admin siempre.

fun main() {
    print("Ingrese la hora actual (0–23): ")
    val hora = readLine()?.toInt() ?: 0

    print("Ingrese su rol (admin / invitado / empleado): ")
    val rol = readLine()?.lowercase() ?: ""

    if (rol == "admin") {
        println("Acceso permitido")
    } else if (rol == "invitado" && hora in 9..17) {
        println("Acceso permitido")
    } else if (rol == "empleado" && hora in 6..20) {
        println("Acceso permitido")
    } else {
        println("Acceso denegado")
    }
}