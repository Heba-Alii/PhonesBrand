package com.example.phonesbrand.data.dataSource.remote

import com.example.phonesbrand.data.model.PhonesResponse
import kotlinx.coroutines.delay

class PhoneApiClient : PhonesRemoteSource {
    override suspend fun getAllPhones(): PhonesResponse {
        delay(2000)
        val phoneType =
            PhonesResponse("IPhone15", "I")

        return phoneType
    }
}