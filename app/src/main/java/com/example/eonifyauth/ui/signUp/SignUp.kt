package com.example.eonifyauth.ui.signUp

import androidx.compose.foundation.Image
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
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.TextFieldRow
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50
import com.example.eonifyauth.ui.theme.P500
import com.example.eonifyauth.ui.theme.P600

@Composable
fun SignUp(){
    var writingText by remember { mutableStateOf("") }
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
            Box(
                modifier = Modifier
                    .size(90.dp, 90.dp)
                    .background(
                        color = P100,
                        shape = RoundedCornerShape(25)
                    ),
                contentAlignment = Alignment.Center
            ){
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.claps),
                    contentDescription = "Claps",
                    modifier = Modifier.size(70.dp,70.dp)
                )
            }
            Text(
                "Sign Up",
                fontSize = 32.sp,
                color = P600,
                modifier = Modifier.padding(
                    0.dp,
                    30.dp,
                    0.dp,
                    0.dp
                ),
                fontWeight = FontWeight.Bold
            )
            Text(
                "It was popularised in the 1960s with the release\n of Letraset sheetscontaining Lorem Ipsum.",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier
                    .padding(
                        0.dp,
                        16.dp,
                        0.dp,
                        0.dp
                    )
                    .fillMaxWidth(),
                fontWeight = FontWeight.Bold
            )

            TextFieldRow(
                writingText = writingText,
                onValueChange = {writingText = it},
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
                writingText = writingText,
                onValueChange = {writingText = it},
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
                writingText = writingText,
                onValueChange = {writingText = it},
                trailingIcon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.visof),
                            contentDescription = "visibilityOff"
                        )
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
                modifier = Modifier.padding(0.dp, 36.dp, 0.dp ,0.dp).size(345.dp, 60.dp)
                )
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.width(345.dp).padding(0.dp, 24.dp, 0.dp, 0.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        append("Do you have account?")
                        withStyle(SpanStyle(color = P600)) {
                            append(" Sign In")
                        }
                    }
                )
            }
        }
    }
}