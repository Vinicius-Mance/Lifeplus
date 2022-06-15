package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnAdicionarRegistros = findViewById<RelativeLayout>(R.id.btnAdicionarRegistros)

        btnAdicionarRegistros.setOnClickListener {
            val link = Intent(this, MenuInputsActivity::class.java)
            startActivity(link)
        }

    }
}