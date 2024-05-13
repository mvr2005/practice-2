package com.example.practice_2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practice_2.databinding.ActivityMainBinding
import constance.Constance

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var bindingClass : ActivityMainBinding


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bindingClass.bt1.setOnClickListener {
            val name = bindingClass.etx1.text.toString()
            Log.d("MyLog1", "это $name")
            when (name) {
                Constance.BOSS -> {
                    val textResult = "ваша зп ${Constance.BOSS_SALARY}"
                    if (bindingClass.etx2.text.toString() == Constance.BOSS_PASSWORD) {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = textResult
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_boss)
                    } else {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = "Неверный код"
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_fac)
                    }
                }
                Constance.INGENER -> {
                    val textResult = "ваша зп ${Constance.INGENER_SALARY}"
                    if (bindingClass.etx2.text.toString() == Constance.INGENER_PASSWORD) {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = textResult
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_ingener)
                    } else {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = "Неверный код"
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_fac)
                    }
                }
                Constance.CLEANER -> {
                    val textResult = "ваша зп ${Constance.CLEANER_SALARY}"
                    if (bindingClass.etx2.text.toString() == Constance.CLEANER_PASSWORD) {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = textResult
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_cleaner)
                    } else {
                        bindingClass.tx2.visibility = View.VISIBLE
                        bindingClass.tx2.text = "Неверный код"
                        bindingClass.im1.visibility = View.VISIBLE
                        bindingClass.im1.setImageResource(R.drawable.ic_fac)
                    }
                }
                else ->{
                    bindingClass.tx2.visibility = View.VISIBLE
                    bindingClass.tx2.text = "вас нет в списке"
                    bindingClass.im1.visibility = View.VISIBLE
                    bindingClass.im1.setImageResource(R.drawable.ic_fac)
                }
            }
        }

    }

}