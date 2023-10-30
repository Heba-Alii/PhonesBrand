package com.example.phonesbrand.domain.useCase

import com.example.phonesbrand.domain.repo.PhonesRepoInterface
import retrofit2.Response

class PhonesUseCase(private val phonesRepo: PhonesRepoInterface) {
    suspend fun getPhoneTypeUseCase() = phonesRepo.getPhoneTypeFromRemote()
}