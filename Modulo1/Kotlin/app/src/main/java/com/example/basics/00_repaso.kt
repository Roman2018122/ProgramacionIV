//Escribe un programa que tome dos números (puedes usar constantes) y calcule la
// suma, resta, multiplicación, y división entre ellos. Imprime los resultados.

fun main(){
    print("Numero1: ")
    val numero1 = readLine()?.toInt()
    print("Numero2: ")
    val numero2 = readLine()?.toInt()
    println("suma ${numero1 + numero2}")
    println("suma ${numero1 - numero2}")
    println("suma ${numero1 * numero2}")
    println("suma ${numero1 / numero2}")
}

//Escribe un programa que imprima los números del 1 al 10 usando un bucle for.
fun main(){
    for i in range (0, 10)
    numeros = i + 1
    print(numeros)
}