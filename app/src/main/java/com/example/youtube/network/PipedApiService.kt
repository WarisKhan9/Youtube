package com.example.youtube.network



import com.example.youtube.data.VideoInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface YtDlpApi {

    @GET("info")
    suspend fun getVideoInfo(
        @Query("url") videoUrl: String
    ): VideoInfo
}
