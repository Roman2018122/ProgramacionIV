package com.example.basics

fun main() {
    println("VARIABLES")
    val planeta = "Tatooine"
    var jedi = "Anakin"

    jedi = "Obiwan"
    println ("Tipos de variables ")
    println ("Tipos numericos ")
    println ("Tipos entero ")
    val edad: Int = 23
    println(edad)

    println("Tipo double")
    val altura: Double = 23.5
    println(altura)

    println("Tipo float")
    val peso: Float = 23.5f
    println(peso)

    println("Tipo Long")
    val poblacion: Long = 2_000_000_000L
    println(poblacion)

    println("Tipo Char")
    val inicial: Char = '0'
    println(inicial)

    println("Tipo Logico")
    val esJedi: Boolean = true
    println(esJedi)

    println("Tipo Nulidad")
    val apellido: String? = null
    println(apellido)

    println("Tipo Nulidad")
    val ciudad: String? = ""
    println(ciudad?.length)

    println("operacion de asercion no null")
    val longitudSegura = apellido!!.length

    println("interpolacion de strings")
    val nombre: String = "Leia"
    val edadPrincesa: Int = 23
    val planetaPrincesa:  String = "Tierra"

    println("${nombre.uppercase()} nacio en ${planetaPrincesa}")
    println(" En 10 anios tendra : ${edadPrincesa+10} anios")

    println("String Multilinea")
    val mensaje: String = """
        Querido $nombre
        tu mision en $planeta
        ha sido completada exitosamente
        que la fuerza te acompañe
        
    """
    println(mensaje)

    println("Conversiones")
    val textoEdad: String = "25"
    val edadConvertida: Int = textoEdad.toInt()
    println(edadConvertida)

    val numero: Double = 50.8
    val numeroConvertido: String = numero.toString()
    println(numeroConvertido)

}