package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer // For adding space
// import androidx.compose.foundation.layout.absoluteOffset // Avoid if possible for better responsiveness
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
// import androidx.compose.material3.Icon // Using Image for Heart Icon for now
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R // Ensure this R file is correct

@Composable
fun CheeseTag() {
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFFD0E5F0), // Light blue background
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_4), // Assuming img_4 is cheese bag
            contentDescription = "Cheese Icon",
            modifier = Modifier.size(16.dp)
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
fun FoodItemDetails() { // Renamed 'content' to be more descriptive
    Column(
        modifier = Modifier
            .width(328.dp) // Overall width of the content block
            .padding(16.dp), // Padding around the content block
        verticalArrangement = Arrangement.spacedBy(8.dp) // Space between title_row, cheese_tag, description
    ) {
        // Row for Title and Heart Icon
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween, // Pushes title left, heart right
            verticalAlignment = Alignment.Top // Align items to the top of this Row
        ) {
            Text(
                text = "Electric Tom pasta",
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif, // Placeholder
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    // lineHeight = 32.sp, // Line height can often be inferred or set slightly larger
                    letterSpacing = 0.sp, // Assuming 0px letter spacing means 0.sp
                    color = Color(0xDE1F1F1E) // Approx 87% opacity for #1F1F1E
                ),
                modifier = Modifier.weight(1f) // Allows text to take available space before heart icon
            )
            Image(
                painter = painterResource(id = R.drawable.img_7), // Ensure R.drawable.img_7 is heart icon
                contentDescription = "Heart Icon",
                modifier = Modifier
                    .size(24.dp)
                // .clip(RoundedCornerShape(5.dp)) // Clipping if the icon itself isn't perfectly shaped or has a background
            )
        }

        // CheeseTag Row
        Row { // This Row helps in aligning the CheeseTag if needed, e.g., Alignment.Start
            CheeseTag()
        }

        // Description Text
        Text(
            text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            style = TextStyle(
                fontFamily = FontFamily.Default, // Replace with your IBM Plex Sans Arabic font if available
                fontWeight = FontWeight.Medium, // 500 weight
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.5.sp,
                color = Color.Black.copy(alpha = 0.6f) // #12121299 is roughly Black with 60% opacity
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFF0F0F0)
@Composable
fun FoodDetailsPreview() { // Renamed Preview function
    FoodItemDetails()
}