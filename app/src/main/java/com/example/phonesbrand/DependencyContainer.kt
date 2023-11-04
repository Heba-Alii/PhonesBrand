//package com.example.phonesbrand
//
//import com.example.phonesbrand.data.dataSource.remote.PhoneApiClient
//import com.example.phonesbrand.data.repo.RepoImpl
//import com.example.phonesbrand.domain.useCase.PhonesUseCase

//class DependencyContainer {
//     private val phoneApiClient = PhoneApiClient()
//      private val phoneRepo = RepoImpl(phoneApiClient)
//    private val phoneUseCase = PhonesUseCase(phoneRepo)
//    val phonesViewModelFactory = PhonesViewModelFactory(phoneUseCase)
//
//}