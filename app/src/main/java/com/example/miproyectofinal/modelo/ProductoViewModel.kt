package com.example.miproyectofinal.modelo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.miproyectofinal.dao.ProductoDao
import com.example.miproyectofinal.database.AppDatabase
import com.example.miproyectofinal.entidades.Productos
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductoViewModel(application: Application) : AndroidViewModel(application) {

    private val productoDao: ProductoDao


    init {
        val database = AppDatabase.getInstance(application.applicationContext)
        productoDao = database.productoDao()
    }

    suspend fun insertar(productos: Productos) = withContext(Dispatchers.IO) {
        productoDao.insertar(productos)
    }

    suspend fun actualizar(productos: Productos) = withContext(Dispatchers.IO) {
        productoDao.actualizar(productos)
    }

    suspend fun eliminar(productos: Productos) = withContext(Dispatchers.IO) {
        productoDao.eliminar(productos)
    }

    val todos: LiveData<List<Productos>> = productoDao.obtenerTodos()
}
