package com.example.eonifyauth.ui.signUp

import android.annotation.SuppressLint
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.ClickableTextEx
import com.example.eonifyauth.common.ImageBox
import com.example.eonifyauth.common.ScreenName
import com.example.eonifyauth.common.TextDescription
import com.example.eonifyauth.common.TextFieldRow
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50
import com.example.eonifyauth.ui.theme.P500
import com.example.eonifyauth.ui.theme.P600

@SuppressLint("UnrememberedMutableState")
@Composable
fun SignUp(
    onClick: ()-> Unit,
    passwordText: String,
    nameText: String,
    emailText: String,
    passwordVisible: Boolean,
    onEmailChange: (String) -> Unit,
    onNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    visibleChange: () -> Unit
){
    val checkedState = remember { mutableStateOf(false) }

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
                id = R.drawable.claps
            )
            ScreenName(
                text = "Sign Up"
            )
            TextDescription(
                text = "It was popularised in the 1960s with the release\n of Letraset sheetscontaining Lorem Ipsum."
            )
            TextFieldRow(
                writingText = nameText,
                onValueChange = onNameChange,
                trailingIcon = {},
                textPlaceHolder = "Name",
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
            TextFieldRow(
                writingText = emailText,
                onValueChange = onEmailChange,
                trailingIcon = {},
                textPlaceHolder = "Email/Phone Number",
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
                    .padding(0.dp, 13.dp, 0.dp, 0.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                Column(
                    modifier = Modifier.size(44.dp, 38.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ) {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        colors  = CheckboxDefaults.colors(
                            checkedColor = P50,
                            checkmarkColor = P500,
                            uncheckedColor = P50,
                            disabledUncheckedColor = P50

                        ),
                        modifier = Modifier.size(24.dp,24.dp)

                    )
                }
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        buildAnnotatedString {
                            append("I'm agree to The ")
                            withStyle(SpanStyle(color = P600)) {
                                append("Tarms of Service ")
                            }
                            append("and ")
                            withStyle(SpanStyle(color = P600)) {
                                append("Privacy Policy")
                            }

                        }
                    )
                }
            }
            BigButton(
                text = "Create Account",
                modifier = Modifier
                    .padding(0.dp, 36.dp, 0.dp, 0.dp)
                    .size(345.dp, 60.dp),
                onClickButton = {}
                )
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .width(345.dp)
                    .padding(0.dp, 24.dp, 0.dp, 0.dp)
            ) {
                ClickableTextEx(
                    onClick = onClick,
                    nonClickable = "Do you have account? ",
                    clickable = "Sign In"
                )
            }
        }
    }
}