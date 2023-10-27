package com.example.phonesbrand.ui.model

import androidx.annotation.StringRes

data class PhoneUiModel(
    val phoneType: String,
    @StringRes val brand: Int?
)

enum class BrandCategory(val firstChar: String) {
    IPhone("i"),
    Samsung("s")
}