package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    // Declaring variables
    lateinit var editText: EditText
    lateinit var textView: TextView
    lateinit var toGenerate: Button
    lateinit var toClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // linking the variables to the widgets
        editText = findViewById(R.id.editTextNumber)
        textView = findViewById(R.id.textView)
        toGenerate = findViewById(R.id.button)
        toClear = findViewById(R.id.button2)


        // Creating a variable that will recieve user's input
        toGenerate.setOnClickListener {

            val getNum = editText.text.toString()
            if (getNum.isNotEmpty()) {
                val inputValue = getNum.toInt()


                // The variable output calls the method/funtion
                val output = figures(inputValue)

                textView.text = "You are $output"
            }

            // This will display in case the user doesnot input any number
            if (getNum.isEmpty()){
                textView.text = "Input age first"
            }


        }
        // assigning the clear button
        toClear.setOnClickListener {
            editText.text.clear()
            textView.text = ""
        }
    }

    // Creating a Method
    private  fun  figures(history: Int): String {

        return when(history) {

            22 -> "22 years old, you are the same age as Solomon Mahlangu when he passed, He was a freedom fighter and an operative of the ANC"
            28 -> "28 years old, you are the same age as Costa Titch when he passed.He was a famous rapper and dancer"
            30 -> "30 years old, Steve Biko an anti-apartheid activist was 30 years old when he passed, He was the leader and founder of the Black Consciousness Movement in the 1960s (khanyi Mlaba, 2021)"
            35 -> "35 years old, you are the same age as DJ AKA real name Kiernan Jarryd Forbes, and he was a famous music producer and rapper"
            47 -> "47 years old, You are the same as Shona Ferguson when he passed, He a famous actor and an executive producer of Ferguson Films"
            74 -> "74 years old, you are as old as Joe Mafela, famously known as Sdumo from the TV show Sgudi,’Snaysi when he died, he gained enormous fame and entertained lots of people in his lifetime"
            81 -> "81 years old, same age as our beloved Winnie Madikizela-Mandela when she passed, She was leader of the African National Congress’ Women’s League in 1993. (khanyi Mlaba, 2021) "
            91 -> "91 years old, you are the same age as Granny Helen Suzman when she passed, She a South African anti-apartheid activist, She stood as the sole representative voice for marginalized people in an all-white parliament and command to date for her bravery (khanyi Mlaba, 2021)"
            93 -> "93 years old, you are the same age as James Earl Jones who was a famous actor, and also known the voice actor of Mufasa in the animated Movie LION KING (Punch, 2024)"
            96 -> "96 years old, you are the same age as Elizabeth II when she passed, she was the Queen of the United Kingdom"

            else -> "Out of range"

        }
    }
}