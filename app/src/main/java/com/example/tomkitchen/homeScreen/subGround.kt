package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomkitchen.R

@Composable
fun SubGround() {
    Box(
        modifier = Modifier
            .absoluteOffset(x = 180.dp, y = 40.dp) // Corresponds to left: 148px and top: 58px
            .size(width = 187.61422729492188.dp, height = 168.dp) // Corresponds to width: 188 and height: 168
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Electric Tom pasta dish",
            modifier = Modifier.fillMaxSize() // The image fills the size of its parent Box
        )
    }
}

@Preview
@Composable
fun SubGroundPreview() {
    Box(modifier = Modifier.fillMaxSize()) { // Ensures the preview area is large enough to show SubGround
        SubGround()
    }
}