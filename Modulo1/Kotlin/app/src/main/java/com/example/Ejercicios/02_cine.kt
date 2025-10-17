fun cineDescuento() {
    print("Introduce tu edad: ")
    val edad = readLine()!!.toInt()
    when {
        edad < 12 -> println("Entrada: \$3")
        edad >= 65 -> println("Entrada: \$4")
        else -> println("Entrada: \$5")
    }
}

fun main() {
    cineDescuento()
}
