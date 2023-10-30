package com.example.phonesbrand.data.repo

import com.example.phonesbrand.data.dataSource.remote.PhonesRemoteSource
import com.example.phonesbrand.data.model.toDomainModel
import com.example.phonesbrand.domain.model.PhonesDomainModel
import com.example.phonesbrand.domain.repo.PhonesRepoInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

class RepoImpl(private val phonesRemoteSource: PhonesRemoteSource) : PhonesRepoInterface {
    override suspend fun getPhoneTypeFromRemote(): PhonesDomainModel {
        return phonesRemoteSource.getAllPhones().toDomainModel()
    }

}