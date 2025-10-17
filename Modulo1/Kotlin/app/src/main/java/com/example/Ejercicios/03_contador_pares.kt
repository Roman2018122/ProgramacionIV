


fun contarPares() {
    print("Introduce un número N: ")
    val N = readLine()!!.toInt()
    var contador = 0
    for (i in 1..N) {
        if (i % 2 == 0) contador++
    }
    println("Hay $contador números pares entre 1 y $N.")
}

fun main() {
    contarPares()
}
