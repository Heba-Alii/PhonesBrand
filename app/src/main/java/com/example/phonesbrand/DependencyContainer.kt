package com.example.phonesbrand

import com.example.phonesbrand.data.dataSource.remote.PhoneApiClient
import com.example.phonesbrand.data.repo.RepoImpl
import com.example.phonesbrand.domain.useCase.PhonesUseCase
import com.example.phonesbrand.ui.util.PhonesViewModelFactory

class DependencyContainer {
    private val phoneApiClient = PhoneApiClient()
    private val phoneRepo = RepoImpl(phoneApiClient)
    private val phoneUseCase = PhonesUseCase(phoneRepo)
    val phonesViewModelFactory = PhonesViewModelFactory(phoneUseCase)

}