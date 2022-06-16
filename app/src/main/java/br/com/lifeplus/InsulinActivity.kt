package br.com.lifeplus


import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class InsulinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insulin)

        // Declaring and initializing
        // the Spinner from the layout file
        val selectInsulina = findViewById<Spinner>(R.id.selectInsulina)

        val res = resources
        // Create a list to display in the Spinner
        val tipo_insulina = res.getStringArray(R.array.tipo_insulina)

        // Create an adapter as shown below
        val adapter = ArrayAdapter<Any?>(this, R.layout.spinner_style, tipo_insulina)
        adapter.setDropDownViewResource(R.layout.spinner_style)

        // Set the adapter to the Spinner
        selectInsulina.adapter = adapter

    }
}
