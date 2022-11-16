package com.example.lab_10.Animals

class Cat : Animal() {

    private val color = "Grey"

    override fun sound(): String {
        return sound
    }

    override val sound: String
        get() = "Meow"

    override fun doSomething() {
        println("Sleepy cat dreams about Fish")
    }

    fun rest(){
        println("Cat is resting now")
    }

}