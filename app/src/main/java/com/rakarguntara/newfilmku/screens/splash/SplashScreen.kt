package com.rakarguntara.newfilmku.screens.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.rakarguntara.newfilmku.R
import com.rakarguntara.newfilmku.navigations.EnumNavigationScreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val scaleAnimationState = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true, block = {
        scaleAnimationState.animateTo(
            targetValue = 0.9f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f).getInterpolation(it)
                }
            )
        )

        delay(1000)
        navController.navigate(EnumNavigationScreen.MainScreen.name){
            popUpTo(EnumNavigationScreen.MainScreen.name){
                inclusive = true
            }
        }
    })

    Scaffold {
        Column(
            modifier = Modifier.padding(it)
                .fillMaxSize()
                .scale(scaleAnimationState.value)
                .background(colorResource(R.color.white)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = colorResource(R.color.orange),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                ){
                    append("Film")
                }
                withStyle(style = SpanStyle(
                    color = colorResource(R.color.black),
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp
                )
                ){
                    append("ku")
                }
            })
        }
    }
}