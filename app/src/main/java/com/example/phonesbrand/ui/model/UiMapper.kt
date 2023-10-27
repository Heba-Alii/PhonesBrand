package com.example.phonesbrand.ui.model

import com.example.phonesbrand.R
import com.example.phonesbrand.domain.model.PhonesDomainModel

fun PhonesDomainModel.toUiModel() = PhoneUiModel(
    phoneType = this.phoneType,
    brand = mapFirstLitterToBrandName(this.brand)
)

fun mapFirstLitterToBrandName(firstLetter: String): Int? {
   return when (firstLetter) {
        BrandCategory.Samsung.firstChar -> R.string.samsung
        BrandCategory.IPhone.firstChar -> R.string.iphone
        else -> null
    }
}
