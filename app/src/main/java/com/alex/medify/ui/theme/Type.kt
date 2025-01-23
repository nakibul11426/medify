package com.alex.medify.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.alex.medify.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val helvetica = FontFamily(
    Font(R.font.helvetica, FontWeight.Thin),
    Font(R.font.helvetica, FontWeight.Normal),
    Font(R.font.helvetica, FontWeight.Light),
    Font(R.font.helvetica, FontWeight.Medium),
    Font(R.font.helvetica, FontWeight.SemiBold),
    Font(R.font.helvetica, FontWeight.Bold),
)