package com.example.inmobiliaria.data

import com.example.inmobiliaria.R
import com.example.inmobiliaria.model.Inmuebles

class Datasource {
    fun loadInmuebles(): List<Inmuebles> {
        return listOf<Inmuebles>(
            Inmuebles(R.string.inmueble1Titulo, R.string.inmueble1Descripcion, R.string.inmueble1Precio, R.drawable.inmueble1),
            Inmuebles(R.string.inmueble2Titulo, R.string.inmueble2Descripcion, R.string.inmueble2Precio, R.drawable.inmueble2),
            Inmuebles(R.string.inmueble3Titulo, R.string.inmueble3Descripcion, R.string.inmueble3Precio, R.drawable.inmueble3),
            Inmuebles(R.string.inmueble4Titulo, R.string.inmueble4Descripcion, R.string.inmueble4Precio, R.drawable.inmueble4),
            Inmuebles(R.string.inmueble5Titulo, R.string.inmueble5Descripcion, R.string.inmueble5Precio, R.drawable.inmueble5),
        )
    }
}