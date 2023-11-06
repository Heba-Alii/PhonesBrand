package com.example.phonesbrand.data.model

import com.example.phonesbrand.domain.model.PhoneType
import com.example.phonesbrand.domain.model.PhonesDomainModel

//fun PhonesResponse.toDomainModel() = PhonesDomainModel(
//    phoneType = this.phoneType!!,
//    brand = this.brand ?: ""
//)
fun PhonesResponse.toDomainModel(): PhonesDomainModel {
    return if (this.firstChar == 's') {
        PhonesDomainModel(PhoneType.SAMSUNG, "Galaxy")
    } else {
        PhonesDomainModel(PhoneType.IPHONE, "Iphone14Promax")
    }
}