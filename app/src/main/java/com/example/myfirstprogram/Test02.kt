package com.example.myfirstprogram
//
//var a =10
//fun main()
//{
//    for (i in 1..10) {
//        print(i )
//    }

    open class Dog {                // 1
        open fun sayHello() {       // 2
            println("wow wow!")
        }
    }

    class Yorkshire : Dog() {       // 3
        override fun sayHello() {   // 4
            println("wif wif!")
        }
    }

    fun main() {
        val dog: Dog = Yorkshire()
        dog.sayHello()
    }



