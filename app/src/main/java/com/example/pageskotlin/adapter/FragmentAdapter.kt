package com.example.pageskotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fragmentManager: FragmentManager?) :
    FragmentPagerAdapter(fragmentManager!!) {

    var fragments = ArrayList<Fragment>()
    var titles = ArrayList<String>()

    fun add(fragment: Fragment, title: String) {
        fragments.add(fragment)
        titles.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titles[position]
    }
}
