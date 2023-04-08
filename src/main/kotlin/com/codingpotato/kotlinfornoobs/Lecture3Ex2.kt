package com.codingpotato.kotlinfornoobs

class Lecture3Ex2 {

    fun init() {

        print("Please type a number: ")

        val number:Int = readLine()!!.toInt();

        if (number % 2 == 0) {
            println("The number $number is even.")
        } else {
            println("The number $number is odd.")
        }

    }

}