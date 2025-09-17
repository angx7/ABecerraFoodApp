package com.example.abecerrafoodapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.abecerrafoodapp.R
import com.example.abecerrafoodapp.ui.theme.ColorPrincipal

@Composable
fun Header() {
    val User = "Taco"
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Profile",
            tint = ColorPrincipal,
            modifier = Modifier
                .size(40.dp)
        )
        Text(
            text = stringResource(id = R.string.greeting_message, User),
            style = MaterialTheme.typography.headlineMedium,
            color = Color.DarkGray,
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp)
        )
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ExitToApp,
            contentDescription = "Logout",
            tint = ColorPrincipal,
            modifier = Modifier
                .size(40.dp)
        )
    }
}