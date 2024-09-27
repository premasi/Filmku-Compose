package com.rakarguntara.newfilmku.widgets

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.rakarguntara.newfilmku.R
import com.rakarguntara.newfilmku.navigations.EnumBottomNavigationScreen

@Composable
fun FilmkuBottomNavigationBar(navController: NavController) {
    NavigationBar (
        containerColor = colorResource(R.color.orange),
        contentColor = colorResource(R.color.white)
    ){
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
        NavigationBarItem(
            label = {Text("Home")},
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home Icon") },
            onClick = {
                if(currentRoute != EnumBottomNavigationScreen.HomeScreen.name){
                    navController.navigate(EnumBottomNavigationScreen.HomeScreen.name){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            },
            selected = currentRoute == EnumBottomNavigationScreen.HomeScreen.name,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                indicatorColor = colorResource(R.color.navy),
            )
        )

        NavigationBarItem(
            label = { Text("Search") },
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "Search") },
            onClick = {
                if(currentRoute != EnumBottomNavigationScreen.SearchScreen.name){
                    navController.navigate(EnumBottomNavigationScreen.SearchScreen.name){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            },
            selected = currentRoute == EnumBottomNavigationScreen.SearchScreen.name,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                indicatorColor = colorResource(R.color.navy),
            )
        )

        NavigationBarItem(
            label = {(Text("Profile"))},
            icon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile") },
            onClick = {
                if(currentRoute != EnumBottomNavigationScreen.ProfileScreen.name){
                    navController.navigate(EnumBottomNavigationScreen.ProfileScreen.name){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            },
            selected = currentRoute == EnumBottomNavigationScreen.ProfileScreen.name,
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.White,
                selectedTextColor = Color.White,
                unselectedIconColor = Color.Black,
                unselectedTextColor = Color.Black,
                indicatorColor = colorResource(R.color.navy),
            )
        )
    }
}