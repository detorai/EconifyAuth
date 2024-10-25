package com.example.eonifyauth.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.eonifyauth.R
import com.example.eonifyauth.ui.theme.P100

@Composable
fun ImageBox(
    color: Color,
    @DrawableRes id: Int
){

    Box(
        modifier = Modifier
            .size(90.dp, 90.dp)
            .background(
                color = color,
                shape = RoundedCornerShape(25)
            ),
        contentAlignment = Alignment.Center
    ){
        Image(
            bitmap = ImageBitmap.imageResource(id),
            contentDescription = "Image",
            modifier = Modifier.size(70.dp,70.dp)
        )
    }
}