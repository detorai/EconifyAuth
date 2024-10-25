package com.example.eonifyauth.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextDescription(
    text: String
){
    Text(
        text,
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
}