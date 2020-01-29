package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mCount: Int = 0

    private lateinit var mViewCount : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewCount = findViewById(R.id.show_count)

    }
    fun countUp(view: View){
        mCount++
        if(mViewCount !== null)
            mViewCount.text=mCount.toString()
    }

    fun showToast(view: View) {
        val toast : Toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
