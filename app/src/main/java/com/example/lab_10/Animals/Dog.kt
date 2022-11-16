package com.example.lab_10.Animals

class Dog : Animal(){

    private val color = "Black"

    override fun sound(): String {
        return sound
    }

    override val sound: String
        get() = "Bark Bark"

    override fun doSomething() {
        println("Dog is chasing it's tail")
    }

    fun chase(){
        println(color + "dog is chasing Cat")
    }

}