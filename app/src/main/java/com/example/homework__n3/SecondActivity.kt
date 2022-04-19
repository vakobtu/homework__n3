package com.example.homework__n3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("NAME", "")

        button2Next.setOnClickListener{
            val lastName: String = editTextPersonLastName.text.trim().toString()

            if (lastName.isEmpty()){
                Toast.makeText(this, "Input your last Name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent: Intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            finish()
            startActivity(intent)
        }
    }
}