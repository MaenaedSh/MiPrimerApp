package com.miprimerapp.Extensiones

import android.view.View
import android.widget.Button

fun Button.cambioTexto(elTextoGuardado : String){
    if (this.text == elTextoGuardado){
        this.text = "Boton presionado"
    }else{
        this.text = elTextoGuardado
    }
}

fun Button.toggleVisibility(){
    if (this.visibility == View.VISIBLE){
        this.visibility = View.GONE
    }else{
        this.visibility = View.VISIBLE
    }
}