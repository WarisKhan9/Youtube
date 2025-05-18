package com.example.youtube.network

import com.example.youtube.data.VideoInfo


class VideoRepository {
    suspend fun getVideoInfo(url: String): VideoInfo {
        return RetrofitInstance.api.getVideoInfo(url)
    }
}




