fun main() {
    print("Semáforo color (rojo/amarillo/verde): ")
    val color = readLine()?.lowercase()

    print("Presionó el botón: ")
    val presionoBoton = readLine()?.lowercase()

    when (color) {
        "verde" -> {
            if (presionoBoton == "si") {
                println("Espera a rojo")
            } else {
                println("Espera")
            }
        }
        "rojo" -> {
            println("Cruza")
        }
        "amarillo" -> {
            println("Prepárate")
        }
        else -> {
            println("Espera")
        }
    }
}
