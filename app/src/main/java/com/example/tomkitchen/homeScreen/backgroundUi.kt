package com.example.tomkitchen.homeScreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
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
    val scrollState = rememberLazyGridState()

    LazyVerticalGrid(
        columns = GridCells.Fixed(1), // Single column for full-width items
        state = scrollState,
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(0.dp) // Remove padding to match your original layout
    ) {
        item {
            // Your original HighTensionCard content exactly as is
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0x80035484))
            ) {
                Box(
                    modifier = Modifier
                        .width(360.75.dp)
                        .height(414.21.dp)
                        .offset(x = (-95).dp, y = (0).dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "Background Image",
                        modifier = Modifier.fillMaxSize()
                    )
                }
                ContentGround()
                SubGround()
                Box(
                    modifier = Modifier
                        .size(180.dp, 64.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .absoluteOffset(x = 16.dp, y = 80.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Row(
                            modifier = Modifier
                                .height(24.dp),
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_2),
                                contentDescription = "High Tension Icon",
                                modifier = Modifier.size(24.dp)
                            )
                            Text(
                                text = "High tension",
                                style = TextStyle(
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    lineHeight = 16.sp,
                                    letterSpacing = 0.5.sp,
                                    textAlign = TextAlign.Center,
                                    color = Color(0xDEFFFFFF)
                                )
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .absoluteOffset(x = 16.dp, y = 118.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier
                            .height(24.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = "Shocking Foods Icon",
                            modifier = Modifier.size(24.dp)
                        )
                        Text(
                            text = "Shocking foods",
                            style = TextStyle(
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp,
                                lineHeight = 16.sp,
                                letterSpacing = 0.5.sp,
                                textAlign = TextAlign.Start,
                                color = Color(0xDEFFFFFF)
                            )
                        )
                    }
                }
            }
        }

        // Add more items if needed while preserving your exact layout
        item {
            // Any additional content you want to scroll to
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