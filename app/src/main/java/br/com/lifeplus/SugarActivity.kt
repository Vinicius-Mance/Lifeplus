package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class SugarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugar)

        val btnAdicionarAlimento = findViewById<Button>(R.id.btnAdicionarAlimento)

        btnAdicionarAlimento.setOnClickListener {
            val link = Intent(this, AddFoodActivity::class.java)
            startActivity(link)
        }

        val selectAlimento = findViewById<Spinner>(R.id.selectAlimento)

//        if(selectAlimento.selectedItem == 0){
//
//        }

        ArrayAdapter.createFromResource(
            this,
            R.array.alimento_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            selectAlimento.adapter = adapter
        }

    }
}


