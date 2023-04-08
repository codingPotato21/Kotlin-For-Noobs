package com.codingpotato.kotlinfornoobs

class Lecture3Ex1 {

    fun init() {

        print("Please type a number: ")

        val number:Int = readLine()!!.toInt();

        if (number < 0) {
            println("The number $number is a negative number.")
        } else if (number == 0) {
            println("The number $number is zero!")
        } else {
            println("The number $number is a positive number.")
        }

    }

}