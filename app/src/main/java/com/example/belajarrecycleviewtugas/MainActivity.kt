package com.example.belajarrecycleviewtugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kegiatan>()
    val listKegiatan = arrayOf("Menyapu lantai", "Mengerjakan tugas", "Mencuci baju",
        "Mencuci piring", "Membeli ATK", "Bertemu Ani", "Membeli makanan", "Ke Lapangan",
        "Bersepeda", "Istirahat")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.setHasFixedSize(true)
        rv.layoutManager=LinearLayoutManager(this)
        for (i in 0 until listKegiatan.size){
            list.add(Kegiatan(listKegiatan.get(i)))
            if(listKegiatan.size-1==i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                rv.adapter=adapter
            }
        }
    }
}