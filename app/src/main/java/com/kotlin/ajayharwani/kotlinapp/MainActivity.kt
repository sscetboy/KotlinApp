package com.kotlin.ajayharwani.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showDatatypes();
    }

    private fun showDatatypes() {

        var int: Int
        var str: String
        var double: Double

        var int2 = 1
        var str2 = "str"
        var double2 = 123.12

        print("Values :: ")
        println(int2)
        println(str2)
        println(double2)

        if(str2 is String) {
            println("str2 is String")
        }


        // UnderScore in Numeric
        var long : Long
        long = 5454_1234_2356_9845

        println(long)


        //
        val a: Int = 10000
        println(a === a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

        val a2: Int = 10000
        println(a2 == a2) // Prints 'true'
        val boxedA2: Int? = a2
        val anotherBoxedA2: Int? = a2
        println(boxedA2 == anotherBoxedA2) // Prints 'true'
    }
}
