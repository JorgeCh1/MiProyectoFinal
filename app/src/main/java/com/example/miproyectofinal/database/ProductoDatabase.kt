package com.example.miproyectofinal.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.ProductoDao
import com.example.miproyectofinal.entidades.Productos

// indica que esta clase es una base de datos y especifica la lista de entidades que se incluirán en la base de datos,
// así como la versión actual de la base de datos.
@Database(entities = [Productos::class], version = 1)
abstract class ProductoDatabase : RoomDatabase() {
    //Creamos un método abstracto para obtener un objeto Dao de la entidad
    abstract fun productoDao(): ProductoDao
}