package com.rakarguntara.newfilmku.screens.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rakarguntara.newfilmku.navigations.FilmkuBottomNavigation
import com.rakarguntara.newfilmku.widgets.FilmkuBottomNavigationBar

@Composable
fun MainScreen(navController: NavController){
    val bottomNavController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {FilmkuBottomNavigationBar(bottomNavController)}
    ){
        FilmkuBottomNavigation(bottomNavController, navController, Modifier.padding(it))
    }
}