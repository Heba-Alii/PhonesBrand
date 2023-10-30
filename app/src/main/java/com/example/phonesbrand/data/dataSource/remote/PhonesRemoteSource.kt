package com.example.phonesbrand.data.dataSource.remote

import com.example.phonesbrand.data.model.PhonesResponse

interface PhonesRemoteSource {
    suspend fun getAllPhones(): PhonesResponse
}