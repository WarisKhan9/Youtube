package com.example.youtube.viewmodel



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtube.data.VideoInfo
import com.example.youtube.network.VideoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class VideoViewModel(
    private val repository: VideoRepository = VideoRepository()
) : ViewModel() {

    private val _videoInfo = MutableStateFlow<VideoInfo?>(null)
    val videoInfo: StateFlow<VideoInfo?> = _videoInfo

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage

    fun fetchVideoInfo(url: String) {
        viewModelScope.launch {
            try {
                val info = repository.getVideoInfo(url)
                _videoInfo.value = info
                _errorMessage.value = null
            } catch (e: Exception) {
                _errorMessage.value = e.localizedMessage ?: "Error fetching video info"
            }
        }
    }
}
