package com.example.inmobiliaria.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Inmuebles(
    @StringRes val stringResourceId: Int,
    @StringRes val stringDescripcion: Int,
    @StringRes val stringPrecio: Int,
    @StringRes val stringTipoOperacion: Int,
    @StringRes val stringCantAmbientes: Int,
    @StringRes val stringCalefaccion: Int,
    @DrawableRes val imageResoursceId: Int
)
