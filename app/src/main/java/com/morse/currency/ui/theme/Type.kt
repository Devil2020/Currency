package com.morse.currency.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.morse.currency.R

val sfProFamily = FontFamily(
    arrayListOf(
        Font(R.font.sf_pro_display_medium , weight = FontWeight.Medium) ,
        Font(R.font.sf_pro_display_semibold , weight = FontWeight.SemiBold) ,
        Font(R.font.sf_pro_display_heavy , weight = FontWeight.Black) ,
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = sfProFamily,
        fontWeight = FontWeight.Black,
        fontSize = 22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ) ,
    bodyMedium = TextStyle(
        fontFamily = sfProFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodySmall = TextStyle(
        fontFamily = sfProFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

)