package com.example.eonifyauth.common

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.ui.theme.P500

@Composable
fun BigButton(
    text: String,
    modifier: Modifier,
    onClickButton: ()-> Unit
){
    Button(
        shape = RoundedCornerShape(14.dp),
        onClick = onClickButton,
        colors = ButtonColors(
            contentColor = Color.White,
            containerColor = P500,
            disabledContentColor = Color.White,
            disabledContainerColor = P500
        ),
        modifier = modifier
    ) {
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}