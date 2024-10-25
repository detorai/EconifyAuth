package com.example.eonifyauth.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.ui.theme.P600

@Composable
fun ScreenName(
    text: String
){
    Text(
        text,
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
}