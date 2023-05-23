package com.staytonight.finalandrod.ui.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.staytonight.domain.model.Article
import com.staytonight.finalandrod.databinding.ItemNewsBinding

class NewsAdapter(
    private val news: List<Article>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder =
        NewsViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(news[position])
    }

    inner class NewsViewHolder(private val item: ItemNewsBinding) :
        RecyclerView.ViewHolder(item.root) {
        fun bind(new: Article) {
            item.apply {
                tvTitle.text = new.title
                tvAuthor.text = new.author
                tvDesc.text = new.description
            }
        }
    }
}