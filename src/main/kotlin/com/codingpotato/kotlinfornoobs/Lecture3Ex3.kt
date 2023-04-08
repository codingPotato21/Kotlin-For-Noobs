package com.codingpotato.kotlinfornoobs

class Lecture3Ex3 {

    fun init() {

        // Write a message to the user
        print("Please type kilometers: ")

        // Reading the input from the user and converting it to double from string
        val kilometers:Double = readLine()!!.toDouble();

        // Write a message to the user
        print("Please type miles: ")

        // Reading the input from the user and converting it to double from string
        val miles:Double = readLine()!!.toDouble();

        // Print the result of the conversion
        println("$kilometers KM is equal to ${ kilometers / 1.609 } miles.")

        // Print the result of the conversion
        println("$miles miles is equal to ${ miles * 1.609 } KM.")

    }

}