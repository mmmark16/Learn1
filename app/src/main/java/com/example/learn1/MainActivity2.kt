package com.example.learn1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.learn1.databinding.ActivityMain2Binding
import com.example.learn1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var AMBСClass2 : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AMBСClass2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(AMBСClass2.root)

    }




    fun onClickback(view: View){
        val i = Intent()
        i.putExtra("count_letter", AMBСClass2.namelong.text.toString())
        setResult(RESULT_OK, i)
        finish()
    }

}