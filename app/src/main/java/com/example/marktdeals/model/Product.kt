package com.example.marktdeals

data class StorePrice(
    val store: String,
    val price: String,
    val offerText: String
)

data class Product(
    val name: String,
    val price: String,
    val category: String,
    val icon: String,
    val description: String,
    val weight: String,
    val usage: String,
    val storePrices: List<StorePrice>
)