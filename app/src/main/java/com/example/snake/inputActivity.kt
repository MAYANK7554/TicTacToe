package com.example.snake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.snake.databinding.ActivityInputBinding




class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val buttonID = findViewById<Button>(R.id.button)

        var etID1: EditText = findViewById(R.id.name1)
        var etID2: EditText = findViewById(R.id.name2)

        buttonID.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent
                .putExtra("playername1", etID1.text.toString())
                .putExtra("playername2", etID2.text.toString()))

    })
}}



