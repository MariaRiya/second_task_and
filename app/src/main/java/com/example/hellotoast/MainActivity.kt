package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        mCount++
        show_count.text = mCount.toString()
    }
}