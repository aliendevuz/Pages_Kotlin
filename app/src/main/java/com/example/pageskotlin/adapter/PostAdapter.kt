package com.example.pageskotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pageskotlin.R
import com.example.pageskotlin.model.Post

class PostAdapter(posts: ArrayList<Post>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var posts: ArrayList<Post>

    init {
        this.posts = posts
    }

    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var header: TextView
        var image: ImageView
        var text: TextView

        init {
            header = view.findViewById(R.id.item_post_header)
            image = view.findViewById(R.id.item_post_image)
            text = view.findViewById(R.id.item_post_text)
        }
    }

    private fun init(holder: PostViewHolder, post: Post) {
        holder.header.text = post.header
        holder.image.setImageResource(post.image)
        holder.text.text = post.text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PostViewHolder) init(
            holder,
            posts[position]
        )
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}
