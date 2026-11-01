package com.example.marktdeals.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.marktdeals.Product

@Composable
fun ResultRow(
    product: Product,
    onProduct: (Product) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(88.dp)
            .clickable {
                onProduct(product)
            },
        colors = CardDefaults.cardColors(
            containerColor = Pale
        ),
        shape = RoundedCornerShape(5.dp)
    ) {

        Row(
            Modifier
                .fillMaxSize()
                .padding(9.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                product.icon,
                fontSize = 38.sp,
                modifier = Modifier.width(58.dp)
            )

            Column(
                Modifier.weight(1f)
            ) {

                Text(
                    product.name,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    "Beste aanbieding gevonden",
                    fontSize = 10.sp,
                    color = androidx.compose.ui.graphics.Color.Gray
                )
            }

            Text(
                "− ${product.price}",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }
    }
}