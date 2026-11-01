package com.example.marktdeals.ui.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.products
import com.example.marktdeals.ui.components.ProductTile
import com.example.marktdeals.ui.components.SearchField

private val Green = Color(0xFF2C7D27)

@Composable
fun HomeScreen(
    onSearch: (String) -> Unit,
    onProduct: (com.example.marktdeals.Product) -> Unit,
    onCategory: (String) -> Unit
) {
    var query by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(12.dp)
    ) {

        SearchField(
            value = query,
            onValueChange = {
                query = it
            },
            onSearch = {
                onSearch(query)
            }
        )

        Spacer(Modifier.height(16.dp))

        HomeSection(
            title = "Meest Populaire Producten",
            category = "Meest Populaire Producten",
            onProduct = onProduct,
            onCategory = onCategory
        )

        HomeSection(
            title = "Beste Deals",
            category = "Beste Deals",
            onProduct = onProduct,
            onCategory = onCategory
        )

        HomeSection(
            title = "Nieuwe Deals",
            category = "Nieuwe Deals",
            onProduct = onProduct,
            onCategory = onCategory
        )

        Spacer(Modifier.height(12.dp))

        Text(
            "© MarktDeals",
            modifier = Modifier.padding(6.dp),
            color = Color.Gray,
            fontSize = 11.sp
        )
    }
}

@Composable
private fun HomeSection(
    title: String,
    category: String,
    onProduct: (com.example.marktdeals.Product) -> Unit,
    onCategory: (String) -> Unit
) {
    val categoryProducts = products.filter {
        it.category == category
    }

    Column {

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                title,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )

            Spacer(Modifier.weight(1f))

            Text(
                "Zie alles",
                color = Green,
                fontSize = 11.sp,
                modifier = Modifier.clickable {
                    onCategory(category)
                }
            )
        }

        Spacer(Modifier.height(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {

            categoryProducts.forEach { product ->
                ProductTile(
                    product = product,
                    onClick = onProduct
                )
            }
        }

        Spacer(Modifier.height(13.dp))
    }
}