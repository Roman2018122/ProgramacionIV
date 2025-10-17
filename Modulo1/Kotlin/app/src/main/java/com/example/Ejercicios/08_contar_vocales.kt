fun contarVocales() {
    print("Introduce una palabra: ")
    val palabra = readLine()!!.toLowerCase()
    val vocales = "aeiou"
    val contador = palabra.count { it in vocales }
    println("La palabra tiene $contador vocales.")
}

fun main() {
    contarVocales()
}
