package com.example.eonifyauth.ui.enterOTP.common

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.eonifyauth.ui.theme.G100
import com.example.eonifyauth.ui.theme.P100
import com.example.eonifyauth.ui.theme.P50

@Composable
fun BoxTextField(
    inputText: String,
    onValueChange: (String) -> Unit,
    onNextFocus: () -> Unit,
    modifier: Modifier
){
    BasicTextField(
        value = inputText,
        onValueChange = {
            if (it.length <=1){
                onValueChange(it)
                if (it.isNotEmpty()) {
                    onNextFocus()
                }
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        decorationBox = {innerTextField ->
    Box(
        modifier = modifier
            .size(56.dp, 70.dp)
            .border(
                width = 1.dp,
                color = G100,
                shape = RoundedCornerShape(12.dp)
            )
            .background(
                color = P50,
                shape = RoundedCornerShape(12.dp)
            )
            .focusable(),
        contentAlignment = Alignment.Center,
    ) {
        innerTextField()
    }
        }
    )
}


@SuppressLint("AutoboxingStateCreation")
@Composable
fun FullBoxTextField(
    numFields: Int,
    modifier: Modifier
) {
    val textValues = remember { List(numFields){ mutableStateOf("") } }
    var focusIndex by remember { mutableStateOf(0) }
    Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            for (i in 0 until numFields) {
                BoxTextField(
                    inputText = textValues[i].value,
                    onValueChange = { newValue -> textValues[i].value = newValue },
                    onNextFocus = {
                        if (i < numFields - 1){
                            focusIndex++
                        }
                    },
                    modifier = Modifier.focusable()
                        .onFocusChanged {
                            focusState ->
                            if (focusIndex != i && !focusState.isFocused){
                                focusIndex = i
                            }
                        }
                )
            }
        }
}
