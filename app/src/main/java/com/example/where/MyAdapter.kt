package com.example.where

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.balloon.view.*
import kotlinx.android.synthetic.main.item_memo.view.*

class MyAdapter(val context: Context,
                var list :List<MemoEntity>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    override fun getItemCount(): Int {
        return list.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_memo,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //list =1,2,3
        val memo = list[position]


        holder.memo.text=memo.memo
        holder.root.setOnLongClickListener(object: View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {
                return true
            }
        })
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val memo = itemView.textview_memo
        val root= itemView.root

    }


}