package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer // For adding space
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon // Using Material3 Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily // Assuming IBM Plex Sans Arabic would be defined
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R // Ensure this R file is correct for your project
@Composable
fun CheeseTag() { // Assuming this is correctly implemented as per your code
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFFD0E5F0), // Light blue background
                shape = RoundedCornerShape(8.dp)
            )
            // .size(width = 91.dp, height = 30.dp) // Size can be determined by content
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_4), // Assuming img_4 is the cheese bag icon
            contentDescription = "Cheese Icon",
            modifier = Modifier.size(16.dp),
            // tint = Color(0xFF03578A) // Tint if the icon is single color
        )
        Text(
            text = "5 cheeses", // Example text
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF03578A) // Dark blue text color
            )
        )
    }
}


@Composable
fun FoodTitle() {
    Box(
        modifier = Modifier
            .size(328.dp, 74.dp)
    ){
        Column(
            // For spacing children vertically within the Column:
            verticalArrangement = Arrangement.spacedBy(8.dp), // Adjusted spacing for example
            // For aligning children horizontally within the Column:
            horizontalAlignment = Alignment.Start // Example: Align children to the start
            // modifier = Modifier.padding(16.dp) // Optional padding for the Column itself
        ) {
            // Row for the title "Electric Tom pasta"
            Row(
                verticalAlignment = Alignment.CenterVertically
                // No specific horizontalArrangement needed if Box takes defined size or fills.
            ) {
                Box(
                    modifier = Modifier.size(width = 178.dp, height = 32.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Electric Tom pasta",
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif, // Placeholder
                            fontWeight = FontWeight.Medium,
                            fontSize = 20.sp,
                            lineHeight = 32.sp,
                            letterSpacing = 0.sp,
                            color = Color(0xDE1F1F1E)
                        )
                    )
                }
            }

            // Row for the CheeseTag
            Row { // This Row will contain the CheeseTag
                CheeseTag()
            }
        }
        Column(
            modifier = Modifier
                .offset(304.dp,25.dp)
                .size(24.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(5.dp)), // border-radius: 5px;
                contentAlignment = Alignment.Center // To center the Image within the Box
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_7), // Ensure R.drawable.img_7 exists
                    contentDescription = "Heart Icon",
                    modifier = Modifier.size(24.dp) // Icon size, could also be fillMaxSize() if Box is just for clipping/background
                )
            }
        }

    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0F0F0) // Light gray background for preview
@Composable
fun FoodTitlePreview() {
    FoodTitle()
}