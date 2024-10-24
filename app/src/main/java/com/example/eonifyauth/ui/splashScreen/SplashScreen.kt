package com.example.eonifyauth.ui.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.R
import com.example.eonifyauth.ui.theme.P600
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(onTimeout: () -> Unit){
    LaunchedEffect(Unit) {
        delay(1000)
        onTimeout()
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth().fillMaxHeight()
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.logo),
                contentDescription = "Logo"
            )
            Text(
                "Econify",
                fontSize = 32.sp,
                color = P600,
                modifier = Modifier.padding(
                    0.dp,
                    32.dp,
                    0.dp,
                    0.dp
                ),
                fontWeight = FontWeight.Bold
            )
        }
    }
}