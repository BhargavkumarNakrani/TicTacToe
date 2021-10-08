package com.rku.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secondpage.*

var Online = true;

class SecondPage : AppCompatActivity() {

    lateinit var buttonOffline : Button
    lateinit var buttonOnline : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        buttonOffline = findViewById(R.id.buttonOffline)
        buttonOnline = findViewById(R.id.buttonOnline)

        buttonOnline.setOnClickListener {
            startActivity(Intent(this, CodeActivity::class.java))
            singleUser = false;
            Online = true;
        }
        buttonOffline.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            singleUser = false;
            Online = false;
        }
    }
}