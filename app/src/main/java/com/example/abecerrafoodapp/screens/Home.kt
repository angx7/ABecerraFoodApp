package com.example.abecerrafoodapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.abecerrafoodapp.components.*

@Composable
fun Home(innerPadding : PaddingValues) {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(start = 20.dp, end = 20.dp)
    ){
        item {
            // Cabecera de la pantalla Home
            Header()

            // Carga de las categorías
            Categories()

            // Busca los restaurantes
            Best_restaurants()
        }
    }
}