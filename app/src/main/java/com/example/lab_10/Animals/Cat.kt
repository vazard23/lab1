package com.example.lab_10.Animals

class Cat : Animal() {

    private val color = "Grey"


    override fun sound(): String {
        return sound
    }

    override val sound: String
        get() = "Meow"

    override fun doSomething() {
        for (i in 1..5) {
            println("Sleepy cat dreaming about Fish")
        }
        println("Cat wants to sleep more, but also he wants to eat")
    }

    fun rest(){
        println("Cat is resting now")
    }

}