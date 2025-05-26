package com.example.kotlin.Intro_kotil

fun main() {
    print("ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        println("Debe pagar impuestos")
    }else{
        println("No debe pagar impuestos")
    }


    val mes = "2"
    when (mes) {
        "1" -> println("Enero")
        "2" -> println("Febrero")
        "3" -> println("Marzo")
        "4" -> println("Abril")
        "5" -> println("Mayo")
        "6" -> println("Junio")
        "7" -> println("Julio")
        "8" -> println("Agosto")
        "9" -> println("Septiembre")
        "10" -> println("Octubre")
        "11" -> println("Noviembre")
        "12" -> println("Diciembre")
        else -> println("Mes no valido")
    }
    print(1..5)


}