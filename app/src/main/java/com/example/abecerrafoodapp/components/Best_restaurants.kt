package com.example.abecerrafoodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.abecerrafoodapp.R
import com.example.abecerrafoodapp.dataclasses.Restaurants

@Composable
fun Best_restaurants() {
    Text(
        text = stringResource(R.string.popular_restaurants),
        style = MaterialTheme.typography.headlineSmall,
        color = Color.DarkGray,
        modifier = Modifier
            .padding(top = 20.dp, bottom = 10.dp)
    )
    LazyRow (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ){
        items(Restaurants){ restaurant ->
            Column(
                modifier = Modifier
                    .padding(end = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier.size(105.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .size(100.dp)
                            .align(Alignment.CenterHorizontally),
                        model = restaurant.imageUrl,
                        contentDescription = restaurant.name,
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = restaurant.name,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.DarkGray,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
            }
        }
    }
}