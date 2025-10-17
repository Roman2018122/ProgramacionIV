fun promedioYaprobacion() {
    val notas = mutableListOf<Float>()
    for (i in 1..3) {
        print("Introduce la nota $i (0-20): ")
        notas.add(readLine()!!.toFloat())
    }
    val promedio = notas.average()
    if (promedio >= 14) {
        println("Promedio: $promedio. Aprobado.")
    } else {
        println("Promedio: $promedio. Reprobado.")
    }
}

fun main() {
    promedioYaprobacion()
}
