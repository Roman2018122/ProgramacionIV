package app.practice.movile_app

fun main(){
    for (bateria in 100 downTo 0 step 10){
          when (bateria) {
            100 -> println("100% Carga completa")
            50 -> println("50'%  Media carga")
            10 -> println("10% Conectar cargador")
            0 -> println("0% Apagando")
            else println("$bateria%")
        }
    }
}

// bateria = 100
//
//
//        simulacion de bateria del celular
//        partir 100% y decrementar hasta el 09 en pasos de 10 ,
//        mostrando distintos mensajes en cada nivel
//        100% cargado
//        50-> mitad de bateria
//        10-> conecte el cargador
//        0-> apagado