package com.codingpotato.kotlinfornoobs

import kotlin.random.Random


class Lecture3Ex5 {

    fun init() {

        // Print the header
        println("Welcome to number guessing game")

        // Generate a random number
        val numberToGuess = Random.nextInt(0, 6)

        // Get the user guess
        print("Please type your guess between (1 - 5): ")
        var guess:Int = readLine()!!.toInt()

        // loop for when the guess is wrong
        var numberOfTries = 1
        while (numberToGuess != guess) {

            println("Sorry your guess is wrong!")

            if (numberOfTries == 4) {
                break
            } else if (guess < numberToGuess) {
                println("Your guess is lower than the number!")
            } else {
                println("Your guess is higher than the number!")
            }

            print("Please guess again between (1 - 5): ")
            guess = readLine()!!.toInt()

            numberOfTries++

        }

        // Win or lose message with stats
        if (numberToGuess == guess) {
            println("Congratulations you won! The number is $numberToGuess")
            println("You took $numberOfTries guesses to win.")
        } else {
            println("Sorry you lost! The number is $numberToGuess")
            println("You used up all of the $numberOfTries attempts and lost.")
        }

        println("GAME OVER")

    }

}