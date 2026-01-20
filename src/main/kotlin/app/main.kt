package app

import kotlin.random.Random

fun generarCodigo(): Int {
    return Random.nextInt(1, Int.MAX_VALUE)
}

fun main() {

    val hola = generarCodigo()
    print(hola)

}