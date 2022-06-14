package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btnCriarPerfil = findViewById<Button>(R.id.btnCriarPerfil)

        btnCriarPerfil.setOnClickListener {
            val link = Intent(this, MenuActivity::class.java)
            startActivity(link)
        }
    }
}