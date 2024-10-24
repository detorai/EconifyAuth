package com.example.eonifyauth.ui.signIn

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.forgetPass.ForgetPassScreen

class SignInScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        SignIn(
            onClick = {navigator?.pop()},
            onClickForget = {navigator?.push(ForgetPassScreen())}
        )
    }
}