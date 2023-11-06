package com.example.phonesbrand.domain.repo

import com.example.phonesbrand.domain.model.PhonesDomainModel
import kotlinx.coroutines.flow.Flow

interface PhonesRepoInterface {
    suspend fun getPhoneType(): Flow<PhonesDomainModel>
}