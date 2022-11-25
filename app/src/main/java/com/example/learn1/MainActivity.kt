package com.example.learn1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.learn1.constant.Password
import com.example.learn1.constant.Post
import com.example.learn1.constant.Salary
import com.example.learn1.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var AMBСClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AMBСClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(AMBСClass.root)
        AMBСClass.printButton.setOnClickListener(){
            AMBСClass.payText.visibility = View.VISIBLE
            AMBСClass.workerphoto.visibility = View.VISIBLE
            val name = AMBСClass.writeName.text.toString()
            when(name){
                Post.DIRECTOR -> {
                    if (AMBСClass.passwordwrite.text.toString().toInt() == Password.DIRECTOR_PASSWORD){
                        val text = "Вот ваши ${Salary.DIRECTOR_SALARY}$ получите и распишитесь"
                        AMBСClass.payText.text =  text
                        AMBСClass.workerphoto.setImageResource(R.drawable.face)
                    }
                    else{
                        AMBСClass.payText.text =  "Неверный пароль"
                        AMBСClass.workerphoto.setImageResource(R.drawable.error)
                    }
                }

                Post.DEVELOPER -> {
                    if (AMBСClass.passwordwrite.text.toString().toInt() == Password.DEVELOPER_PASSWORD){
                        val text = "Вот ваши ${Salary.DEVELOPER_SALARY}$ получите и распишитесь"
                        AMBСClass.payText.text =  text
                        AMBСClass.workerphoto.setImageResource(R.drawable.face_1) }
                    else{
                        AMBСClass.payText.text =  "Неверный пароль"
                        AMBСClass.workerphoto.setImageResource(R.drawable.error)
                    }
                }

                Post.MANAGER -> {
                    if (AMBСClass.passwordwrite.text.toString().toInt() == Password.MANAGER_PASSWORD){
                        val text = "Вот ваши ${Salary.MANAGER_SALARY}$ получите и распишитесь"
                        AMBСClass.payText.text =  text
                        AMBСClass.workerphoto.setImageResource(R.drawable.face_2)
                    }
                    else{
                        AMBСClass.payText.text =  "Неверный пароль"
                        AMBСClass.workerphoto.setImageResource(R.drawable.error)
                    }
                }

              else -> {
                  AMBСClass.payText.text = "Такого работника нет иди отсюда"
              }
            }
        }
    }
}