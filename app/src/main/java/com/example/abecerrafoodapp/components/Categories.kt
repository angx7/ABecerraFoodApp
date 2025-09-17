package com.example.abecerrafoodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.abecerrafoodapp.R
import com.example.abecerrafoodapp.dataclasses.categories
import com.example.abecerrafoodapp.ui.theme.ColorPrincipal

@Composable
fun Categories() {
    Text(
        text = stringResource(R.string.our_categories),
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
        items(categories) { category ->
            Column (
                modifier = Modifier
                    .padding(end = 15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Box (
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(ColorPrincipal),
                    contentAlignment = Alignment.Center
                ){
                    AsyncImage(
                        modifier = Modifier
                            .size(70.dp),
                        model = category.imageUrl,
                        contentDescription = category.name
                    )
                }
                Text(
                    text = category.name,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.DarkGray,
                    modifier = Modifier
                        .padding(top = 5.dp)
                )
            }

        }
    }
}