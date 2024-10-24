package com.example.eonifyauth.ui.enterOTP

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.resetPassword.ResetPasswordScreen

class EnterOTPScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        EnterOTP(
            onClickButton = {navigator?.push(ResetPasswordScreen())},
            onClickBack = {navigator?.pop()}
        )
    }
}