package com.example.kotlin.Intro_kotil

fun main() {
    var salir = false

    do {
        println("Seleccione una opcion del menu:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")

        print("Ingrese su opcion: ")
        val opcion = readln().toInt()

        if (opcion in 1..4) {
            print("Ingrese el primer numero: ")
            val num1 = readln().toDouble()
            print("Ingrese el segundo numero: ")
            val num2 = readln().toDouble()
            var resultado = 0.0

            when (opcion) {
                1 -> resultado = num1 + num2
                2 -> resultado = num1 - num2
                3 -> resultado = num1 * num2
                4 -> {
                    if (num2 != 0.0) {
                        resultado = num1 / num2
                    } else {
                        println("Error: Division por cero")
                    }
                }
            }
            println("El resultado es $resultado")
        } else if (opcion == 5) {
            salir = true
            println("Saliendo del programa...")
        }
    } while (!salir)

}