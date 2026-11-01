package com.example.marktdeals.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TopBar(
    showBack: Boolean,
    onBack: () -> Unit,
    onHome: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(62.dp)
            .background(Green)
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        if (showBack) {
            IconButton(onClick = onBack) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = "Terug",
                    tint = Color.White
                )
            }
        } else {
            Icon(
                Icons.Default.ShoppingCart,
                contentDescription = null,
                tint = Color(0xFF9EEA73),
                modifier = Modifier.size(38.dp)
            )
        }

        Spacer(Modifier.width(8.dp))

        Text(
            "MarktDeals",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(Modifier.weight(1f))

        if (showBack) {
            TextButton(onClick = onHome) {
                Text(
                    "Home",
                    color = Color.White
                )
            }
        }
    }
}