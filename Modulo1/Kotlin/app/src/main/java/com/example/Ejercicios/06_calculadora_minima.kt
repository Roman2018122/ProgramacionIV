fun calculadora() {
    while (true) {
        println("1) Sumar\n2) Restar\n3) Salir")
        when (readLine()!!.toInt()) {
            1 -> {
                print("Introduce el primer número: ")
                val a = readLine()!!.toFloat()
                print("Introduce el segundo número: ")
                val b = readLine()!!.toFloat()
                println("Resultado: ${a + b}")
            }
            2 -> {
                print("Introduce el primer número: ")
                val a = readLine()!!.toFloat()
                print("Introduce el segundo número: ")
                val b = readLine()!!.toFloat()
                println("Resultado: ${a - b}")
            }
            3 -> {
                println("Saliendo...")
                return
            }
            else -> println("Opción no válida.")
        }
    }
}

fun main() {
    calculadora()
}
