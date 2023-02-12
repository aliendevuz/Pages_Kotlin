package com.example.pageskotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.model.Contact

class ContactAdapter(contacts: ArrayList<Contact>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var contacts: ArrayList<Contact>

    init {
        this.contacts = contacts
    }

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView
        var name: TextView
        var phone: TextView

        init {
            image = view.findViewById(R.id.item_contact_image)
            name = view.findViewById(R.id.item_contact_name)
            phone = view.findViewById(R.id.item_contact_phone)
        }
    }

    private fun init(holder: ContactViewHolder, contact: Contact) {
        holder.image.setImageResource(contact.image)
        holder.name.text = contact.name
        holder.phone.text = contact.phone
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ContactViewHolder) init(
            holder,
            contacts[position]
        )
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
