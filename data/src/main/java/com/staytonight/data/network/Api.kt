package com.staytonight.data.network

import com.staytonight.data.model.GetNewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("everything/")
    suspend fun getNews(
        @Query("apiKey") apiKey: String = "a4064632f49e4d328a42257d39b2cbdc",
        @Query("q") q: String = "tesla",
        @Query("from") from: String = "2023-04-23",
        @Query("sortBy") sortBy: String = "publishedAt"
    ): Response<GetNewsResponse>
}