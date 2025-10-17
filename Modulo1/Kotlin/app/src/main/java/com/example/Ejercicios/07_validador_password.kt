fun validadorContraseña() {
    print("Introduce tu contraseña: ")
    val contraseña = readLine()!!
    if (contraseña.length >= 8 && contraseña.any { it.isDigit() }) {
        println("Contraseña válida.")
    } else {
        println("Contraseña no válida.")
    }
}

fun main() {
    validadorContraseña()
}
