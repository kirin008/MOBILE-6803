package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
        fun main() {
            val age = 24
            val layers = 5
            printCakeCandles(age)
            printCakeTop(age)
            printCakeBottom(age, layers)
        }

        fun printCakeCandles(age: Int) {
            print (" ")
            repeat(age) {
                print(",")
            }
            println() // Print an empty line

            print(" ") // Print the inset of the candles on the cake
            repeat(age) {
                print("|")
            }
            println()
        }

        fun printCakeTop(age: Int) {
            repeat(age + 2) {
                print("=")
            }
            println()
        }

        fun printCakeBottom(age: Int, layers: Int) {
            repeat(layers) {
                repeat(age + 2) {
                    print("@")
                }
                println()
            }
        }