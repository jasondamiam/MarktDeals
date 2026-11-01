package com.example.marktdeals.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.Product
import com.example.marktdeals.products
import com.example.marktdeals.ui.components.SearchField

@Composable
fun SearchScreen(
    query: String,
    onQuery: (String) -> Unit,
    onSearch: (String) -> Unit
) {
    val trends = listOf(
        "Tomaten soep", "Gehakt", "Tablet Papier", "Rally luiers",
        "Coca-Cola", "Saucijzenbroodjes", "Kaas", "Melk"
    )
    Column(
        Modifier
            .fillMaxSize()
            .padding(14.dp)
    ) {
        SearchField(
            query,
            onQuery,
            placeholder = "Zoek",
            onSearch = {
                onSearch(query)
            }
        )
        Spacer(Modifier.height(12.dp))
        Text("Trending", fontWeight = FontWeight.Bold, fontSize = 13.sp)
        Spacer(Modifier.height(5.dp))
        trends.forEach { item ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(30.dp)
                    .background(Color(0xFFE1E1E1))
                    .clickable {
                        onQuery(item)
                        onSearch(item)
                    }
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(item, fontSize = 12.sp)
            }
            HorizontalDivider()
        }
    }
}