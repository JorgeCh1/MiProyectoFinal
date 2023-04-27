package com.example.miproyectofinal.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.UsuariosDao
import com.example.miproyectofinal.entidades.Usuarios

// indica que esta clase es una base de datos y especifica la lista de entidades que se incluirán en la base de datos,
// así como la versión actual de la base de datos.
@Database(entities = [Usuarios::class], version = 1)
abstract class UsuarioDatabase : RoomDatabase() {
    //Creamos un método abstracto para obtener un objeto Dao de la entidad
    abstract fun usuariosDao(): UsuariosDao
}