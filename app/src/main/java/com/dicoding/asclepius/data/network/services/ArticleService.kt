package com.dicoding.asclepius.data.network.services

import com.dicoding.asclepius.data.model.Article
import com.dicoding.asclepius.data.network.response.BaseResponse
import retrofit2.http.GET

interface ArticleService {
    @GET("top-headlines")
    suspend fun fetchTopHeadlines(): BaseResponse<List<Article>>
}