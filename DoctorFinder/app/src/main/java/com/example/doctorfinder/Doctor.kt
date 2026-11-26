package com.example.doctorfinder

data class Doctor(
    val id: Int,
    val name: String,
    val expertise: String,
    val workplace: String,
    val address: String,
    val qualification: String
) {
    val initials: String
        get() = name.removePrefix("Dr. ").split(" ").take(2)
            .joinToString("") { it.first().uppercase() }
}
