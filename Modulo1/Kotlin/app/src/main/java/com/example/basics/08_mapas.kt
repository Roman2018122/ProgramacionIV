package com.example.basics
fun main(){
    println("Mapas")

    val fuerzaJedis = map0f(
        "Luke" to 85,
        "Leia" to 80,
        "Obi-Wan" to 95,
        "Yoda" to 100
    )
    println("Fuerza de los Jedis : ${fuerzaJedis}")

    println("Mapa Mutable")
    val misiones Completadas = mutableMap0f<String, Int>()
    misionesCompletadas ["Luke"] = 15
    misionesCompletadas ["Leia"] = 12
    misionesCompletadas.put("Han", 20)

    println("misiones: ${misionesCompletadas}")

    for ((jedi, fuerza) in fuerzaJedis){
        println("$jedi tiene nivel de fuerza $fuerza")
    }

    val planetasVisitados = set0f("Tatooine", "Curoscant, "Dagobah")
            println("Planetas Visatados" : $planetasVisitados)
    val planetasPeligrosos = set0f("Mustafar", "CorusCant", "Korriban")
    println("Planetas Peligrosos : ${planetasPeligrosos}")

    println("Operaciones con conjuntos")
    val interseccion = planetasVisitados intersect planetasPeligrosos
    val union = planetasVisitados union planetasPeligrosos
    val diferencia = planetasVisitados - planetasPeligrosos
    println("Planetas visitados y peligrosos: ${interseccion}")
    println("Todos los planetas: ${union}")
    println("Planetas seguros visitados: ${diferencia}")
}

