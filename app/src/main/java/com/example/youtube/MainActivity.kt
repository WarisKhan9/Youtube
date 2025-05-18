// MainActivity.kt
package com.example.youtube


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.youtube.Screens.MainScreen
import com.example.youtube.ui.theme.YouTubeTheme

class MainActivity : ComponentActivity() {

    private val viewModel: ViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YouTubeTheme {
                MainScreen()
            }
        }
    }
}


