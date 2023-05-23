package com.staytonight.finalandrod.ui.news

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.staytonight.domain.model.Article
import com.staytonight.finalandrod.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val viewModel: NewsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setupObservers()
    }

    private fun setupObservers() {
        viewModel.state.observe(this) { state ->
            setupRVNews(state)
        }
        viewModel.onInitNews()
    }

    private fun setupRVNews(news: List<Article>) {
        binding?.apply {
            rvNews.adapter = NewsAdapter(news)
        }
    }

}