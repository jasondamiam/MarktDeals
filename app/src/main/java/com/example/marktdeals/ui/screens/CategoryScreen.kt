package com.example.marktdeals.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.Product
import com.example.marktdeals.products
import com.example.marktdeals.ui.components.ResultRow

@Composable
fun CategoryScreen(
    category: String,
    onProduct: (Product) -> Unit
) {
    val categoryProducts = products.filter {
        it.category == category
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Text(
            text = category,
            fontSize = 20.sp
        )

        Spacer(Modifier.height(12.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(categoryProducts) { product ->
                ResultRow(
                    product = product,
                    onProduct = {
                        onProduct(product)
                    }
                )
            }
        }
    }
}