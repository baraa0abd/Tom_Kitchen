package com.example.tomkitchen.homeScreen
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R
import com.example.tomkitchen.ui.theme.TomKitchenTheme


@Composable
fun HighTensionCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0x80035484),
                shape = MaterialTheme.shapes.medium
            ),
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            modifier = Modifier
                .padding(start = 16.dp, bottom = 41.dp, top = 45.dp)
                .width(160.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp) // Gap between icon and text
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.img_2), // <--- CORRECTED: Use painterResource
                    contentDescription = "High Tension Icon",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp) // Standard icon size
                )
                Text(
                    text = "High tension",
                    style = TextStyle( // Use TextStyle directly for precise control
                        fontSize = 16.sp, // From Figma Typography: 16
                        fontWeight = FontWeight.Medium, // From Figma Typography: Medium
                        lineHeight = 16.sp, // From Figma Typography: 16
                        letterSpacing = 0.5.sp // From Figma Typography: 0.5px (often translates to sp)
                    ),
                    color = Color.White.copy(alpha = 0.87f), // From Figma Fill: FFFFFF 87%
                    modifier = Modifier
                        .width(98.dp) // From Figma Resizing: W 98 (Hug)
                        .height(16.dp) // From Figma Resizing: H 16 (Hug)

                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.img_1), // Assuming img_1 is the correct icon for "Shocking foods"
                    contentDescription = "Shocking Foods Icon",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp) // Standard icon size
                )
                Text(
                    text = "Shocking foods",
                    style = TextStyle( // Use TextStyle directly for precise control
                        fontSize = 16.sp, // From Figma Typography: 16
                        fontWeight = FontWeight.Medium, // From Figma Typography: Medium
                        lineHeight = 16.sp, // From Figma Typography: 16
                        letterSpacing = 0.5.sp // From Figma Typography: 0.5px (often translates to sp)
                    ),
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HighTensionCardPreview() {
    TomKitchenTheme {
        HighTensionCard()
    }
}