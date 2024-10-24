package com.example.eonifyauth.ui.forgetPass

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eonifyauth.R
import com.example.eonifyauth.common.BigButton
import com.example.eonifyauth.common.TextFieldRow
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50
import com.example.eonifyauth.ui.theme.P600

@Composable
fun ForgetPass(
    onClickButton: ()-> Unit,
    onClickBack:() -> Unit
){
    var emailText by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        IconButton(
            onClick = onClickBack,
            modifier = Modifier.align(Alignment.TopStart).padding(14.dp, 39.dp, 0.dp, 0.dp)
        ){
            Icon(
                Icons.Default.ArrowBack,
                contentDescription = "Back Button"
            )
        }

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
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.postwhrite),
                    contentDescription = "Postwrite",
                    modifier = Modifier.size(70.dp, 70.dp)
                )
            }
            Text(
                "Forget Password",
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
                writingText = emailText,
                onValueChange = {emailText = it},
                trailingIcon = {},
                textPlaceHolder = "Email I’D/ Mobile Number",
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
            BigButton(
                text = " Countine",
                modifier = Modifier.padding(0.dp, 32.dp, 0.dp ,0.dp).size(345.dp, 60.dp),
                onClickButton = onClickButton
            )
        }
    }
}