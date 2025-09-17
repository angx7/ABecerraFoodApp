package com.example.abecerrafoodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.abecerrafoodapp.R
import com.example.abecerrafoodapp.dataclasses.foods
import com.example.abecerrafoodapp.ui.theme.*



@Composable
fun Best_dishes() {
    Text(
        text = stringResource(R.string.best_dishes),
        style = MaterialTheme.typography.headlineSmall,
        color = Color.DarkGray,
        modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
    )
        val hSpacing = 12.dp
        val vSpacing = 12.dp

        BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
            val itemWidth = (maxWidth - hSpacing) / 2

            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                maxItemsInEachRow = 2,
                horizontalArrangement = Arrangement.spacedBy(hSpacing),
                verticalArrangement = Arrangement.spacedBy(vSpacing)
            ) {
                foods.forEach { food ->
                    Column(modifier = Modifier.width(itemWidth)) {
                        Card(
                            modifier = Modifier
                                .height(120.dp)
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                        ) {
                            // Box 1: contenedor para superponer
                            Box(modifier = Modifier.fillMaxSize()) {
                                AsyncImage(
                                    model = food.imageUrl,
                                    contentDescription = food.name,
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )

                                // Box 2: etiqueta de precio en esquina inferior derecha
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.BottomEnd)
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(ColorPrincipal)
                                        .width(60.dp)
                                        .height(30.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "$${food.price}",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color.White,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }

                        // Rating + nombre
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "${food.rating}",
                                tint = StarIconColor,
                                modifier = Modifier.size(20.dp)
                            )
                            Text(
                                text = food.rating.toString(),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.DarkGray,
                                modifier = Modifier.padding(start = 5.dp)
                            )
                            Text(
                                text = food.name,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.DarkGray,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                        }
                    }
                }
            }
        }
    }
