package com.staytonight.domain.usecase

import com.staytonight.domain.repository.NewsRepository
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend fun getNews() = newsRepository.getNews()
}