package com.example.miproyectofinal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.miproyectofinal.dao.ProductoDao
import com.example.miproyectofinal.dao.UsuariosDao
import com.example.miproyectofinal.entidades.Productos

@Database(entities = [Productos::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productoDao(): ProductoDao
    abstract fun usuariosDao(): UsuariosDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        //Con esta función crea y mantiene una instancia unica de la base de datos
        //en toda la aplicacion
        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}