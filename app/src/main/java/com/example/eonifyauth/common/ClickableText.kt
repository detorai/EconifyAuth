package com.example.eonifyauth.common

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.eonifyauth.ui.theme.P600

@Composable
fun ClickableTextEx(
    onClick:()->Unit,
    nonClickable: String,
    clickable: String
){
    val annotatedText = buildAnnotatedString {
        append(nonClickable)
        pushStringAnnotation ("signIn", "pushToSignIn")
        withStyle(SpanStyle(color = P600)) {
            append(clickable)
        }
        pop()
    }
    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(offset, offset).firstOrNull()?.let { annotation ->
                when (annotation.item) {
                    "pushToSignIn" -> onClick()
                }
            }
        }
    )
}