package com.codingpotato.kotlinfornoobs

class Lecture3Ex4 {

    fun init() {

        print("Please type a number: ")

        val number:Int = readLine()!!.toInt();

        var result:Long = 1
        for (i in 1..number) {
            result *= i.toLong()
        }

        println("The factorial of $number is $result")

    }

}