package com.example.pageskotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.adapter.UserAdapter
import com.example.pageskotlin.model.User

class UserFragment : Fragment() {

    private lateinit var list: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_user, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        val users: ArrayList<User> = ArrayList()
        load(users)
        val adapter = UserAdapter(users)
        list = view.findViewById(R.id.user_list)
        list.layoutManager = GridLayoutManager(view.context, 1)
        list.adapter = adapter
    }

    private fun load(users: ArrayList<User>) {
        users.add(User(10001, "Noname", 0))
        users.add(User(10002, "Alien", 18))
        users.add(User(10003, "Dev", 21))
        users.add(User(10004, "Ibrohim", 19))
        users.add(User(10005, "Umid", 17))
        users.add(User(10006, "Adham", 23))
        users.add(User(10007, "Sarvar", 18))
        users.add(User(10008, "Abdurazzoq", 19))
        users.add(User(10009, "Islom", 15))
        users.add(User(10010, "Bunyod", 25))
        users.add(User(10011, "Asil", 26))
        users.add(User(10012, "G'ayrat", 32))
        users.add(User(10013, "Alisher", 24))
        users.add(User(10014, "Jamshid", 22))
    }
}
