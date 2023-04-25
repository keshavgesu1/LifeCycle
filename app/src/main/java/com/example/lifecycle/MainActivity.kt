package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        override fun onStart() {
            super.onStart()
            val text = "Hello onStart!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        override fun onResume() {
            super.onResume()
            val text = "Hello onResume!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }


        override fun onPause() {
            super.onPause()
            val text = "Hello onPause!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        override fun onRestart() {
            super.onRestart()
            val text = "Hello onRestart!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        override fun onStop() {
            super.onStop()
            val text = "Hello onStop!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        override fun onDestroy() {
            super.onDestroy()
            val text = "Hello onDestroy!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

    fun lifeCycleMessage(text: String) {
        val message = "Hello toast!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, message, duration)
        toast.show()
    }

}