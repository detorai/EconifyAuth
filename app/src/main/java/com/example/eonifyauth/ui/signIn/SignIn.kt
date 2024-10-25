package com.example.eonifyauth.ui.signIn

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.ClickableTextEx
import com.example.eonifyauth.common.ImageBox
import com.example.eonifyauth.common.ScreenName
import com.example.eonifyauth.common.TextDescription
import com.example.eonifyauth.common.TextFieldRow
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50

@Composable
fun SignIn(
    onClick: ()-> Unit,
    onClickForget: () -> Unit,
    emailText: String,
    passwordVisible: Boolean,
    passwordText: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    visibleChange: () -> Unit
){


    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ImageBox(
                color = P100,
                id = R.drawable.wave
            )
            ScreenName(
                text = "Sign In"
            )
            TextDescription(
                text = "It was popularised in the 1960s with the release\n of Letraset sheetscontaining Lorem Ipsum."
            )
            TextFieldRow(
                writingText = emailText,
                onValueChange = onEmailChange,
                trailingIcon = {},
                textPlaceHolder = "Email/Phone Number",
                modifier = Modifier
                    .padding(
                        0.dp, 83.dp, 0.dp, 0.dp
                    )
                    .size(345.dp, 60.dp)
                    .background(
                        color = P50,
                        shape = RoundedCornerShape(14.dp)
                    )
            )

            TextFieldRow(
                writingText = passwordText,
                onValueChange = onPasswordChange,
                visualTransformation =
                if (passwordVisible)
                    VisualTransformation.None
                else
                    PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(
                        onClick = visibleChange

                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.visof),
                            contentDescription = "visibilityOff"
                        )
                    }
                },
                textPlaceHolder = "Password",
                modifier = Modifier
                    .padding(
                        0.dp, 16.dp, 0.dp, 0.dp
                    )
                    .size(345.dp, 60.dp)
                    .background(
                        color = P50,
                        shape = RoundedCornerShape(14.dp)
                    )
            )
            Row(
                modifier = Modifier
                    .width(345.dp)
                    .padding(0.dp, 8.dp, 14.dp, 0.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    "Forget Password?",
                    fontSize = 12.sp,
                    color = Color.LightGray,
                    modifier = Modifier.clickable {
                        onClickForget()
                    }
                )
            }
            BigButton(
                text = "Log In",
                modifier = Modifier.padding(0.dp, 75.dp, 0.dp ,0.dp).size(345.dp, 60.dp),
                onClickButton = {}
            )
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.width(345.dp).padding(0.dp, 24.dp, 0.dp, 0.dp)
            ) {
                ClickableTextEx(
                    onClick = onClick,
                    nonClickable = "Don't have account? ",
                    clickable = "Sign Up"
                )
            }
        }
    }
}