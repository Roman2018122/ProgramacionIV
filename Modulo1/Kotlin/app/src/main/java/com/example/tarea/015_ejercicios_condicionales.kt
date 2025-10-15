package com.example.basics.tarea

// Condicionales
//Pide temperatura actual (°C) y preferencia del usuario: “frío”, “templado” o
//“caliente”.
//o Si pref. = “frío” y temp > 22 → “Encender aire”
//o Si pref. = “caliente” y temp < 18 → “Encender calefacción”
//o Si pref. = “templado” y 18–22 → “En confort”
//o En otros casos → “Ventilar”
fun main(){
    print("Temperatura actual: ")
    val temperatura = readLine()?.toDouble() ?: 0.0
    print("preferencia de clima: frio/templado/caliente ")
    val preferencia = readLine()?.lowercase() ?: ""

    if (temperatura > 22 && preferencia == "frio"){
        println("Encender aire")}
    else if (temperatura < 18 && preferencia == "caliente"){
        println("Encender calefaccion")}
    else if (temperatura in 18.0..22.0 && preferencia == "templado"){
    println("En confort")}
    else{
    println("Ventilar")
    }
}



