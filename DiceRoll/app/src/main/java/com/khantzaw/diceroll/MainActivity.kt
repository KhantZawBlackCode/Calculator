package com.khantzaw.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Amount : TextView   = findViewById(R.id.Amount)     // Original Amount
        var bet : EditText      = findViewById(R.id.bet)        // Your bet Amount
        var click : Button      = findViewById(R.id.click)      // Button
        var dice : ImageView    = findViewById(R.id.dice)       // Dice Image

        var yourBet : Int
        var orgAmount : Int
        Amount.text = 1000.toString()

        click.setOnClickListener(){
            if (bet.text.isEmpty()){
                bet.error = "Please enter your bet amount!"
            }else{
                yourBet = bet.text.toString().toInt()
                orgAmount = Amount.text.toString().toInt()

                if (yourBet <= orgAmount){
                    var random: Int = (1 + Math.random() * 6).toInt()
                    when(random){
                        1 -> {
                            dice.setImageResource(R.drawable.one)
                            orgAmount -= yourBet
                        }
                        2 -> {
                            dice.setImageResource(R.drawable.two)
                            orgAmount -= yourBet
                        }
                        3 -> {
                            dice.setImageResource(R.drawable.three)
                            orgAmount = orgAmount
                        }
                        4 -> {
                            dice.setImageResource(R.drawable.four)
                            orgAmount += yourBet
                        }
                        5 -> {
                            dice.setImageResource(R.drawable.five)
                            orgAmount += yourBet
                        }
                        6 -> {
                            dice.setImageResource(R.drawable.six)
                            orgAmount += yourBet * 2
                        }
                    }
                    Amount.text = orgAmount.toString()
                    bet.text.clear()
                }else{
                    bet.error = "Please enter your bet amount!"
                }
            }
        }

    }
}
