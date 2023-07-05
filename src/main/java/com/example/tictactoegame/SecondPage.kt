package com.example.tictactoegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
var Online = true;
class SecondPage : AppCompatActivity() {

    lateinit var buttonOnline: Button
    lateinit var buttonOffline: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        buttonOnline=findViewById(R.id.buttonOnline)
        buttonOffline=findViewById(R.id.buttonOffline)

        buttonOnline.setOnClickListener {
            startActivity(Intent(this , CodeActivity::class.java))
            singleUser = true;
            Online = true;
        }
        buttonOffline.setOnClickListener {
            startActivity(Intent(this , MainActivity::class.java))
            singleUser = false;
            Online = false;
        }
    }
}