package com.example.myfirstapp
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.textView1)
        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener {
            textView.text = "Button was pressed!"
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}