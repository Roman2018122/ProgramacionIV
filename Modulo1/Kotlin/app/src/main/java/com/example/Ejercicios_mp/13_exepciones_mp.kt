fun main() {
    val cupos = 5
    var asistentes = 0

    try {
        val registrar = 6
        if (asistentes + registrar > cupos) throw Exception("No hay cupos suficientes")
        asistentes += registrar
        println("Asistentes registrados: $asistentes")
    } catch (e: Exception) {
        println(e.message)
    }
}
