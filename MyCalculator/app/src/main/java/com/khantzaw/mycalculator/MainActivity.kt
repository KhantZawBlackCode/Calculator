package com.khantzaw.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var first: EditText     = findViewById(R.id.first)
        var second: EditText    = findViewById(R.id.second)
        var result: TextView    = findViewById(R.id.result)
        var add: Button         = findViewById(R.id.add)
        var sub: Button         = findViewById(R.id.sub)
        var multiply: Button    = findViewById(R.id.multiply)
        var dev: Button         = findViewById(R.id.dev)
        var dev2: Button        = findViewById(R.id.dev2)
        var clear: Button       = findViewById(R.id.clear)
        var exit: Button        = findViewById(R.id.exit)

        var firstNum : Int
        var secondNum : Int
        var total : Int = 0

        add.setOnClickListener(){
            firstNum = first.text.toString().toInt()
            secondNum = second.text.toString().toInt()
            total = firstNum + secondNum
            result.text = total.toString()
        }

        sub.setOnClickListener(){
            firstNum = first.text.toString().toInt()
            secondNum = second.text.toString().toInt()
            total = firstNum - secondNum
            result.text = total.toString()
        }

        multiply.setOnClickListener(){
            firstNum = first.text.toString().toInt()
            secondNum = second.text.toString().toInt()
            total = firstNum * secondNum
            result.text = total.toString()
        }

        dev.setOnClickListener(){
            firstNum = first.text.toString().toInt()
            secondNum = second.text.toString().toInt()
            total = firstNum / secondNum
            result.text = total.toString()
        }

        dev2.setOnClickListener(){
            firstNum = first.text.toString().toInt()
            secondNum = second.text.toString().toInt()
            total = firstNum % secondNum
            result.text = total.toString()
        }

        clear.setOnClickListener(){
            first.text.clear()
            second.text.clear()
            result.text= "0000"
        }

        exit.setOnClickListener(){
            finish()
        }
    }
}