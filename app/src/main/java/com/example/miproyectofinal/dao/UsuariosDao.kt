package com.example.miproyectofinal.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.entidades.Usuarios

@Dao //funciona para marcarla como una clase con acceso a data
interface UsuariosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(usuarios: Usuarios): Long

    @Update
    fun actualizar(usuarios: Usuarios): Int

    @Delete
    fun eliminar(usuarios: Usuarios): Int

    //Acá especificamos una consulta personalizada para obtener los registros de la tabla
    //y devuelve un LiveData
    @Query("SELECT * FROM usuarios")
    fun obtenerTodos(): LiveData<List<Usuarios>>
}