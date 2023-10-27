package com.example.phonesbrand.data.repo

import com.example.phonesbrand.data.dataSource.remote.ApiService
import com.example.phonesbrand.data.model.toDomainModel
import com.example.phonesbrand.domain.model.PhonesDomainModel
import com.example.phonesbrand.domain.repo.PhonesRepoInterface

class RepoImpl(private val apiService: ApiService) : PhonesRepoInterface {
    override suspend fun getPhoneTypeFromRemote(): PhonesDomainModel {
        return apiService.getPhoneType().toDomainModel()
    }
}