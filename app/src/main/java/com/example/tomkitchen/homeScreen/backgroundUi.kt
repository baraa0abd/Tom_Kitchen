package com.example.tomkitchen.homeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
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
            .size(width = 384.75.dp, height = 414.21.dp)
            .offset(x = (-205).dp, y = (-40).dp)
            .background(
                color = Color(0x33035484),
                shape = RoundedCornerShape(0.dp)
            )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0x80035484)

            )

    ) {
        ContentGround()
        SubGround()
        Box(
            modifier = Modifier
                .size(180.dp, 64.dp)
        ) {
            Column(
                modifier = Modifier
                    .absoluteOffset(x = 16.dp, y = 80.dp),
                horizontalAlignment = Alignment.Start // Example
            ) {
                Row(
                    // The commented out CSS: width: 130; height: 24; gap: 8px;
                    modifier = Modifier
                        // .width(130.dp) // If a fixed width for this Row is desired
                        .height(24.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp), // For 'gap: 8px' between Text and Image
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2), // Ensure R.drawable.img_2 exists
                        contentDescription = "High Tension Icon",
                        modifier = Modifier.size(24.dp) // Icon size matches commented height for Row
                    )
                    // Text "High tension"
                    // The commented out Column (width: 98; height: 16;) might imply text constraints
                    Text(
                        text = "High tension",
                        style = TextStyle(
                            // fontFamily = IbmPlexSansArabicFamily, // Uncomment for custom font
                            fontFamily = FontFamily.SansSerif,     // Placeholder
                            fontWeight = FontWeight.Medium,        // font-weight: 500
                            fontSize = 16.sp,                      // font-size: 16px
                            lineHeight = 16.sp, // line-height: 16px
                            letterSpacing = 0.5.sp,                // letter-spacing: 0.5px
                            textAlign = TextAlign.Center,          // text-align: center
                            color = Color(0xDEFFFFFF)              // background: #FFFFFFDE (White with ~87% opacity)
                        )
                        // modifier = Modifier.width(98.dp) // If fixed width for text is needed
                    )

                    // Image Icon
                }
            }
        }
        Column(
            modifier = Modifier
                .absoluteOffset(x = 16.dp, y = 118.dp), // Positions the entire Column
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                // This Row will contain both the Image and the Text
                modifier = Modifier
                    .height(24.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp), // Space between Icon and Text
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Image Icon First
                Image(
                    painter = painterResource(id = R.drawable.img_1), // Replace with your actual icon resource
                    contentDescription = "Shocking Foods Icon",
                    modifier = Modifier.size(24.dp) // Icon size
                )

                // Text "Shocking foods" Second
                Text(
                    text = "Shocking foods",
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,    // Placeholder for IBM Plex Sans Arabic
                        fontWeight = FontWeight.Medium,       // Corresponds to font-weight: 500
                        fontSize = 16.sp,
                        lineHeight = 16.sp,                   // Or adjust for better vertical centering with icon
                        letterSpacing = 0.5.sp,
                        textAlign = TextAlign.Start,          // Text aligns to its start
                        color = Color(0xDEFFFFFF)             // White with ~87% opacity
                    )
                    // modifier = Modifier.weight(1f) // Uncomment if Row has fixed width and text should fill remaining space
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