package com.example.phonesbrand.domain.useCase

import com.example.phonesbrand.domain.repo.PhonesRepoInterface

class PhonesUseCase(private val phonesRepo: PhonesRepoInterface) {
    suspend fun getPhoneTypeUseCase() = phonesRepo.getPhoneTypeFromRemote()
}