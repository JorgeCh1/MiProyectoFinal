package com.example.miproyectofinal.modelo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.miproyectofinal.dao.UsuariosDao
import com.example.miproyectofinal.database.AppDatabase
import com.example.miproyectofinal.entidades.Usuarios
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class UsuariosViewModel(application: Application) : AndroidViewModel(application) {

    private val usuariosDao: UsuariosDao


    init {
        val database = AppDatabase.getInstance(application.applicationContext)
        usuariosDao = database.usuariosDao()
    }


    suspend fun insertar(usuarios: Usuarios) = withContext(Dispatchers.IO) {
        usuariosDao.insertar(usuarios)
    }

    suspend fun actualizar(usuarios: Usuarios) = withContext(Dispatchers.IO) {
        usuariosDao.actualizar(usuarios)
    }

    suspend fun eliminar(usuarios: Usuarios) = withContext(Dispatchers.IO) {
       usuariosDao.eliminar(usuarios)
    }

    val todos: LiveData<List<Usuarios>> = usuariosDao.obtenerTodos()
}
