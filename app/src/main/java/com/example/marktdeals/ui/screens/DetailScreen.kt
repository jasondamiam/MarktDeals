package com.example.marktdeals.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.Product
import com.example.marktdeals.ui.components.Green
import com.example.marktdeals.ui.components.StorePriceRow

@Composable
fun DetailScreen(
    product: Product,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(12.dp)
    ) {

        Text(
            text = "‹ Terug",
            color = Green,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(bottom = 12.dp)
                .clickable { onBack() }
        )

        Text(
            text = product.icon,
            fontSize = 48.sp
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = product.name,
            fontSize = 22.sp
        )

        Spacer(Modifier.height(4.dp))

        Text(
            text = product.description,
            fontSize = 12.sp
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = "Product informatie",
            fontSize = 16.sp
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Inhoud en gewicht:\n${product.weight}\n\nBereiden en gebruik:\n${product.usage}",
            fontSize = 12.sp
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = "Prijzen per winkel",
            fontSize = 16.sp
        )

        Spacer(Modifier.height(8.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            product.storePrices.forEachIndexed { index, storePrice ->
                StorePriceRow(
                    storePrice = storePrice
                )
            }
        }
    }
}