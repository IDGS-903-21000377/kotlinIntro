package com.example.kotlin.Intro_kotil




fun sum(x: Int, y: Int): Int {
    return x + y
}
fun sum2(x: Int, y: Int): Int = x + y



fun saludo() {
    println("Hola mundo")
}
fun main() {
    saludo()
    println("________________>")
    println(sum(7, 3))
    println(sum2(8, 3))
}
