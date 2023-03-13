package com.example.myapplicationdecideview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.my_recyclerview)
        rv.adapter = Adapter(getList())
    }
    fun getList():ArrayList<MyClass>{
        val list = ArrayList<MyClass>()
        var text = findViewById<EditText>(R.id.text)
        var text1 = findViewById<EditText>(R.id.text1)
        var text2 = findViewById<EditText>(R.id.text2)
        var save = findViewById<Button>(R.id.save)
        var name = text.text.toString()
        var surname = text1.text.toString()
        var image = text2.text.toString()
        save.setOnClickListener {
            list.add(MyClass("$image", "$name", "$surname"))
        }
        return list

    }
}