package com.example.eonifyauth.ui.resetPassword

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.EconifyViewModel

class ResetPasswordScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    private val viewModel = EconifyViewModel()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val passwordText = viewModel.passwordText.collectAsState().value
        val passwordVisible = viewModel.passwordVisible.collectAsState().value
        val repeatPasswordText = viewModel.repeatPasswordText.collectAsState().value
        val repeatPasswordVisible = viewModel.repeatPasswordVisible.collectAsState().value

        ResetPassword(
            onClickBack = {navigator?.pop()},
            onClickButton = {},
            passwordText = passwordText,
            passwordVisible = passwordVisible,
            onPasswordChange = viewModel::onPasswordChange,
            visibleChange = viewModel::passwordVisibleChange,
            repeatPasswordText = repeatPasswordText,
            repeatPasswordVisible = repeatPasswordVisible,
            onRepeatPasswordChange = viewModel::onRepeatPasswordChange,
            repeatVisibleChange = viewModel::repeatPasswordVisibleChange,
        )
    }
}