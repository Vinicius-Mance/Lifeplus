package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)

        btnEntrar.setOnClickListener {
            val link = Intent(this, MenuActivity::class.java)
            startActivity(link)
        }
    }

}
