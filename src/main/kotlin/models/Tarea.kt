package models

data class Tarea (val id: Int, val titulo: String, val descripcion: String, var estado: String) {

    fun info() {
        println("""
            -----------------------
            Titulo: $titulo
            -----------------------
            Descripción: $descripcion
            -----------------------
        """.trimIndent())
    }

}