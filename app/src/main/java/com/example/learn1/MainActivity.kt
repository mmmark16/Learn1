package com.example.learn1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.example.learn1.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var AMBСClass : ActivityMainBinding
    private var launcher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AMBСClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(AMBСClass.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result: ActivityResult ->
            if (result.resultCode == RESULT_OK){
                val test = result.data?.getStringExtra("count_letter")
                AMBСClass.textView5.text = result.data?.getStringExtra("count_letter")
            }
        }
    }

    fun onClickone(view: View){
        launcher?.launch(Intent(this, MainActivity2::class.java))
    }

}