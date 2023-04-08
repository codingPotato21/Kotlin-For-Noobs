package com.codingpotato.kotlinfornoobs

class Main {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            while (true) {

                // Prints the header
                println("\n" +
                        "+-------------------------------------------+\n" +
                        "|  Welcome to Kotlin For Noobs Examples <3  |\n" +
                        "+-------------------------------------------+\n"
                )

                // Prints the menu
                println(
                    "# Lecture 3 Examples\n" +
                            "1- Positive/Negative number checker\n" +
                            "2- Even/odd number checker\n" +
                            "3- Kilometers to Miles Converter\n" +
                            "4- Factorial calculator\n" +
                            "5- Number guessing game"
                )

                // Get the user choice
                print("\nPlease type a choice: ")
                val choice: Int = readLine()!!.toInt();

                // Choice logic
                when (choice) {

                    1 -> Lecture3Ex1().init()
                    2 -> Lecture3Ex2().init()
                    3 -> Lecture3Ex3().init()
                    4 -> Lecture3Ex4().init()
                    5 -> Lecture3Ex5().init()

                }

            }

        }

    }

}