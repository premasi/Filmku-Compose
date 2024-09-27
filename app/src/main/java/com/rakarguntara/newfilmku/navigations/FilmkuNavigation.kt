package com.rakarguntara.newfilmku.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rakarguntara.newfilmku.screens.main.MainScreen
import com.rakarguntara.newfilmku.screens.splash.SplashScreen

@Composable
fun FilmkuNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = EnumNavigationScreen.SplashScreen.name){
        composable(EnumNavigationScreen.SplashScreen.name){
            SplashScreen(navController)
        }

        composable(EnumNavigationScreen.MainScreen.name){
            MainScreen(navController)
        }
    }
}