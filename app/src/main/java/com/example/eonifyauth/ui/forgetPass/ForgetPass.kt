package com.example.eonifyauth.ui.forgetPass

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.ArrowBack
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.ImageBox
import com.example.eonifyauth.common.ScreenName
import com.example.eonifyauth.common.TextDescription
import com.example.eonifyauth.common.TextFieldRow
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50

@Composable
fun ForgetPass(
    onClickButton: ()-> Unit,
    onClickBack:() -> Unit,
    emailText: String,
    onEmailChange: (String) -> Unit,
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
                text = "Forget Password"
            )
            TextDescription(
                text = "It was popularised in the 1960s with the release\n of Letraset sheetscontaining Lorem Ipsum."
            )
            TextFieldRow(
                writingText = emailText,
                onValueChange = onEmailChange,
                trailingIcon = {},
                textPlaceHolder = "Email I’D/ Mobile Number",
                modifier = Modifier
                    .padding(
                        0.dp, 24.dp, 0.dp, 0.dp
                    )
                    .size(345.dp, 60.dp)
                    .background(
                        color = P50,
                        shape = RoundedCornerShape(14.dp)
                    )
            )
            BigButton(
                text = " Countine",
                modifier = Modifier.padding(0.dp, 32.dp, 0.dp ,0.dp).size(345.dp, 60.dp),
                onClickButton = onClickButton
            )
        }
    }
}