package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonClear.setOnClickListener{
            binding.editTextNumber.text.clear()
        }

        binding.buttonDelete.setOnClickListener{
            binding.editTextNumber.setText(binding.editTextNumber.text.dropLast(1))
        }

      //  binding.buttonClear.setOnClickListener{
      //    Toast.makeText(this,"ejemplo", Toast.LENGTH_LONG).show() }
    }

    fun numberButtonClicked(view: View){
        val button = view as Button

        if(button.id.equals(binding.buttonPunto.id)){
            if(!binding.editTextNumber.text.contains('.')){
                binding.editTextNumber.text.append(button.text)
            }
        }else{
            binding.editTextNumber.text.append(button.text)
        }

  /*      when(button.id){
            binding.buttonPunto.id -> {
                if (!binding.editTextNumber.text.contains('.')){
                    binding.editTextNumber.text.append(".")
                }
            }

            binding.button0.id -> {binding.editTextNumber.text.append("0")}
            binding.button1.id -> {binding.editTextNumber.text.append("1")}
            binding.button2.id -> {binding.editTextNumber.text.append("2")}
            binding.button3.id -> {binding.editTextNumber.text.append("3")}
            binding.button4.id -> {binding.editTextNumber.text.append("4")}
            binding.button5.id -> {binding.editTextNumber.text.append("5")}
            binding.button6.id -> {binding.editTextNumber.text.append("6")}
            binding.button7.id -> {binding.editTextNumber.text.append("7")}
            binding.button8.id -> {binding.editTextNumber.text.append("8")}
            binding.button9.id -> {binding.editTextNumber.text.append("9")}

            else -> {
                Toast.makeText(this, "else", Toast.LENGTH_LONG).show()
            }
         }
*/
    }
}