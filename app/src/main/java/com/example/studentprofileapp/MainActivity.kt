package com.example.studentprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Concepts Covered: Activity lifecycle
        // Setting the XML Layout Design
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val btnShowDetails = findViewById<Button>(R.id.btnShowDetails)

        // Concepts Covered: Button click listener
        btnShowDetails.setOnClickListener {
            // Concepts Covered: Toast
            val message = getString(R.string.toast_message)
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
