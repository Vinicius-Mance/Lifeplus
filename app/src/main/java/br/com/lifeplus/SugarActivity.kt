package br.com.lifeplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        val res = resources
        val alimento_array = res.getStringArray(R.array.alimento_array)

        // Create an adapter as shown below
        val adapter = ArrayAdapter<Any?>(this, R.layout.spinner_style, alimento_array)
        adapter.setDropDownViewResource(R.layout.spinner_style)

        // Set the adapter to the Spinner
        selectAlimento.adapter = adapter

//        val call = RetrofitFactory().retrofitService().getFoodData()
////        Toast.makeText(this, call.toString(),Toast.LENGTH_LONG).show()
//        Log.i("call", call.toString())
    }

}


