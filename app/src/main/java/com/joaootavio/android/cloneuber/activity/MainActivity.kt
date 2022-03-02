package com.joaootavio.android.cloneuber.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.joaootavio.android.cloneuber.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    fun abrirTelaLogin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    fun abrirTelaCadastro(view: View) {
        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }
}