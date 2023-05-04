package com.ravankhidirov.maildemoapp

import android.app.Person
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyCustomAdapter(list:List<com.ravankhidirov.maildemoapp.data.Person>): RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {

    var list1:List<com.ravankhidirov.maildemoapp.data.Person>

    init{
        this.list1 = list
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val personTextView = itemView.findViewById<TextView>(R.id.personName)
        val personImage = itemView.findViewById<ImageView>(R.id.myImageView)

        val lastMessage = itemView.findViewById<TextView>(R.id.lastMessage)
        val date = itemView.findViewById<TextView>(R.id.date)
        val new = itemView.findViewById<TextView>(R.id.newMessageCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.message_item,parent,false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = list1.get(position)
        holder.personTextView.setText(person.personName)
        holder.personImage.setImageResource(person.resourceName)
        holder.lastMessage.setText(person.lastMessage)
        holder.date.setText(person.date)
        holder.new.setText(person.new.toString())
    }
}