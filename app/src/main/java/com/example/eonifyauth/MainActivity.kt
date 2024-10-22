package com.example.eonifyauth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cafe.adriel.voyager.navigator.Navigator
import com.example.eonifyauth.ui.enterOTP.EnterOTPScreen
import com.example.eonifyauth.ui.forgetPass.ForgetPassScreen
import com.example.eonifyauth.ui.resetPassword.ResetPasswordScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigator(ResetPasswordScreen())
        }
    }
}
