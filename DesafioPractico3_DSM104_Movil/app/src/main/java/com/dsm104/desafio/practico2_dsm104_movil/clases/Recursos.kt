package com.dsm104.desafio.practico2_dsm104_movil.clases

class Recursos {
    var titulo: String = ""
    var descripcion: String = ""
    var tipo: String = ""
    var enlace: String = ""
    var imagen: String = ""
    var id: String = ""

    constructor(
        titulo: String,
        descripcion: String,
        tipo: String,
        enlace: String,
        imagen: String,
        id: String
    ) {
        this.titulo = titulo
        this.descripcion = descripcion
        this.tipo = tipo
        this.enlace = enlace
        this.imagen = imagen
        this.id = id
    }

    constructor()
    override fun toString(): String {
        return "Recursos(titulo='$titulo', descripcion='$descripcion', tipo='$tipo', enlace='$enlace', imagen='$imagen', id='$id')"
    }
}