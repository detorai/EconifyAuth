package com.example.eonifyauth.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ArrowBack(
    onClickBack: () -> Unit,
    modifier: Modifier
    ){
    IconButton(
        onClick = onClickBack,
        modifier = modifier.padding(14.dp, 39.dp, 0.dp, 0.dp)
    ){
        Icon(
            Icons.Default.ArrowBack,
            contentDescription = "Back Button"
        )
    }
}