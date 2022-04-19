package com.example.homework__n3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val myLog: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(myLog, "onCreate")

        button2Next.setOnClickListener {
            val name: String = editTextTextPersonName2.text.trim().toString()
            if (name.isEmpty()) {
                Toast.makeText(this, "Empty name!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent: Intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            finish()
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(myLog, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(myLog, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(myLog, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(myLog, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(myLog, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(myLog, "onDestroy")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
}
