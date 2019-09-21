package com.example.anroidproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var buttonСhet: Button = findViewById(R.id.button_chet)
    var buttonNechet: Button = findViewById(R.id.button_nechet)
    var randomNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonСhet.setOnClickListener{
            randomNumber = (0..10).shuffled().first()
            resultNumber.setText(randomNumber)
            if (randomNumber % 2 == 0) result.text = "Вы выиграли!"
            else result.text = "Вы проиграли"
        }
        buttonNechet.setOnClickListener{
            randomNumber = (0..10).shuffled().first()
            resultNumber.setText(randomNumber)
            if (randomNumber % 2 == 1) result.text = "Вы выиграли!"
            else result.text = "Вы проиграли"
        }
    }
}
