fun estadoDelAgua() {
    print("Introduce la temperatura en °C: ")
    val temperatura = readLine()!!.toFloat()
    when {
        temperatura <= 0 -> println("Estado del agua: Sólido")
        temperatura in 1.0..99.0 -> println("Estado del agua: Líquido")
        else -> println("Estado del agua: Gas")
    }
}

fun main() {
    estadoDelAgua()
}
