package com.example.phonesbrand.ui.model

import com.example.phonesbrand.domain.model.PhonesDomainModel

fun PhoneUiModel.toDomainModel() = PhonesDomainModel(
    phoneType = this.phoneType ?: "",
    brand = this.brand!!
)