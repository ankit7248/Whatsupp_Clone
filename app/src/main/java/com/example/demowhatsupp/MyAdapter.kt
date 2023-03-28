package com.example.WhatsApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demowhatsupp.R
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val whatsUppList: ArrayList<Whats>) :
    RecyclerView.Adapter<MyAdapter.MyViewpage>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewpage {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewpage(itemView)
    }

    override fun getItemCount(): Int {
        return whatsUppList.size
    }

    override fun onBindViewHolder(holder: MyViewpage, position: Int) {
        val currentItem = whatsUppList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.message.setText(currentItem.Message)
        holder.name.setText(currentItem.Name)
        holder.day.setText(currentItem.Day)
    }

    class MyViewpage(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titleImage: CircleImageView = itemView.findViewById(R.id.Monkey1)
        val message: TextView = itemView.findViewById(R.id.btThankYou)
        val day:TextView = itemView.findViewById(R.id.btYesterday2)
        val name: TextView = itemView.findViewById(R.id.btAnshul)
    }

}

