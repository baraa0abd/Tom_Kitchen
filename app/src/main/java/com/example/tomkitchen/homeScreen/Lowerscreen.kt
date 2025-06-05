package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.ui.theme.TomKitchenTheme // Assuming your theme is here

@Composable
fun Lowerscreen() {
    // The main container for this section, positioned absolutely
    Box(
        modifier = Modifier
            .width(400.dp) // Adjusted to fit content and offset from main screen
            .height(300.dp) // Adjusted height to accommodate all elements
            .absoluteOffset(x = 16.dp, y = 342.dp) // Position relative to the main screen
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp), // Overall padding for content inside this box
            verticalArrangement = Arrangement.spacedBy(8.dp) // Overall spacing for elements in this column
        ) {
            // "Preparation method" text
            Text(
                text = "Preparation method",
                style = TextStyle(
                    fontWeight = FontWeight.Medium, // 500 weight
                    fontSize = 18.sp,
                    lineHeight = 32.sp, // You might want to adjust this relative to font size
                    letterSpacing = 0.5.sp,
                    color = Color.DarkGray // Assuming a dark gray color
                ),
                modifier = Modifier.padding(bottom = 8.dp) // Space below title
            )

            // Column for the list of steps
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp) // 8px gap between step rows
            ) {
                StepRow(number = 1, text = "Put the pasta in a toaster.")
                StepRow(number = 2, text = "Pour battery juice over it.")
                StepRow(number = 3, text = "Wait for the spark to ignite.")
                StepRow(number = 4, text = "Serve with an an insulating glove.")
                StepRow(number = 5, text = "Serve with an an insulating glove.")
                StepRow(number = 6, text = "Serve with an an insulating glove.")
                StepRow(number = 7, text = "Serve with an an insulating glove.")
            }

            // "Add to cart" button
            // Assuming this button needs to be at the bottom, possibly with some spacing
            Spacer(modifier = Modifier.height(16.dp)) // Add some space before the button
            AddToCartButton()
        }
    }
}

@Composable
fun StepRow(number: Int, text: String) {
    Row(
        modifier = Modifier
            .size(450.dp,39.dp) ,// Row takes full width of its parent Column ,, // Fixed height of the row based on number circle
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(-17.dp) // Gap between number circle and text field
    ) {
        Box(
            modifier = Modifier
                .width(308.dp) // Fixed width: 308px
                .height(37.dp) // Fixed height: 32px
                .background(
                    color = Color.White, // Background #FFFFFF
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp) // Top-right 12px, Bottom-right 12px
                )
                .padding(
                    top = 8.dp,
                    end = 10.dp,
                    bottom = 8.dp,
                    start = 24.dp // Padding: Top 8px, Right 10px, Bottom 8px, Left 24px
                ),
            contentAlignment = Alignment.CenterStart // Align text to start
        ) {
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 16.sp, // Assuming standard text size for instructions
                    fontWeight = FontWeight.Normal,
                    color = Color.Black.copy(alpha = 0.8f) // Adjust text color as needed
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        // Step Number Circle
        Box(
            modifier = Modifier
                .offset(-310.dp)
                .size(36.dp) // 36x36px
                .background(Color.White, CircleShape) // Radius: 100px (CircleShape)
                .border(1.dp, Color(0xFFD0E5F0), CircleShape), // Border: 1px, #D0E5F0
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number.toString(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF035587)// Assuming black text for the number
                )
            )


        }

        // Step Text Field

    }
}

@Composable
fun AddToCartButton() {
    Button(
        onClick = { /* Handle click */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp), // Example height for a button
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1E88E5)), // Example blue color
        shape = RoundedCornerShape(12.dp) // Example rounded corners for the button
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Add to cart",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            // You might have a dot or spacing here
            Spacer(Modifier.width(8.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "3 cheeses",
                    color = Color.White.copy(alpha = 0.8f),
                    fontSize = 14.sp
                )
                Text(
                    text = "5 cheeses",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 12.sp,
                    textDecoration = TextDecoration.LineThrough
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LowerscreenPreview() {
    TomKitchenTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Lowerscreen()
        }
    }
}