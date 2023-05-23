package com.staytonight.data.repository

import com.staytonight.data.network.Api
import com.staytonight.domain.model.Article
import com.staytonight.domain.repository.NewsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val api: Api) : NewsRepository {
    override suspend fun getNews(): List<Article> = withContext(Dispatchers.IO) {
        val response = api.getNews()
        if (response.isSuccessful) {
            response.body()?.articles?.map { it.mapTo() } ?: emptyList()
        } else {
            emptyList()
        }
    }
}