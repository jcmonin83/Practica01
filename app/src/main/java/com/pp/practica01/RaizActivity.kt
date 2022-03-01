package com.pp.practica01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class RaizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raiz)
    }

    fun raizClick(view: View) {
        if(!findViewById<EditText>(R.id.txtRadicando).text.toString().isNullOrEmpty() && findViewById<EditText>(R.id.txtRadicando).text.toString().toInt() > 0){

            var resultV = Intent(this@RaizActivity,Resultado::class.java)
            var raizBundle = Bundle()
            raizBundle.putInt("operacion", 2)
            raizBundle.putFloat("radicando", findViewById<EditText>(R.id.txtRadicando).text.toString().toFloat() )
            resultV.putExtras(raizBundle)
            startActivity(resultV)
        }else {
            Toast.makeText(this@RaizActivity,getString(R.string.lgndZero),Toast.LENGTH_SHORT).show()
        }
    }
}