package com.example.roledice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById<Button>(R.id.roll_button)
        diceImage = findViewById<ImageView>(R.id.result)
        button.setOnClickListener {
            Toast.makeText(this,rollDice(),Toast.LENGTH_SHORT).show()
        }
    }
    fun rollDice():String{
        val randomInt:Int = Random.nextInt(6)+1
       val drawableResource = when(randomInt){
           1->R.drawable.dice_1
           2->R.drawable.dice_2
           3->R.drawable.dice_3
           4->R.drawable.dice_4
           5->R.drawable.dice_5
           else -> R.drawable.dice_6
       }
        diceImage.setImageResource(drawableResource)
        return "You rolled $randomInt"
    }
}