package com.example.eonifyauth.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class EconifyViewModel: ViewModel() {
    private var _nameText = MutableStateFlow("")
    var nameText = _nameText.asStateFlow()

    private var _emailText = MutableStateFlow("")
    var emailText = _emailText.asStateFlow()

    private var _passwordText = MutableStateFlow("")
    var passwordText = _passwordText.asStateFlow()

    private var _passwordVisible = MutableStateFlow(false)
    var passwordVisible = _passwordVisible.asStateFlow()

    private var _repeatPasswordText = MutableStateFlow("")
    var repeatPasswordText = _repeatPasswordText.asStateFlow()

    private var _repeatPasswordVisible = MutableStateFlow(false)
    var repeatPasswordVisible = _repeatPasswordVisible.asStateFlow()

    private var _codeText = List(5) { MutableStateFlow("") }
    var codeText = _codeText.map { it.asStateFlow() }


    fun onNameChange(text: String){
        _nameText.value = text
    }

    fun onEmailChange(text: String){
        _emailText.value = text
    }

    fun onPasswordChange(text: String){
        _passwordText.value = text
    }

    fun passwordVisibleChange(){
        _passwordVisible.value = !_passwordVisible.value
    }

    fun onRepeatPasswordChange(text: String){
        _repeatPasswordText.value = text
    }

    fun repeatPasswordVisibleChange(){
        _repeatPasswordVisible.value = !_repeatPasswordVisible.value
    }

    fun onCodeChange(index: Int, text: String) {
        if (index in _codeText.indices) {
            _codeText[index].value = text
        }
    }
}

