package com.example.database.fragment.list

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.database.R
import com.example.database.data.User



class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private  var userList = emptyList<User>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //Toast.makeText(context,"SUCCESSFULLY ADDED", Toast.LENGTH_LONG).show()

        Log.e("TAG","onCreate ")


        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        Log.e("TAG","getItemCount ${userList.size}")
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.e("TAG","onBindViewHolder ")
        //Log.d(ContentValues.TAG, "On Bind View Holder called $position")
        //holder.bindItems(userList[position])
        val currentItem = userList[position]
//        holder.bindItems(currentItem)
        val idtext = holder.itemView.findViewById<TextView>(R.id.textViewId)
        val etFirstName = holder.itemView.findViewById<TextView>(R.id.etFirstName)
        val etLastName = holder.itemView.findViewById<TextView>(R.id.etLastName)
        val etAge = holder.itemView.findViewById<TextView>(R.id.etAge)
        idtext.text = currentItem.id.toString()
        etFirstName.text = currentItem.firstName
        etLastName.text = currentItem.lastName
        etAge.text = currentItem.age.toString()
    }
    fun setData(users : List<User>){
        Log.e("TAG","setData")
        this.userList = users
        notifyDataSetChanged()
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            Log.e("TAG", "MyViewHolder ")
        }
//        val idtext = itemView.findViewById<TextView>(R.id.textViewId)
//        val etFirstName = itemView.findViewById<TextView>(R.id.etFirstName)
//        val etLastName = itemView.findViewById<TextView>(R.id.etLastName)
//        val etAge = itemView.findViewById<TextView>(R.id.etAge)


//        fun bindItems(item: User) {
//            idtext.text = item.id.toString()
//            etFirstName.text = item.firstName
//            etLastName.text = item.lastName
//            etAge.text = item.age.toString()
//        }


    }
}