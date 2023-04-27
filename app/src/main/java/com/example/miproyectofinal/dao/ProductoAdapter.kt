package com.example.miproyectofinal.dao

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miproyectofinal.entidades.Productos
/*
class ProductoAdapter(private val onItemClick: (Productos) -> Unit) :
    RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>() {

    private var productos = listOf<Productos>()

    fun setEstudiantes(estudiantes: List<Productos>) {
        this.productos = estudiantes
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val binding = ProductoViewHolder.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductoViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: ProductoeViewHolder, position: Int) {
        holder.bind(productos[position])
    }

    override fun getItemCount(): Int = productos.size

    inner class ProductoViewHolder(private val binding: ProductoItemBinding, private val onItemClick: (Productos) -> Unit) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(productos: Productos) {
            binding.tvNombreCompleto.text = "${estudiante.nombres} ${estudiante.apellidos}"
            binding.tvCarrera.text = estudiante.carrera
            binding.tvAnio.text = estudiante.anio.toString()

            binding.root.setOnClickListener { onItemClick(estudiante) }
        }
    }
}*/