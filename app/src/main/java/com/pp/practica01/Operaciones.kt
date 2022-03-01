package com.pp.practica01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class Operaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operaciones)
        populateSpinner()
    }

    fun populateSpinner(){
        val spinner: Spinner? = findViewById(R.id.spOptions)
        val operations: Array<String> = resources.getStringArray(R.array.operationOptions)
        if(spinner != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, operations)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter=adapter
            // spinner on item selected listener
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,view: View,position: Int,id: Long) {
                    //Toast.makeText(this@Operaciones, operations[position], Toast.LENGTH_SHORT).show()

                    when(position){
                        1 ->{
                            val intent = Intent(this@Operaciones,SumaActivity::class.java)
                            startActivity(intent)
                        }
                        2 ->{
                            val intent = Intent(this@Operaciones,RaizActivity::class.java)
                            startActivity(intent)
                        }
                        3 ->{
                            val intent = Intent(this@Operaciones,ExponenteActivity::class.java)
                            startActivity(intent)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // another interface callback
                }
            }

        }
    }
}