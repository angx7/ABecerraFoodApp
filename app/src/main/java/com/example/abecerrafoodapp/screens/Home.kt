package com.example.abecerrafoodapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.abecerrafoodapp.components.Header

@Composable
fun Home(innerPadding : PaddingValues) {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
    ){
        item {
            Header()
        }
    }
}