package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
// Removed unused imports like absoluteOffset, offset from this context for clarity
import androidx.compose.foundation.shape.RoundedCornerShape
// import androidx.compose.material3.Icon // Using Image as per your code for R.drawable
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
import com.example.tomkitchen.R // Make sure this import is correct

// 1. Composable for a single detail card
@Composable
fun DetailItem(iconRes: Int, value: String, label: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .width(118.dp) // As per your layout attempt for a card
            .height(109.dp) // As per your layout attempt for a card
            .background(
                color = Color(0xFFD0E5F0), // Background from your image/code
                shape = RoundedCornerShape(12.dp) // Rounded corners
            )
            .padding(12.dp), // Padding for content within the card
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp) // Spacing between elements in the card
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = label, // For accessibility
            modifier = Modifier.size(32.dp)
            // If your icons are vector drawables that need tinting:
            // tint = Color(0xFF03578A) // Example tint from your first image
        )
        Text(
            text = value,
            style = TextStyle(
                fontWeight = FontWeight.Medium, // As per your text style for "1000 V"
                fontSize = 20.sp,           // As per your text style for "1000 V"
                color = Color(0xFF1F1F1E)   // A suitable dark color for the value
            ),
            textAlign = TextAlign.Center
        )
        Text(
            text = label,
            style = TextStyle(
                fontFamily = FontFamily.Default,      // As per your text style for "Temperature"
                fontWeight = FontWeight.Medium,     // As per your text style for "Temperature"
                fontSize = 12.sp,                 // As per your text style for "Temperature"
                lineHeight = 12.sp,               // As per your text style for "Temperature"
                letterSpacing = 0.5.sp,           // As per your text style for "Temperature"
                color = Color(0xFF121212).copy(alpha = 0.37f) // As per your text style for "Temperature"
            ),
            textAlign = TextAlign.Center
        )
    }
}

// 2. Composable for the "Details" title row
@Composable
fun DetailsTextRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp), // Give it some breathing room
        horizontalArrangement = Arrangement.Start
    ) {
        Text(
            text = "Details",
            style = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Medium,  // 500 weight
                fontSize = 18.sp,
                lineHeight = 32.sp, // From your original DetailItem's attempt at the title
                letterSpacing = 0.5.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
            )
        )
    }
}

// 3. Composable for the row of three detail cards
@Composable
fun DetailsCardsRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp), // Overall padding for the row of cards
        // horizontalArrangement = Arrangement.spacedBy(8.dp), // Fixed spacing between cards
        horizontalArrangement = Arrangement.SpaceBetween, // This will push cards to fill available space if widths allow
        verticalAlignment = Alignment.Top // Align cards to the top if they have different heights (though ours are fixed)
    ) {
        // Ensure these drawables exist (R.drawable.img_3, R.drawable.img_5, R.drawable.img_6)
        // The image only shows one icon type, replace img_5 and img_6 with actual icons.
        DetailItem(iconRes = R.drawable.img_3, value = "1000 V", label = "Temperature")
        DetailItem(iconRes = R.drawable.img_5 ?: R.drawable.img_3, value = "3 sparks", label = "Time") // Fallback icon
        DetailItem(iconRes = R.drawable.img_6 ?: R.drawable.img_3, value = "1M 12K", label = "No. of deaths") // Fallback icon
    }
}

// 4. Composable to combine the title and cards section
@Composable
fun DetailsSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp) // Space between title and cards
    ) {
        DetailsTextRow()
        DetailsCardsRow()
    }
}

// Preview for the entire section
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun DetailsSectionPreview() {
    // If this section needs to be offset from the top in a larger screen:
    // Column(Modifier.padding(top = 166.dp)) { // Simulates an offset like your .absoluteOffset(y = 166.dp)
    //    DetailsSection()
    // }
    DetailsSection() // Previewing without the large offset for component-level view
}

// Preview for a single DetailItem
@Preview(showBackground = true, backgroundColor = 0xFFD0E5F0) // Background similar to card
@Composable
fun SingleDetailItemPreview() {
    DetailItem(iconRes = R.drawable.img_3, value = "1000 V", label = "Temperature")
}