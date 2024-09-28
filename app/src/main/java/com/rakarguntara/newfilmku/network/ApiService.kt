package com.rakarguntara.newfilmku.network

import com.rakarguntara.newfilmku.BuildConfig
import com.rakarguntara.newfilmku.models.SearchMovieResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface ApiService {
    @GET("search/movie")
    suspend fun getSearchMovie(
        @Header("Authorization") auth : String = BuildConfig.AUTH,
        @Query("query") query: String,
        @Query("include_adult") adult: Boolean = false,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1,
    ): SearchMovieResponse
}