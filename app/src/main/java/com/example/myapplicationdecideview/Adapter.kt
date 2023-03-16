package com.example.myapplicationdecideview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(val array:ArrayList<MyClass>):RecyclerView.Adapter<Adapter.ViewHolder>(), View.OnClickListener{
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    class ViewHolder(item : View):RecyclerView.ViewHolder(item){
        var image = item.findViewById<ImageView>(R.id.image)
        val name = item.findViewById<TextView>(R.id.name)
        val surname = item.findViewById<TextView>(R.id.surname)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(myViewHolder)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            Toast.makeText(MainActivity(), array[position].name, Toast.LENGTH_LONG).show()
        }

        holder.name.text = array[position].name
        holder.surname.text = array[position].surname
        Glide.with(holder.image.context).load(array[position].imageview).into(holder.image)
    }
}

