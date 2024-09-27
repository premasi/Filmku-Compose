package com.rakarguntara.newfilmku.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rakarguntara.newfilmku.navigations.FilmkuNavigation
import com.rakarguntara.newfilmku.ui.theme.NewFilmkuTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewFilmkuTheme {
                FilmkuNavigation()
            }
        }
    }
}
