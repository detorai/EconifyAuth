package com.example.eonifyauth.ui.forgetPass

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.EconifyViewModel
import com.example.eonifyauth.ui.enterOTP.EnterOTPScreen

class ForgetPassScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    private val viewModel = EconifyViewModel()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val emailText = viewModel.emailText.collectAsState().value


        ForgetPass(
            onClickBack = {navigator?.pop()},
            onClickButton = {navigator?.push(EnterOTPScreen())},
            emailText = emailText,
            onEmailChange = viewModel::onEmailChange
        )
    }
}