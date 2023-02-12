package com.example.pageskotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.adapter.ContactAdapter
import com.example.pageskotlin.model.Contact

class ContactFragment : Fragment() {

    private lateinit var list: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_contact, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        val contacts: ArrayList<Contact> = ArrayList()
        load(contacts)
        val adapter = ContactAdapter(contacts)
        list = view.findViewById(R.id.contact_list)
        list.layoutManager = GridLayoutManager(view.context, 1)
        list.adapter = adapter
    }

    private fun load(contacts: ArrayList<Contact>) {
        contacts.add(Contact(R.mipmap.ic_launcher, "(Unknown)", "(Unknown number)"))
        contacts.add(Contact(R.drawable.image1, "Agent 007", "+998 (99) 007 07 07"))
        contacts.add(Contact(R.drawable.image2, "Alan", "+998 (95) 474 71 17"))
        contacts.add(Contact(R.drawable.image3, "Walker", "+998 (95) 474 17 71"))
        contacts.add(Contact(R.drawable.image4, "Alien", "+998 (95) 065 08 20"))
        contacts.add(Contact(R.drawable.image5, "ASUS", "+998 (95) 551 03 64"))
        contacts.add(Contact(R.drawable.image6, "Bill", "+998 (78) 224 84 27"))
        contacts.add(Contact(R.drawable.image7, "iPhone", "+998 (93) 093 18 22"))
        contacts.add(Contact(R.drawable.image8, "Joker", "+998 (97) 503 02 02"))
        contacts.add(Contact(R.drawable.image9, "PyDev", "+998 (90) 122 66 78"))
        contacts.add(Contact(R.drawable.image10, "Developer", "+998 (95) 784 64 46"))
    }
}
