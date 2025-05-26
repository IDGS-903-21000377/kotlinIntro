package com.example.kotlin.Intro_kotil

fun main() {
    var num: Int

    do {
        print("Ingresa un número (0 para salir): ")
        num = readLine()?.toIntOrNull() ?: -1

        if (num > 0) {
            var i = 1
            do {
                var j = 0
                do {
                    print("*")
                    j++
                } while (j < i)
                println()
                i++
            } while (i <= num)
        } else if (num < 0) {
            println("Numero invalido, intenta de nuevo.")
        }
    } while (num != 0)

    println("Programa terminado.")
}
