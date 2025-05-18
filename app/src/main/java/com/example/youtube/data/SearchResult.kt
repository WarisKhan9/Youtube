

package com.example.youtube.data


data class VideoInfo(
    val id: String?,
    val title: String?,
    val description: String?,
    val thumbnail: String?,
    val duration: Int?,
    val view_count: Int?,
    val like_count: Int?,
    val formats: List<VideoFormat>?
)

data class VideoFormat(
    val format_id: String?,
    val url: String?,
    val ext: String?,
    val resolution: String?,
    val filesize: Long?
)
