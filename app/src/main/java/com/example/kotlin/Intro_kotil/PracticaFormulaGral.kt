package com.example.kotlin.Intro_kotil

import kotlin.math.sqrt

fun main() {
    var repetir: Int

    do {
        print("Ingresa el valor de a: ")
        val a = readLine()?.toDoubleOrNull() ?: 0.0

        print("Ingresa el valor de b: ")
        val b = readLine()?.toDoubleOrNull() ?: 0.0

        print("Ingresa el valor de c: ")
        val c = readLine()?.toDoubleOrNull() ?: 0.0

        val discriminante = b * b - 4 * a * c

        if (a == 0.0) {
            println("No es una ecuación cuadrática (a no puede ser 0).")
        } else if (discriminante < 0) {
            println("No hay raíces reales.")
        } else {
            val raiz1 = (-b + sqrt(discriminante)) / (2 * a)
            val raiz2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Las raíces son: $raiz1 y $raiz2")
        }

        print("¿Quieres calcular otra ecuación? (1 = sí, 0 = no): ")
        repetir = readLine()?.toIntOrNull() ?: 0

    } while (repetir != 0)

    println("Programa terminado.")
}
