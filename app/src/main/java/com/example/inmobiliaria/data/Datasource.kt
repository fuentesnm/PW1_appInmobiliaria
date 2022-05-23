package com.example.inmobiliaria.data

import android.text.TextUtils.indexOf
import com.example.inmobiliaria.R
import com.example.inmobiliaria.model.Inmuebles

class Datasource {
    fun loadInmuebles(): List<Inmuebles> {
        return listOf<Inmuebles>(
            Inmuebles(R.string.inmueble1Titulo, R.string.inmueble1Descripcion, R.string.inmueble1Precio, R.string.inmueble1TipoOperacion, R.string.inmueble1CantAmbientes, R.string.inmueble1TipoCalefaccion, R.drawable.inmueble1),
            Inmuebles(R.string.inmueble2Titulo, R.string.inmueble2Descripcion, R.string.inmueble2Precio, R.string.inmueble2TipoOperacion, R.string.inmueble2CantAmbientes, R.string.inmueble2TipoCalefaccion, R.drawable.inmueble2),
            Inmuebles(R.string.inmueble3Titulo, R.string.inmueble3Descripcion, R.string.inmueble3Precio, R.string.inmueble3TipoOperacion, R.string.inmueble3CantAmbientes, R.string.inmueble3TipoCalefaccion,R.drawable.inmueble3),
            Inmuebles(R.string.inmueble4Titulo, R.string.inmueble4Descripcion, R.string.inmueble4Precio, R.string.inmueble4TipoOperacion, R.string.inmueble4CantAmbientes, R.string.inmueble4TipoCalefaccion, R.drawable.inmueble4),
            Inmuebles(R.string.inmueble5Titulo, R.string.inmueble5Descripcion, R.string.inmueble5Precio, R.string.inmueble5TipoOperacion, R.string.inmueble5CantAmbientes, R.string.inmueble5TipoCalefaccion, R.drawable.inmueble5)
        )
    }

    fun searchByIndexInmueble(IndexInmueble: Int): Inmuebles {
        val myList = loadInmuebles()
        return myList.get(IndexInmueble)
    }
}