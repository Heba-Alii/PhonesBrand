package com.example.phonesbrand.domain.repo

import com.example.phonesbrand.domain.model.PhonesDomainModel

interface PhonesRepoInterface {
    suspend fun getPhoneTypeFromRemote(): PhonesDomainModel
}