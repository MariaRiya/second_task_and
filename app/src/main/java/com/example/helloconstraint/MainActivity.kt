package com.example.helloconstraint

import android.content.Intent
import android.graphics.Color
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
//        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
        val newIntent = Intent(this, SecondActivity::class.java)
        newIntent.putExtra("COUNT", mCount)
        startActivity(newIntent)
    }
    fun countUp(view: View) {
        if(mCount == 0){
            button_zero.setBackgroundColor(resources.getColor(R.color.yellow))
        }
        mCount++
        if(mCount % 2 == 0){
            button_count.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        }else{
            button_count.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }
        show_count.text = mCount.toString()
    }

    fun showCountToZero(view: View) {
        mCount = 0
        show_count.text = "0"
        button_zero.setBackgroundColor(resources.getColor(R.color.darkGrey))
        button_count.setBackgroundColor(resources.getColor(R.color.colorPrimary))
    }
}