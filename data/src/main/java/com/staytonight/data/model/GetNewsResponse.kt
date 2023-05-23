package com.staytonight.data.model

data class GetNewsResponse(
    val articles: List<ArticleData>?,
    val status: String?,
    val totalResults: Int?
)