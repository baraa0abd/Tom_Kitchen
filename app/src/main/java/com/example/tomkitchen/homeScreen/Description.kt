package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .absoluteOffset(x = 16.dp, y = 106.dp)
            .padding(end = 16.dp) // Add right padding to prevent text from touching screen edge
    ) {
        Text(
            text = "Pasta cooked with a charger cable" +
                    " and sprinkled with questionable" +
                    " cheese.Make sure to unplug it before " +
                    "eating (or not, you decide).",
            style = TextStyle(
                fontFamily = FontFamily.Default, // Replace with your IBM Plex Sans Arabic font
                fontWeight = FontWeight.Medium, // 500 weight
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.5.sp,
                color = Color.Black.copy(alpha = 0.87f)
            ),
        )
    }
}