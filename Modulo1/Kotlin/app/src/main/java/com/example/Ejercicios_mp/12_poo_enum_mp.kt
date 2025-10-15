enum class TipoEvento(val capacidad: Int) {
    TALLER(30) {
        override fun detalle() = "Taller práctico" 
               },
    CONFERENCIA(50) {
        override fun detalle() = "Conferencia magistral"
    };

    abstract fun detalle(): String
}

class Evento(val tipo: TipoEvento, val nombre: String, var asistentes: Int = 0) {
    fun registrar(n: Int) = if (asistentes + n <= tipo.capacidad) asistentes += n else println("No hay cupos")
    fun estado() = if (asistentes >= tipo.capacidad) "Lleno" else "Disponible"
}

fun main() {
    val taller = Evento(TipoEvento.TALLER, "Kotlin Básico")
    println("${taller.nombre} - ${taller.tipo.detalle()} - Estado: ${taller.estado()}")
    taller.registrar(10)
    println("Asistentes: ${taller.asistentes} - Estado: ${taller.estado()}")
}
