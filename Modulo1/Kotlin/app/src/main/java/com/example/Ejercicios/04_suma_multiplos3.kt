fun sumaMultiplosDe3() {
    print("Introduce un número N: ")
    val N = readLine()!!.toInt()
    var suma = 0
    for (i in 1..N) {
        if (i % 3 == 0) suma += i
    }
    println("La suma de los múltiplos de 3 hasta $N es $suma.")
}

fun main() {
    sumaMultiplosDe3()
}
