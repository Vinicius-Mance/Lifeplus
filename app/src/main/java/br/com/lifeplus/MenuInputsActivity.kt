package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MenuInputsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inputs)

        val btnConsumoDeAcucar = findViewById<RelativeLayout>(R.id.btnConsumoDeAcucar)

        btnConsumoDeAcucar.setOnClickListener {
            val link = Intent(this, SugarActivity::class.java)
            startActivity(link)
        }

        val btnUsoDeInsulina = findViewById<RelativeLayout>(R.id.btnUsoDeInsulina)

        btnUsoDeInsulina.setOnClickListener {
            val link = Intent(this, InsulinActivity::class.java)
            startActivity(link)
        }

        val btnRegistroDeGlicemia = findViewById<RelativeLayout>(R.id.btnRegistroDeGlicemia)

        btnRegistroDeGlicemia.setOnClickListener {
            val link = Intent(this, GlycemiaActivity::class.java)
            startActivity(link)
        }

    }
}