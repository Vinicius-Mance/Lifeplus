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

        btnEntrar.setOnClickListener() {
            goToLogin()
        }
    }

    fun goToLogin(){
        val link = Intent(this, LoginActivity::class.java)
        startActivity(link)
    }
}