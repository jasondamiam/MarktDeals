package com.example.marktdeals.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.StorePrice

@Composable
fun StorePriceRow(
    storePrice: StorePrice
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = storePrice.store,
                fontSize = 14.sp
            )

            Text(
                text = storePrice.offerText,
                fontSize = 11.sp
            )
        }

        Text(
            text = storePrice.price,
            fontSize = 14.sp
        )
    }
}