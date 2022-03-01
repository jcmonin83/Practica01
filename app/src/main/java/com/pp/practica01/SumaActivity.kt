package com.pp.practica01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SumaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)
    }

    fun sumaClick(view: View) {
        if(!findViewById<EditText>(R.id.txtSumando01).text.toString().isNullOrEmpty() && !findViewById<EditText>(R.id.txtSumando02).text.toString().isNullOrEmpty()){

            var resultV = Intent(this@SumaActivity,Resultado::class.java)
            var sumaBundle = Bundle()
            sumaBundle.putInt("operacion", 1)
            sumaBundle.putInt("sumando01", findViewById<EditText>(R.id.txtSumando01).text.toString().toInt() )
            sumaBundle.putInt("sumando02", findViewById<TextView>(R.id.txtSumando02).text.toString().toInt())
            resultV.putExtras(sumaBundle)
            startActivity(resultV)
        }else {
            Toast.makeText(this@SumaActivity,getString(R.string.lgndZero), Toast.LENGTH_SHORT).show()
        }

    }
}