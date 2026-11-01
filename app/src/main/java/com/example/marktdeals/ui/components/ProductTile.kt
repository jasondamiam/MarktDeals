package com.example.marktdeals.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marktdeals.Product

@Composable
fun ProductTile(
    product: Product,
    onClick: (Product) -> Unit
) {
    Card(
        modifier = Modifier
            .width(105.dp)
            .height(132.dp)
            .clickable {
                onClick(product)
            },
        shape = RoundedCornerShape(6.dp),
        colors = CardDefaults.cardColors(
            containerColor = Pale
        ),
        border = CardDefaults.outlinedCardBorder()
    ) {

        Column(
            modifier = Modifier.padding(7.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                product.icon,
                fontSize = 34.sp,
                modifier = Modifier.height(48.dp)
            )

            Text(
                product.name,
                fontSize = 11.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(Modifier.weight(1f))

            Text(
                "Vanaf ${product.price}",
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}