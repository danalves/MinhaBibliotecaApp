package com.daniloalvesvieira.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.daniloalvesvieira.minhabiblioteca.Calculadora
import com.daniloalvesvieira.minhabiblioteca.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomToast.showToast(this, "Testeeeee")

    }
}
