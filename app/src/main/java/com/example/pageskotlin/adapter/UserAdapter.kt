package com.example.pageskotlin.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.model.User

class UserAdapter(users: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var users: ArrayList<User>

    init {
        this.users = users
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView
        var age: TextView
        var id: TextView

        init {
            name = view.findViewById(R.id.item_user_name)
            age = view.findViewById(R.id.item_user_age)
            id = view.findViewById(R.id.item_user_id)
        }
    }

    @SuppressLint("SetTextI18n")
    fun init(holder: UserViewHolder, user: User) {
        holder.name.text = user.name
        holder.age.text = (user.name + " is " + user.age) + " years old"
        holder.id.text = user.id.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is UserViewHolder) init(
            holder,
            users[position]
        )
    }

    override fun getItemCount(): Int {
        return users.size
    }
}
