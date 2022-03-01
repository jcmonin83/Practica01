package com.pp.practica01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class ExponenteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exponente)
    }

    fun exponenteClick(view: View) {
        if(!findViewById<EditText>(R.id.txtBase).text.toString().isNullOrEmpty() ){

            var resultV = Intent(this@ExponenteActivity,Resultado::class.java)
            var expBundle = Bundle()
            expBundle.putInt("operacion", 3)
            expBundle.putDouble("base", findViewById<EditText>(R.id.txtBase).text.toString().toDouble() )
            expBundle.putDouble("exponente", findViewById<EditText>(R.id.txtPotencia).text.toString().toDouble() )
            resultV.putExtras(expBundle)
            startActivity(resultV)
        }else {
            Toast.makeText(this@ExponenteActivity,getString(R.string.lgndZero), Toast.LENGTH_SHORT).show()
        }

    }
}