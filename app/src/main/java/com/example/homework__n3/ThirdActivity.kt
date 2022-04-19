package com.example.homework__n3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val lastName = intent.extras?.getString("LASTNAME", "")

        finishButton.setOnClickListener{
            val address: String = editTextAddress.text.trim().toString()

            if (address.isEmpty()){
                Toast.makeText(this, "Input Please Your Address", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }


            var intent = Intent(this, FinishActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("ADDRESS", address)
            finish()
            startActivity(intent)
        }
    }

}