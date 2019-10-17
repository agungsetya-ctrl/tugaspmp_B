package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan.model.Prog
import com.example.latihan.model.progdata

class MainActivity : AppCompatActivity() {
    private lateinit var rvProg: RecyclerView
    private var list: ArrayList<Prog> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProg = findViewById(R.id.rv_prog)
        rvProg.setHasFixedSize(true)
        list.addAll(progdata.listProg)
        showPresList()
    }
    private fun showPresList() {
        rvProg.layoutManager = LinearLayoutManager(this)
        val listProgAdapter = ListProgAdapter(list)
        rvProg.adapter = listProgAdapter
    }
}

