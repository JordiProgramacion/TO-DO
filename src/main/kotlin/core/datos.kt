package core

import models.Tarea

class datos {
    val listaTareas = mutableListOf<Tarea>()

    fun crearTarea(des: String, titulo: String) {
        val idMayor = listaTareas.maxOfOrNull { it.id } ?: 0
        val idFinal = idMayor + 1
        val tarea = Tarea(id = idFinal, titulo = titulo, descripcion = des, estado = "to-do")
        listaTareas.add(tarea)
    }
    fun mostrarTareas() {
        listaTareas.forEach { it.info() }
    }
    fun modificarTarea() {

    }

}