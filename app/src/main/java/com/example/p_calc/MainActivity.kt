package com.example.p_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.p_calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val firstNumberText = StringBuilder("")
    private val secondNumberText = StringBuilder("")
    private val operatorText = StringBuilder("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun numberClicked(view : View){
        val numberString = (view as? Button)?.text.toString() ?: ""
        val numberText = if(operatorText.isEmpty()) firstNumberText else secondNumberText

        numberText.append(numberString)
        updateInputTextView()
    }

    fun clearClicked(view: View){

    }

    fun equalClicked(view: View){

    }

    fun plusClicked(view: View){

    }

    fun minusClicked(view: View){

    }


    private fun updateInputTextView(){
        binding.inputText.text = "$firstNumberText $operatorText $secondNumberText"

    }
}