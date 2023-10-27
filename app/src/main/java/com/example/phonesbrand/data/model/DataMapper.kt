package com.example.phonesbrand.data.model

import com.example.phonesbrand.domain.model.PhonesDomainModel

fun PhonesResponse.toDomainModel() = PhonesDomainModel(
    phoneType = this.phoneType!!,
    brand = this.brand ?: ""
)

