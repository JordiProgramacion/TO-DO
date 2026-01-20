package core

import models.Tarea
import app.generarCodigo

class datos {
    val listaTareas = mutableListOf<Tarea>()

    fun crearTarea(des: String) {
        val codigo = generarCodigo()
    }

}