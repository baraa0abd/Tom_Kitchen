package com.example.tomkitchen.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomkitchen.R

// Re-using already defined composables from previous turns:
// (You should have these definitions in your files)

// DetailItem composable (from previous turns)
@Composable
fun DetailItem(iconRes: Int, value: String, label: String) {
    Column(
        modifier = Modifier
            .size(104.dp, 104.dp)
            .background(
                color = Color(0xFFD0E5F0),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp) // <--- This gap is 4dp
    ) {
        // Icon
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = label,
            modifier = Modifier.size(32.dp),
            tint = Color(0xFF03578A)
        )

        // Value text
        Text(
            text = value,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color(0xFF1F1F1E)
            )
        )

        // Label text
        Text(
            text = label,
            style = TextStyle(
                fontSize = 14.sp,
                color = Color.Gray
            )
        )
    }
}

// DetailsTextRow composable (from previous turns for "Details" title)
@Composable
fun DetailsTextRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            // No absoluteOffset here, relies on parent Column's stacking
            .padding(horizontal = 16.dp), // Add padding here if this text needs it relative to its parent
        horizontalArrangement = Arrangement.Start // Assuming it starts at the beginning
    ) {
        Text(
            text = "Details",
            modifier = Modifier
                .width(61.dp) // Layout Width: 61
                .height(16.dp), // Layout Height: 16
            style = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                color = Color(0xFF1F1F1E).copy(alpha = 0.87f)
            )
        )
    }
}


// DetailsCardsRow composable (from previous turns for the row of 3 cards)
@Composable
fun DetailsCardsRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth() // Fill the width of its parent Column
            .height(104.dp) // Fixed height as per design
            .padding(horizontal = 16.dp), // Add horizontal padding to align with "Details" text
        horizontalArrangement = Arrangement.spacedBy(8.dp), // Gap: 8px between cards
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Individual Detail Cards
        DetailItem(iconRes = R.drawable.img_3, value = "1000 V", label = "Temperature")
        DetailItem(iconRes = R.drawable.img_5, value = "3 sparks", label = "Time")
        DetailItem(iconRes = R.drawable.img_6, value = "1M 12K", label = "No. of deaths")
    }
}


// The main Details composable (rebuilt)
@Composable
fun Details() {
    // This 'Details' composable will now simply stack its sub-components
    // It should not have its own absoluteOffset if placed in ContentGround's stacking Column.
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .offset(10.dp, 190.dp), // Details section fills the width of its parent
        verticalArrangement = Arrangement.spacedBy(8.dp) // Example gap between Details title and cards row
    ) {
        DetailsTextRow() // The "Details" title
        DetailsCardsRow() // The row of three detail cards
    }
}
