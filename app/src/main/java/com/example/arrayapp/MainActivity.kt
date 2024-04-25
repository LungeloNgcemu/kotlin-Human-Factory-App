package com.example.arrayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var view: TextView

    var nameNumber: Int = 0
    var surnameNumber: Int = 0
    var ageNumber: Int = 0


    var names = listOf(
        "Sam",
        "Mathew",
        "Timothy",
        "Lungelo",
        "Langa",
        "Cliftom",
        "Sanele",
        "Andy",
        "Amgela",
        "Mandla"
    )
    val surnames = listOf(
        "Miller",
        "Carter",
        "Johnson",
        "Ndlovu",
        "Dlamini",
        "Peterson",
        "Khumalo",
        "Taylor",
        "White",
        "Nkosi"
    )

    val ages = listOf(
        "30",
        "25",
        "35",
        "40",
        "27",
        "32",
        "38",
        "45",
        "29",
        "33"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.press)
        view = findViewById(R.id.view)

        view.text = "Welcome to the Human Factory"

        button.setOnClickListener {

            nameNumber = Random.nextInt(0, 10)
            surnameNumber = Random.nextInt(0, 10)
            ageNumber = Random.nextInt(0, 10)

            view.text =
                " Congratulations you have created ${names[nameNumber]} ${surnames[surnameNumber]}" +
                        "\n who is ${ages[ageNumber]}  years old"

        }


    }
}