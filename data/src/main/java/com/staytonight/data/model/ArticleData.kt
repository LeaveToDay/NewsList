package com.staytonight.data.model

import com.staytonight.domain.MapTo
import com.staytonight.domain.model.Article

data class ArticleData(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: SourceData?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
): MapTo<Article, ArticleData> {
    override fun mapTo(): Article =
        Article(author, content, description, publishedAt, source?.mapTo(), title, url, urlToImage)
}