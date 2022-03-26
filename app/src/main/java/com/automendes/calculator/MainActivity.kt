package com.automendes.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewDisplay = findViewById<TextView>(R.id.TextViewDisplay)
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "1"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "1"
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "2"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "2"
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "3"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "3"
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "4"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "4"
        }

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "5"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "5"
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "6"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "6"
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "7"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "7"
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "8"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "8"
        }

        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            if (textViewDisplay.text == "0")
                textViewDisplay.text = "9"
            else
                textViewDisplay.text = textViewDisplay.text.toString() + "9"
        }
    }
}