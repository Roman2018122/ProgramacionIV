package com.example.basics

enum class TipoSable(val color: String, val poder: Int) {
    AZUL("Azul", 85) {
        override fun descripcion() = "Sable tradicional de los Jedi"
    },
    VERDE("Verde", 90) {
        override fun descripcion() = "Sable de los Jedi consultores"
    },
    ROJO("Rojo", 95) {
        override fun descripcion() = "Sable de los Sith"
    },
    MORADO("Morado", 95) {
        override fun descripcion() = "Sable equilibrio luz y oscuridad"
    };

    abstract fun descripcion(): String

    companion object {
        fun porColor(color: String) = values().find { it.color.equals(color, ignoreCase = true) }
    }
}

class SableDeLuz(val tipo: TipoSable, val portador: String) {
    fun activar() = "!ZZZrum¡ El sable color ${tipo.color} de ${portador} se enciende"
    fun info() = "${tipo.descripcion()} - tipo poder ${tipo.poder}"
}

fun main() {
    val sable = SableDeLuz(TipoSable.MORADO, "Windoo")
    println(sable)
    println(sable.activar())
    println(sable.info())

    val sableLuke = SableDeLuz(TipoSable.VERDE,  "Luky Skywalker")
    println(sableLuke)
    println(sableLuke.activar())
    println(sableLuke.info())
}