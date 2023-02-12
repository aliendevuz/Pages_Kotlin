package com.example.pageskotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.pageskotlin.R
import com.example.pageskotlin.adapter.FragmentAdapter
import com.example.pageskotlin.fragment.ContactFragment
import com.example.pageskotlin.fragment.PostFragment
import com.example.pageskotlin.fragment.UserFragment
import com.google.android.material.tabs.TabLayout

class SocialActivity : AppCompatActivity() {

    private lateinit var title: TabLayout
    private lateinit var page: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social)
        init()
    }

    private fun init() {
        title = findViewById(R.id.title)
        page = findViewById(R.id.page)
        val adapter = FragmentAdapter(supportFragmentManager)
        adapter.add(ContactFragment(), "Contacts")
        adapter.add(UserFragment(), "Users")
        adapter.add(PostFragment(), "Posts")
        page.adapter = adapter
        title.setupWithViewPager(page)
    }
}
