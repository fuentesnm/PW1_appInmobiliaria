package com.example.inmobiliaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.*
import com.example.inmobiliaria.data.Datasource
import com.example.inmobiliaria.databinding.ActivityMainBinding

class DetalleInmueble : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    companion object {
        const val INMUEBLE_ID = "inmuebleId"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_detalle_inmueble)

        val inmuebleId = intent?.extras?.getString(INMUEBLE_ID).toString()

        // Initialize data.
        val myDataset = Datasource().searchByIndexInmueble(inmuebleId.toInt())

        val img: ImageView = findViewById(R.id.item_image)
        img.setImageResource(myDataset.imageResoursceId)
        val text1: TextView = findViewById(R.id.item_title)
        text1.text = getString(myDataset.stringResourceId)

        val text2: TextView = findViewById(R.id.item_descripcion)
        text2.text = getString(myDataset.stringDescripcion);

        val text3: TextView = findViewById(R.id.item_precio)
        text3.text = getString(myDataset.stringPrecio);

        val text4: TextView = findViewById(R.id.item_tipo_operacion)
        text4.text = getString(myDataset.stringTipoOperacion);

        val text5: TextView = findViewById(R.id.item_cant_ambientes)
        text5.text =  getString(myDataset.stringCantAmbientes);

        val text6: TextView = findViewById(R.id.item_calefaccion)
        text6.text =  getString(myDataset.stringCalefaccion);

        val consulta: Button = findViewById(R.id.btnconsulta)
        consulta.setOnClickListener {
            //val context = holder.imageView.context
            val intent = Intent(this, Consulta::class.java)
            //intent.putExtra(DetalleInmueble.INMUEBLE_ID, position.toString())
            this.startActivity(intent)
        }
    }
}