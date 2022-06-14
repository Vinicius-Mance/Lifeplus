package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val btnCriarPerfil = findViewById<Button>(R.id.btnCriarPerfil)

        btnEntrar.setOnClickListener {
            val link = Intent(this, LoginActivity::class.java)
            startActivity(link)
        }

        btnCriarPerfil.setOnClickListener {
            val link = Intent(this, RegisterActivity::class.java)
            startActivity(link)
        }

    }





}