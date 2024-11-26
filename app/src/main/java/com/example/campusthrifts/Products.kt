package com.example.campusthrifts

data class Products(

val id: String? = null,          // The ID of the product (generated by Firebase)
val name: String? = null,        // Product name
val price: Double? = null,       // Product price
val description: String? = null, // Product description
val imageUrl: String? = null,    // URL of the product image in Firebase Storage
val category: String? = null,    // Category of the product (Clothes, Furniture, etc.)
val dateAdded: Long? = null,     // Timestamp when the product was added
val uid: String? = null          // User ID (UID) of the person who added the product

)