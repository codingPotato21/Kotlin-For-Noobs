package com.codingpotato.kotlinfornoobs

import java.time.LocalDate
import java.time.Period

class Lectrue4P1Ex1 {

    fun init() {

        println("Welcome to the Hospital Demo Exercise")

        val name = getName()
        val dob = getDOB()
        val ageInDays = calculateAgeInDays(dob)

        println("Patient's name: $name")
        println("Patient's Date of birth: $dob")
        println("Patient's Age: ${getAge(dob)}")
        println("Patient's Age in days: $ageInDays")

    }

    fun getName(): String {
        print("Please enter the patient's name: ")
        return readLine()!!.toString()
    }

    fun getDOB(): LocalDate {
        print("Please enter the patient's date of birth in YYYY-MM-DD format: ")
        val dobString = readLine()
        return LocalDate.parse(dobString)
    }

    fun calculateAgeInDays(dob: LocalDate): Long {
        val today = LocalDate.now();
        return today.toEpochDay() - dob.toEpochDay();
    }

    fun getAge(dob: LocalDate): Int {
        val today = LocalDate.now()
        return Period.between(dob, today).years
    }

}