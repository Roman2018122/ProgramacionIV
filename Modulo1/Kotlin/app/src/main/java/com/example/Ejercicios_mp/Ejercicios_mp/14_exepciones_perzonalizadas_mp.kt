class CuposInsuficientesException(message: String) : Exception(message)
class EventoLlenoException(cupos: Int, message: String) : Exception(message) {
    val cuposDisponibles = cupos
}

fun registrarAsistentes(asistentesNuevos: Int, asistentesActuales: Int, cuposTotales: Int): String {
    return try {
        when {
            asistentesNuevos < 0 -> throw CuposInsuficientesException("Cantidad de asistentes inválida: $asistentesNuevos")
            asistentesActuales + asistentesNuevos > cuposTotales ->
                throw EventoLlenoException(cuposTotales - asistentesActuales, "No hay suficientes cupos")
            else -> "Asistentes registrados correctamente: $asistentesNuevos"
        }
    } catch (e: EventoLlenoException) {
        "Error: ${e.message}. Cupos disponibles: ${e.cuposDisponibles}"
    } catch (e: CuposInsuficientesException) {
        "Error: ${e.message}"
    } finally {
        println("Reporte de registro enviado")
    }
}

fun main() {
    println(registrarAsistentes(10, 25, 30))
    println(registrarAsistentes(-5, 0, 30))
    println(registrarAsistentes(5, 10, 30))
}
