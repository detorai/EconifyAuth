package com.example.eonifyauth.ui.enterOTP

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.ArrowBack
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.ClickableTextEx
import com.example.eonifyauth.common.ImageBox
import com.example.eonifyauth.common.ScreenName
import com.example.eonifyauth.common.TextDescription
import com.example.eonifyauth.ui.enterOTP.common.FullBoxTextField
import com.example.eonifyauth.ui.theme.P100

@Composable
fun EnterOTP(
    onClickBack: () -> Unit,
    onClickButton:() -> Unit,
    codeText: List<String>,
    onValueChange: (Int,String) -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        ArrowBack(
            modifier = Modifier.align(Alignment.TopStart),
            onClickBack = onClickBack
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageBox(
                color = P100,
                id = R.drawable.postwrite
            )
            ScreenName(
                text = "Enter OTP"
            )
            TextDescription(
                text = "Enter the OTP code we just sent\n" +
                        "you on your registered Email/Phone number"
            )
            FullBoxTextField(
                modifier = Modifier
                    .width(345.dp)
                    .padding(0.dp, 32.dp, 0.dp, 0.dp),
                codeText = codeText ,
                onValueChange = onValueChange,

            )
            BigButton(
                text = "Reset Password",
                modifier = Modifier.padding(0.dp, 52.dp, 0.dp, 0.dp).size(345.dp, 60.dp),
                onClickButton = onClickButton
            )
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.width(345.dp).padding(0.dp, 16.dp, 0.dp, 0.dp)
            ) {
                ClickableTextEx(
                    onClick = {},
                    clickable = "Resend OTP",
                    nonClickable = "Didn’t get OTP? "
                )
            }
        }
    }
}
