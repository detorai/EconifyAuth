package com.example.eonifyauth.ui.signUp

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.signIn.SignInScreen

class SignUpScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.current

        SignUp(
            onClick = {navigator?.push(SignInScreen())}
        )
    }
}