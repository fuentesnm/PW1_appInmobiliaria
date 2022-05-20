package com.example.inmobiliaria.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Inmuebles(
    @StringRes val stringResourceId: Int,
    @StringRes val stringDescripcion: Int,
    @StringRes val stringPrecio: Int,
    @DrawableRes val imageResoursceId: Int
)
