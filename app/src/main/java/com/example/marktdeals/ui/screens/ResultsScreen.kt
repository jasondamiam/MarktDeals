package com.example.marktdeals.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.marktdeals.Product
import com.example.marktdeals.products
import com.example.marktdeals.ui.components.ResultRow
import com.example.marktdeals.ui.components.SearchField

@Composable
fun ResultsScreen(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    onProduct: (Product) -> Unit
) {
    val results = products.filter { product ->
        product.name.contains(query, ignoreCase = true) ||
                product.category.contains(query, ignoreCase = true)
    }

    Column(
        Modifier.fillMaxSize()
    ) {
        SearchField(
            value = query,
            onValueChange = onQueryChange,
            placeholder = "Zoek naar een product",
            onSearch = {
                onSearch(query)
            }
        )

        Text(
            "${results.size} resultaten voor \"$query\"",
            modifier = Modifier.padding(12.dp),
            fontWeight = FontWeight.Bold
        )

        if (results.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Geen producten gevonden.",
                    color = Color.Gray
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    horizontal = 10.dp,
                    vertical = 2.dp
                ),
                verticalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                items(results) { product ->
                    ResultRow(product, onProduct)
                }
            }
        }
    }
}