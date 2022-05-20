package com.example.inmobiliaria.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.inmobiliaria.R
import com.example.inmobiliaria.model.Inmuebles

class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Inmuebles>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val textView1: TextView = view.findViewById(R.id.item_descripcion)
        val textView2: TextView = view.findViewById(R.id.item_precio)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.textView1.text = context.resources.getString(item.stringDescripcion)
        holder.textView2.text = context.resources.getString(item.stringPrecio)
        holder.imageView.setImageResource(item.imageResoursceId)
    }

    override fun getItemCount() = dataSet.size
}