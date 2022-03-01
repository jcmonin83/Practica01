package com.pp.practica01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.sqrt

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        realizaOperacion()
    }
    fun realizaOperacion(){
        val myBundle = intent.extras;
        when(myBundle?.getInt("operacion")){
            1->{ suma(myBundle?.getInt("sumando01"),myBundle?.getInt("sumando02")) }
            2->{ raizCuadrada(myBundle?.getFloat("radicando")) }
            3->{ exponente(myBundle?.getDouble("base"),myBundle?.getDouble("exponente")) }
        }
    }

    fun suma(arg1:Int, arg2:Int) {
        var res = findViewById<TextView>(R.id.txtResultado)
        res.text= " $arg1+$arg2 "+getString(R.string.txtEs)+" "+ (arg1 + arg2).toString()
    }
    fun raizCuadrada(arg1:Float) {
        var res = findViewById<TextView>(R.id.txtResultado)
        res.text= " √$arg1 "+getString(R.string.txtEs)+" "+ sqrt(arg1 ).toString()
    }
    fun exponente(base:Double, exponente:Double){
        var res = findViewById<TextView>(R.id.txtResultado)
        res.text= " $base^$exponente "+getString(R.string.txtEs)+" "+ Math.pow(base,exponente).toString()
    }
    fun okClick(view: View) {
        var intnt = Intent(this@Resultado,Operaciones::class.java)
        intnt.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intnt)
    }
}