package com.example.eonifyauth.ui.signIn

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.EconifyViewModel
import com.example.eonifyauth.ui.forgetPass.ForgetPassScreen

class SignInScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    private val viewModel = EconifyViewModel()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        val emailText = viewModel.emailText.collectAsState().value
        val passwordText = viewModel.passwordText.collectAsState().value
        val passwordVisible = viewModel.passwordVisible.collectAsState().value


        SignIn(
            onClick = {navigator?.pop()},
            onClickForget = {navigator?.push(ForgetPassScreen())},
            emailText = emailText,
            passwordText = passwordText,
            passwordVisible = passwordVisible,
            onEmailChange = viewModel::onEmailChange,
            onPasswordChange = viewModel::onPasswordChange,
            visibleChange = viewModel::passwordVisibleChange
        )
    }
}