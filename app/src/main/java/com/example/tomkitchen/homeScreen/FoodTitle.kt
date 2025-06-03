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
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R

// Re-using CheeseTag and assuming Description is a composable, or implementing its details directly.
// For clarity, let's include the Description text details directly here.

@Composable
fun CheeseTag() {
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFFD0E5F0),
                shape = RoundedCornerShape(8.dp)
            )
            .size(width = 91.dp, height = 30.dp)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_4),
            contentDescription = "Cheese Icon",
            modifier = Modifier.size(16.dp),
            // tint = Color(0xFF03578A)
        )
        Text(
            text = "5 cheeses",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF03578A)
            )
        )
    }
}


@Composable
fun FoodTitle() {
    // Overall container for FoodTitle, defining its width and height
    Box(
        modifier = Modifier
            .size(328.dp, 142.dp) // width: 328, height: 142
            .absoluteOffset(x = 16.dp, y = 32.dp) // Position of the entire FoodTitle block
    ) {
        Column(
            modifier = Modifier.size(328.dp,60.dp), // Column fills the Box
            verticalArrangement = Arrangement.spacedBy(12.dp) // 12.dp gap between stacked items
        ) {
            // 1. Row for "Electric Tom pasta" and Heart Icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Electric Tom pasta",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 16.sp,
                        letterSpacing = 0.5.sp,
                        color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
                    ),
                    textAlign = TextAlign.Start, // Explicitly start aligned
                    modifier = Modifier
                        .width(178.dp) // Fixed width for the text
                        .height(20.dp) // Fixed height for the text
                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite",
                    tint = Color(0xFF1E88E5),
                    modifier = Modifier.size(24.dp)
                )
            }

            // 2. The "5 cheeses" tag
            CheeseTag()
            }
        }
    }
