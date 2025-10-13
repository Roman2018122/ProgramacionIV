package app.practice.movile_app

class FuerzaInsuficienteException(message: String) : Exception(message)
class MisionPeligrosaException(nivelPeligro: Int, message: String) : Exception(message)

fun realizarMision(
    nivelFuerza: Int,
    peligroMision: Int,
): String {
    return try {
        when {
            nivelFuerza < 30 -> throw FuerzaInsuficienteException("Nivel de fuerza muy bajo: ${nivelFuerza}")
            nivelFuerza > 30 -> throw MisionPeligrosaException(peligroMision, "Mision extremadamente peligrosa")
            else -> {"Error inseperado"}
        }
    } catch (e: FuerzaInsuficienteException){
        "error: ${e.message}. Nivel de peligro: ${e.nivelPeligro}"
    } catch (e: MisionPeligrosaException){
        "error: ${e.message}. Nivel de peligro: ${e.nivelPeligro}"
    } catch (e: Exception){
        "error: inesperado ${e.message}"
    } finally {
        "Reporte Enviado"
    }
}
fun main(){
    println(realizarMision(nivelFuerza: 20, peligroMision: 60))
    println(realizarMision(nivelFuerza: 100, peligroMision: 60))
}