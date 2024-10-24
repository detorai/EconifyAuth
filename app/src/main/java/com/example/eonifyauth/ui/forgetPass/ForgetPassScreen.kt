package com.example.eonifyauth.ui.forgetPass

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.enterOTP.EnterOTPScreen

class ForgetPassScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        ForgetPass(
            onClickBack = {navigator?.pop()},
            onClickButton = {navigator?.push(EnterOTPScreen())}
        )
    }
}