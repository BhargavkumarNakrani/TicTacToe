package com.rku.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

var singleUser = false

class Firstpage : AppCompatActivity() {

    lateinit var singlePlayerBtn: Button
    lateinit var multiPlayerBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        singlePlayerBtn = findViewById(R.id.idBtnSinglePlayer)
        multiPlayerBtn = findViewById(R.id.idBtnMultiPlayer)

        singlePlayerBtn.setOnClickListener {
            singleUser = true;
            startActivity(Intent(this, MainActivity::class.java))
        }
        multiPlayerBtn.setOnClickListener {
            singleUser = false;
            startActivity(Intent(this, SecondPage::class.java))
        }
    }

    override fun onBackPressed() {
        ActivityCompat.finishAffinity(this)
    }
}