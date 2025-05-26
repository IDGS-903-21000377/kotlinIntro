package com.example.kotlin.Intro_kotil

class Usuarios() {
    val materia: String = ""

}

class Usuario2(val id: Int, val nombre: String){
    val materia: String = ""
}

fun main() {
    val usuario1 = Usuarios()
    val usuario2 = Usuario2(1, "Jose ")


    println(usuario2.id)
    println(usuario2.nombre)

}