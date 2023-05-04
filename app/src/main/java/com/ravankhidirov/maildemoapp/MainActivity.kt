package com.ravankhidirov.maildemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ravankhidirov.maildemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    var peopleList = mutableListOf<com.ravankhidirov.maildemoapp.data.Person>(
        com.ravankhidirov.maildemoapp.data.Person(R.drawable.ic_launcher_background,"Ravan","Hello","5/4/2023",10),
        com.ravankhidirov.maildemoapp.data.Person(R.drawable.ic_launcher_background,"Hasan","Salam","5/3/2023",3),
        com.ravankhidirov.maildemoapp.data.Person(R.drawable.ic_launcher_background,"Ahmed","Haha","5/2/2023",6)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()
    }
    private fun setUpRecyclerView()
    {
        var adapter = MyCustomAdapter(peopleList)
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.myRecyclerView.layoutManager = layoutManager
        binding.myRecyclerView.adapter = adapter
    }
}