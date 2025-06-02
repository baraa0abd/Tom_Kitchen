package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R

@Composable
fun FoodTitle() {
    Column(
        modifier = Modifier
            .absoluteOffset(x = 16.dp, y = 32.dp)  // left: 16px, top: 32px
            .width(328.dp)                         // width: 328
            .height(62.dp)                         // height: 62
    ) {
        // Title row with favorite icon
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,  // justify-content: space-between
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Electric Tom pasta",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF1F1F1E).copy(alpha = 0.87f),
                    fontSize = 20.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp
                ),
                modifier = Modifier.width(178.dp)
            )

            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite",
                tint = Color(0xFF1E88E5),
                modifier = Modifier.size(24.dp)
            )
        }

        // Cheese tag
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .width(91.dp)
                .height(30.dp)
                .background(
                    color = Color(0xFFD0E5F0),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(
                    top = 4.dp,
                    bottom = 4.dp,
                    start = 8.dp,
                    end = 8.dp
                )
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_4),
                    contentDescription = "Cheese Icon",
                    modifier = Modifier.size(16.dp)
                )
                Text(
                    text = "5 cheeses",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun FoodTitlePreview() {
    MaterialTheme {
        Box(modifier = Modifier.size(400.dp, 150.dp)) {
            FoodTitle()
        }
    }
}