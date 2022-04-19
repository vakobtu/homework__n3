package com.example.homework__n3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        textViewName.text = intent.extras?.getString("NAME", "")
        textViewLastName.text = intent.extras?.getString("LASTNAME", "")
        textViewAddress.text = intent.extras?.getString("ADDRESS", "")
    }
}