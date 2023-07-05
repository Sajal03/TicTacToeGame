package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
var singleUser = false
class Firstpage : AppCompatActivity() {

    lateinit var button11: Button
    lateinit var button12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        button11=findViewById(R.id.button11)
        button12=findViewById(R.id.button12)

        button11.setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))
            singleUser = true;
        }
        button12.setOnClickListener {
            startActivity(Intent(this , SecondPage::class.java))
            singleUser = false;
        }
    }

    override fun onBackPressed() {
        ActivityCompat.finishAffinity(this)
    }
}