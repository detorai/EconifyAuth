package com.example.eonifyauth.ui.signUp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.eonifyauth.ui.EconifyViewModel
import com.example.eonifyauth.ui.signIn.SignInScreen

class SignUpScreen: Screen {

    override val key: ScreenKey = uniqueScreenKey

    private val viewModel = EconifyViewModel()

    @Composable
    override fun Content() {

        val navigator = LocalNavigator.current

        val nameText = viewModel.nameText.collectAsState().value
        val emailText = viewModel.emailText.collectAsState().value
        val passwordText = viewModel.passwordText.collectAsState().value
        val passwordVisible = viewModel.passwordVisible.collectAsState().value

        SignUp(
            onClick = {navigator?.push(SignInScreen())},
            nameText = nameText,
            emailText = emailText,
            passwordText = passwordText,
            passwordVisible = passwordVisible,
            onNameChange = viewModel::onNameChange,
            onEmailChange = viewModel::onEmailChange,
            onPasswordChange = viewModel::onPasswordChange,
            visibleChange = viewModel::passwordVisibleChange
        )
    }
}