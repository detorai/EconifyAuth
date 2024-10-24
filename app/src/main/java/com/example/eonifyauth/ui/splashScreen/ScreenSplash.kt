package com.example.eonifyauth.ui.splashScreen

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.signUp.SignUpScreen

class ScreenSplash: Screen {

    override val key: ScreenKey = uniqueScreenKey


    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        SplashScreen(onTimeout = { navigator?.push(SignUpScreen()) })
    }
}