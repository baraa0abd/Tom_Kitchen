package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ContentGround() {
    Box(
        modifier = Modifier
            .size(400.dp, 610.dp)
            .absoluteOffset(y = 202.dp)
            .background(
                color = Color(0xFFEEF4F6),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp
                )
            )
    ){
        FoodTitle()
        Description()
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun contentGroundPreview() {
    Box(modifier = Modifier.fillMaxSize()) { // Changed to fillMaxSize to better show the positioned ContentGround
        ContentGround()
    }
}