package com.example.phonesbrand.domain.repo

import com.example.phonesbrand.domain.model.PhonesDomainModel
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface PhonesRepoInterface {
    suspend fun getPhoneTypeFromRemote(): PhonesDomainModel
}