package com.example.miproyectofinal.entidades

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productos")
data class Productos(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombreProductos: String,
    val precio: Int,
    val existencia: Int,
    val entrada: Int,
    val salida: Int,
    val categoría: String
)
