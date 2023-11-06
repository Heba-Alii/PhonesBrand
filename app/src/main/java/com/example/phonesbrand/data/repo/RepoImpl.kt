package com.example.phonesbrand.data.repo

import com.example.phonesbrand.data.dataSource.local.LocalDataSource
import com.example.phonesbrand.data.model.toDomainModel
import com.example.phonesbrand.domain.model.PhonesDomainModel
import com.example.phonesbrand.domain.repo.PhonesRepoInterface
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepoImpl(private val phonesLocalDataSource: LocalDataSource) : PhonesRepoInterface {
    //    override suspend fun getPhoneType(): PhonesDomainModel {
//        return phonesLocalDataSource.getAllPhones().toDomainModel()
//    }
    override suspend fun getPhoneType(): Flow<PhonesDomainModel> {
        val list = mutableListOf<PhonesDomainModel>()
        for (i in phonesLocalDataSource.getPhones())
            list.add(i.toDomainModel())
        return flow {
            for (i in list) {
                delay(1000)
                emit(i)
            }
        }
    }

}