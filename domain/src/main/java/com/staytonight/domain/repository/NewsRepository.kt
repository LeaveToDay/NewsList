package com.staytonight.domain.repository

import com.staytonight.domain.model.Article

interface NewsRepository {
    suspend fun getNews(): List<Article>
}