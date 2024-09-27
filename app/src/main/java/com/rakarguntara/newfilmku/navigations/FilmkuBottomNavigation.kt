package com.rakarguntara.newfilmku.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rakarguntara.newfilmku.screens.home.HomeScreen
import com.rakarguntara.newfilmku.screens.profile.ProfileScreen
import com.rakarguntara.newfilmku.screens.search.SearchScreen

@Composable
fun FilmkuBottomNavigation(
    bottomNavController: NavHostController,
    navController: NavController,
    padding: Modifier
) {
    NavHost(navController = bottomNavController, startDestination = EnumBottomNavigationScreen.HomeScreen.name){
        composable(EnumBottomNavigationScreen.HomeScreen.name){
            HomeScreen()
        }

        composable(EnumBottomNavigationScreen.SearchScreen.name){
            SearchScreen()
        }

        composable(EnumBottomNavigationScreen.ProfileScreen.name){
            ProfileScreen()
        }
    }
}