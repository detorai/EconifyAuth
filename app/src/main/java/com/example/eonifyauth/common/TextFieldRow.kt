@file:Suppress("UNUSED_EXPRESSION")

package com.example.eonifyauth.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.ui.theme.P50

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldRow(
    writingText: String,
    onValueChange: (String) -> Unit,
    trailingIcon:@Composable () -> Unit,
    textPlaceHolder: String,
    modifier: Modifier
    ) {
    OutlinedTextField(
        modifier = modifier,
        value = writingText,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                textPlaceHolder,
                color = Color.LightGray,
                fontSize = 16.sp
            )
        },
        trailingIcon = { trailingIcon },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.White,
            unfocusedBorderColor = Color.White)
    )
}