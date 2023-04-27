package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entidades.Productos

@Dao //funciona para marcarla como una clase con acceso a data
interface ProductoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(productos: Productos): Long

    @Update
    fun actualizar(productos: Productos): Int

    @Delete
    fun eliminar(productos: Productos): Int

    //Acá especificamos una consulta personalizada para obtener los registros de la tabla
    //y devuelve un LiveData
    @Query("SELECT * FROM productos")
    fun obtenerTodos(): LiveData<List<Productos>>
}