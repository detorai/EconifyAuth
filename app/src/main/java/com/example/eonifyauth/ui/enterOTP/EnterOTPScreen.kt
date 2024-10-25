package com.example.eonifyauth.ui.enterOTP

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.EconifyViewModel
import com.example.eonifyauth.ui.resetPassword.ResetPasswordScreen

class EnterOTPScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey
    private val viewModel = EconifyViewModel()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val codeText = viewModel.codeText.map { it.collectAsState("") }.map { it.value }


        EnterOTP(
            onClickButton = {navigator?.push(ResetPasswordScreen())},
            onClickBack = {navigator?.pop()},
            codeText = codeText,
            onValueChange = viewModel::onCodeChange
        )
    }
}